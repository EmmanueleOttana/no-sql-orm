package it.develhope.nosqlorm.controller;

import it.develhope.nosqlorm.entity.Consumer;
import it.develhope.nosqlorm.repository.RepoConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class ControllerConsumer {
    @Autowired
    private RepoConsumer repoConsumer;

    @PostMapping
    public Consumer createUser(@RequestBody Consumer user){
        return repoConsumer.save(user);
    }
    @GetMapping("/users")
    public List <Consumer> getUsers(){
        return repoConsumer.findAll();
    }


}

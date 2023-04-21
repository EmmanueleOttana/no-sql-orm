package it.develhope.nosqlorm.repository;

import it.develhope.nosqlorm.entity.Consumer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepoConsumer extends MongoRepository<Consumer,String> {


}

package com.marshalmongo.marshalpos.repository;

import com.marshalmongo.marshalpos.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {



    public User findFirstByusername(String username);

    public User findFirstByuserId(String userId);

    @Query("SELECT * FROM USER")
    List<User> findAll();



    public long count();

}
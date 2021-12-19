package com.marshalmongo.marshalpos.repository;

import com.marshalmongo.marshalpos.bean.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {



    public User findFirstByusername(String username);

    public User findFirstByuserId(String userId);

    List<User> findAll();



    public long count();

}
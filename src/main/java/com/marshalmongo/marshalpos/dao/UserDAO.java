package com.marshalmongo.marshalpos.dao;


import com.marshalmongo.marshalpos.model.User;
import com.marshalmongo.marshalpos.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDAO {

    @Autowired
    UserRepository userRepository;



    public User getUserById(String userId){
        return userRepository.findFirstByusername(userId);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

}

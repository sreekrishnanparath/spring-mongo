package com.marshalmongo.marshalpos.services;



import com.marshalmongo.marshalpos.dao.UserDAO;
import com.marshalmongo.marshalpos.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDAO userDAO;


    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public User updateUser(long id, User user) {
        return null;
    }

    @Override
    public void deleteUser(long id) {

    }

    @Override
    public List<User> getAllUser() {
        return userDAO.getAllUsers();
    }

    @Override
    public User getUserById(String userId) {
        return userDAO.getUserById(userId);
    }
}

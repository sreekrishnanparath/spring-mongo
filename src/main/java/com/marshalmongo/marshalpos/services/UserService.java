package com.marshalmongo.marshalpos.services;





import com.marshalmongo.marshalpos.model.User;

import java.util.List;

public interface UserService {

    public User createUser(User user);
    public User updateUser(long id, User user);
    public void deleteUser(long id);
    public List<User> getAllUser();
    public User getUserById(String userId);

}

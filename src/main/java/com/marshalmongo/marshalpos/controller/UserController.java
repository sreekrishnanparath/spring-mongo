package com.marshalmongo.marshalpos.controller;


import com.marshalmongo.marshalpos.exception.NoDataFoundException;
import com.marshalmongo.marshalpos.model.GroceryItem;
import com.marshalmongo.marshalpos.model.User;
import com.marshalmongo.marshalpos.repository.ItemRepository;
import com.marshalmongo.marshalpos.repository.UserRepository;
import com.marshalmongo.marshalpos.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("marshal/user")
public class UserController {


    //@Autowired
    //UserService userService;

    @Autowired
    ItemRepository groceryItemRepo;

    @Autowired
    UserRepository userRepository;

    @GetMapping("/item/{name}")
    private ResponseEntity<GroceryItem> getItem(@PathVariable String name){
        GroceryItem item = groceryItemRepo.findFirstByName(name);
        System.out.println("item##"+item.getCategory());
        return new ResponseEntity<GroceryItem>(item, HttpStatus.FOUND);
    }


    @GetMapping("/username/{username}")
    private ResponseEntity<User> getUserByusername(@PathVariable String username){
        User user = userRepository.findFirstByusername(username);
        if(user==null){
            throw new NoDataFoundException("No User Found");
            //return new ResponseEntity<User>(user, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }

    @PostMapping("/userId/{userId}")
    private ResponseEntity<User> getUserByuserId(@PathVariable String userId){
        System.out.println("userId##"+userId);
        User user = userRepository.findFirstByuserId(userId);
        if(user==null){
            throw new NoDataFoundException("No User Found");
        }
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }

    //@GetMapping("/userlist")
    //private ResponseEntity<List<User>> getAllUsers(){
//        List<User> userList = userService.getAllUser();
//        if(userList==null){
//            throw new NoDataFoundException("No User Found");
//        }
//        return new ResponseEntity<List<User>>(userList, HttpStatus.FOUND);
   // }




}

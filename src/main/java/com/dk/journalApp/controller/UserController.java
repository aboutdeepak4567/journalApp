package com.dk.journalApp.controller;

import com.dk.journalApp.entity.JournalEntry;
import com.dk.journalApp.entity.User;
import com.dk.journalApp.service.UserService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/user/v1")
public class UserController {


    @Autowired
    private UserService userService;


    @GetMapping
    public ResponseEntity<List<User>> getAll() {
        List<User> users = userService.getAll();

        if (users != null && !users.isEmpty()) {
            return ResponseEntity.status(HttpStatus.OK).body(users);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }


    @GetMapping("/id/{myId}")
    public User getById(@PathVariable ObjectId myId){

        return userService.getById(myId).orElse(null);
    }

    @DeleteMapping("/id/{myId}")
    public boolean deleteById(@PathVariable ObjectId myId){
        userService.deleteEntryById(myId);
        return true;
    }

//    @PutMapping("/id/{myId}")
//    public User updateJournalbyId(@PathVariable ObjectId myId,@RequestBody User user){
//        User old = userService.getById(myId).orElse(null);
//            String newTitle = user.getUserName();
//            String newContent = user.getPassword();
//        if(old != null){
//            old.setUserName(newTitle != null && !newTitle.equals(" ") ? user.getUserName() : old.getUserName());
//            old.setPassword(newContent != null && !newContent.equals(" ") ? user.getPassword() : old.getPassword());
//        }
//        userService.saveEntry(old);
//        return old;
//
//    }

    @PutMapping
    public User updateUser(@RequestBody User user){
        User userInDb = userService.findByUsername(user.getUserName());

            String newTitle = user.getUserName();
            String newContent = user.getPassword();
        if(old != null){
            old.setUserName(newTitle != null && !newTitle.equals(" ") ? user.getUserName() : old.getUserName());
            old.setPassword(newContent != null && !newContent.equals(" ") ? user.getPassword() : old.getPassword());
        }
        userService.saveEntry(old);
        return old;

    }








    @PostMapping
    public User createEntry(@RequestBody User user){
        userService.saveEntry(user);
        return user;

    }

}

package com.dk.journalApp.service;

import com.dk.journalApp.entity.JournalEntry;
import com.dk.journalApp.entity.User;
import com.dk.journalApp.repository.JournalEntryRepository;
import com.dk.journalApp.repository.UserRepository;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {


    @Autowired
    private UserRepository userRepository;

    public void deleteEntryById(ObjectId myId) {
         userRepository.deleteById(myId);
    }

    public List<User> getAll(){
        return userRepository.findAll();

    }

    public void saveEntry(User user){
        userRepository.save(user);
    }
    public Optional<User> getById(ObjectId myId){
        return userRepository.findById(myId);
    }

    public User findByUsername(String userName) {

    }
}

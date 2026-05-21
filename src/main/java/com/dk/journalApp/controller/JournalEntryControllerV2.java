package com.dk.journalApp.controller;

import com.dk.journalApp.entity.JournalEntry;
import com.dk.journalApp.service.JournalEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerV2 {


    @Autowired
    private JournalEntryService journalEntryService;

    @GetMapping
    public List<JournalEntry> getAll(){
        return null;
    }


    @GetMapping("/id/{myId}")
    public int getById(@PathVariable Long myId){
        return 5;
    }


    @DeleteMapping("/id/{myId}")
    public JournalEntry deleteById(@PathVariable Long myId){
        return null;
    }


    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry){
        journalEntryService.saveEntry(myEntry);
        return true;

    }

}

package com.dk.journalApp.controller;

import com.dk.journalApp.entity.JournalEntry;
import com.dk.journalApp.service.JournalEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal/v1")
public class JournalEntryControllerV2 {


    @Autowired
    private JournalEntryService journalEntryService;


     @GetMapping
     public List<JournalEntry> getAll(){

        return journalEntryService.getAll();
    }


    @GetMapping("/id/{myId}")
    public JournalEntry getById(@PathVariable ObjectId myId){

        return journalEntryService.getById(myId).orElse(null);
    }

    @DeleteMapping("/id/{myId}")
    public boolean deleteById(@PathVariable ObjectId myId){
        journalEntryService.deleteEntryById(myId);
        return true;
    }

    @PutMapping("/id/{myId}")
    public JournalEntry updateJournalbyId(@PathVariable ObjectId myId,@RequestBody JournalEntry myEntry){
        JournalEntry old = journalEntryService.getById(myId).orElse(null);
            String newTitle = myEntry.getTitle();
            String newContent = myEntry.getContent();
        if(old != null){
            old.setTitle(newTitle != null && !newTitle.equals(" ") ? myEntry.getTitle() : old.getTitle());
            old.setContent(newContent != null && !newContent.equals(" ") ? myEntry.getContent() : old.getContent());
        }
        journalEntryService.saveEntry(old);
        return old;

    }








    @PostMapping
    public JournalEntry createEntry(@RequestBody JournalEntry myEntry){
        myEntry.setDate(LocalDateTime.now());
        journalEntryService.saveEntry(myEntry);
        return myEntry;

    }

}

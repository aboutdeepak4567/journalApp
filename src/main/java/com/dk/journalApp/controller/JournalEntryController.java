//package com.dk.journalApp.controller;
//
//import com.dk.journalApp.entity.JournalEntry;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.HashMap;
//import java.util.*;
//
////@RestController
////@RequestMapping("/journal")
////public class JournalEntryController {
////    private final Map<Long,JournalEntry> journalEntries = new HashMap<>();
////
////    @GetMapping
////    public List<JournalEntry> getAll(){
////        return new ArrayList<>(journalEntries.values());
////    }
////    @GetMapping("/id/{myId}")
////    public JournalEntry getById(@PathVariable Long myId){
////        return journalEntries.get(myId);
////    }
////    @GetMapping("/id/play")
////    public String testId(){
////        return "testing dev tools";
////    }
////    @DeleteMapping("/id/{myId}")
////    public JournalEntry deleteById(@PathVariable Long myId){
////        return journalEntries.remove(myId);
////    }
////    @PostMapping
////    public boolean createEntry(@RequestBody JournalEntry myEntry){
////        journalEntries.put(myEntry.getId(),myEntry);
////        return true;
////
////    }
//
////}
//
//@RestController
//@RequestMapping("/journal")
//public class JournalEntryController{
//
//    private Map<Long,JournalEntry> journalEntries = new HashMap<>();
//
//
//    public Collection getEntries(){
//        return new Collection() {
//        }
//    }
//
//
//
//}

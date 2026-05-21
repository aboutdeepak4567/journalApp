//package com.dk.journalApp.repository;
//
//import com.dk.journalApp.entity.JournalEntry;
//import org.springframework.data.domain.Example;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//import org.springframework.data.repository.query.FluentQuery;
//
//import java.util.List;
//import java.util.Optional;
//import java.util.function.Function;
//
//public class TestRepo implements JournalEntryRepository{
//    @Override
//    public <S extends JournalEntry> S insert(S entity) {
//        return null;
//    }
//
//    @Override
//    public <S extends JournalEntry> List<S> insert(Iterable<S> entities) {
//        return List.of();
//    }
//
//    @Override
//    public <S extends JournalEntry> Optional<S> findOne(Example<S> example) {
//        return Optional.empty();
//    }
//
//    @Override
//    public <S extends JournalEntry> List<S> findAll(Example<S> example) {
//        return List.of();
//    }
//
//    @Override
//    public <S extends JournalEntry> List<S> findAll(Example<S> example, Sort sort) {
//        return List.of();
//    }
//
//    @Override
//    public <S extends JournalEntry> Page<S> findAll(Example<S> example, Pageable pageable) {
//        return null;
//    }
//
//    @Override
//    public <S extends JournalEntry> long count(Example<S> example) {
//        return 0;
//    }
//
//    @Override
//    public <S extends JournalEntry> boolean exists(Example<S> example) {
//        return false;
//    }
//
//    @Override
//    public <S extends JournalEntry, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
//        return null;
//    }
//
//    @Override
//    public <S extends JournalEntry> S save(S entity) {
//        return null;
//    }
//
//    @Override
//    public <S extends JournalEntry> List<S> saveAll(Iterable<S> entities) {
//        return List.of();
//    }
//
//    @Override
//    public Optional<JournalEntry> findById(Long aLong) {
//        return Optional.empty();
//    }
//
//    @Override
//    public boolean existsById(Long aLong) {
//        return false;
//    }
//
//    @Override
//    public List<JournalEntry> findAll() {
//        return List.of();
//    }
//
//    @Override
//    public List<JournalEntry> findAllById(Iterable<Long> longs) {
//        return List.of();
//    }
//
//    @Override
//    public long count() {
//        return 0;
//    }
//
//    @Override
//    public void deleteById(Long aLong) {
//
//    }
//
//    @Override
//    public void delete(JournalEntry entity) {
//
//    }
//
//    @Override
//    public void deleteAllById(Iterable<? extends Long> longs) {
//
//    }
//
//    @Override
//    public void deleteAll(Iterable<? extends JournalEntry> entities) {
//
//    }
//
//    @Override
//    public void deleteAll() {
//
//    }
//
//    @Override
//    public List<JournalEntry> findAll(Sort sort) {
//        return List.of();
//    }
//
//    @Override
//    public Page<JournalEntry> findAll(Pageable pageable) {
//        return null;
//    }
//}

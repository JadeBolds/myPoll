package com.example.myPoll.repository;

import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;

public interface CrudRepositoryImpl<T, ID extends Serializable> extends CrudRepository<T, ID> {
    <S extends T> S save(S entity);
    <S extends T> Iterable<S> save(Iterable<S> entities);

    // Finder Methods
    T findOne(ID id);
    Iterable<T> findAll();
    Iterable<T> findAll(Iterable<ID> ids);

    // Delete Methods
    void delete(ID id);
    void delete(T entity);
    void delete(Iterable<? extends T> entities);
    void deleteAll();

    // Utility Methods
    long count();
    boolean exists(ID id);
}

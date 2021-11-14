package com.example.myPoll.repository;

import com.example.myPoll.domain.Poll;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PollRepository extends CrudRepository<Poll, Long> {
    void delete(Long pollId);

    Poll findOne(Long pollId);
}


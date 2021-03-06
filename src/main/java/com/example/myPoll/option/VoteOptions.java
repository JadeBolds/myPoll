package com.example.myPoll.option;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class VoteOptions {
    @Id
    @GeneratedValue
    @Column(name="OPTION_ID")
    private Long id;
    @Column(name="OPTION_VALUE")
    private String value;
    // Getters and Setters omitted for brevity


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

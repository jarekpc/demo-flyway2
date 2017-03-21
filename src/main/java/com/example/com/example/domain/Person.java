package com.example.com.example.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by zyzakj on 2017-02-27.
 */
@Entity
@Table(name="PERSON")
@Data
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;
}

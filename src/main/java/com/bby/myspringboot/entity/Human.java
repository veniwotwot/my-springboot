package com.bby.myspringboot.entity;

// Importing required classes
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// Annotations
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Human {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int superkey;
    private String fname;
    private String lname;
    private int age;
    private int height_inch;
    private int weight_lb;
}

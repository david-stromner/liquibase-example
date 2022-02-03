package com.example.liquibaseexample;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// Run JPA Buddy to generate a changeset that adds HouseTable to Liquibase, left as an exercise to reader :)
@Entity
public class HouseTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long houseId;
}

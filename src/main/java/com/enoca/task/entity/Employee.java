package com.enoca.task.entity;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lastName;

    @JsonIgnore
    @OneToOne(fetch = FetchType.LAZY)
    private Company company;

    public Employee(String name, String lastName, Company company) {
        this.name = name;
        this.lastName = lastName;
        this.company = company;
    }

    public Employee(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
}

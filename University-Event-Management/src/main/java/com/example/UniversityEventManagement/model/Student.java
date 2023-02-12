package com.example.UniversityEventManagement.model;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class Student {
    private int StudentId;
    private String firstname;
    private String lastname;
    private int age;
    private String dept;
}

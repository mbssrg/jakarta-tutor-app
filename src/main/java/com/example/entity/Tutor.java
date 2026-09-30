package com.example.entity;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tutors")
public class Tutor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String subject;

    public Tutor() {}

    public Tutor(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }
}
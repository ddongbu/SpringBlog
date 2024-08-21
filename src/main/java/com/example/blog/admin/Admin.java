package com.example.blog.admin;

import jakarta.persistence.*;

@Entity
@Table(name="admin_info")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String password;

}

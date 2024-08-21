package com.example.blog.product;


import com.example.blog.user.User;
import jakarta.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Double price;
    private String description;

    @ManyToOne
    @JoinColumn(name = "user_id") // 외래 키로 사용할 컬럼 이름
    private User user;

}

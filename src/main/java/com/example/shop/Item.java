package com.example.shop;

import jakarta.persistence.*;
import lombok.ToString;

@Entity
@ToString
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AutoIncrement와 같음
    public Long id;

    public String title;
    public Integer price; // JPA에선 int 타입을 Integer로 사용하도록 강조함

}

package com.example.model;

import javax.persistence.*;

@Entity(name = "tbl_book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "paginas")
    private int paginas;

    @Column(name = "price")
    private float price;

}

package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "Orden")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "id_user", nullable = true, length = 50)
    private Integer id_user;
    @Column(name = "id_product", nullable = true, length = 50)
    private Integer id_product;
    @Column(name = "date", nullable = true, length = 50)
    private String date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId_user() {
        return id_user;
    }

    public void setId_user(Integer id_user) {
        this.id_user = id_user;
    }

    public Integer getId_product() {
        return id_product;
    }

    public void setId_product(Integer id_product) {
        this.id_product = id_product;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

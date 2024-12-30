package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "barinma")
@Getter
@Setter
public class Barinma {
    @Id
    Long id;

    String il;
    String ilce;
    Integer barinmaAdet;
}

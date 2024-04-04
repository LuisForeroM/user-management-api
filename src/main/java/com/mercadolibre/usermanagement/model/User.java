package com.mercadolibre.usermanagement.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "\"USER\"")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="ID", nullable = false)
    private Integer userId;

    @Column(name="NAME")
    private String userName;

    @Column(name="ACTIVE")
    private String status;
}

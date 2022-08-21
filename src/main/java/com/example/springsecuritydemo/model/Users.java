package com.example.springsecuritydemo.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "\"users\"")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Users implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstName;

    private String lastName;

    @Column(unique = true)
    private String email;

    @Column(nullable = false)
    private String username;

    private String password;

    @ManyToOne
    private Roles role;
}

package com.example.springsecuritydemo.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "\"roles\"")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Roles implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_role;

    @Column(nullable = false)
    private String role_name;

}

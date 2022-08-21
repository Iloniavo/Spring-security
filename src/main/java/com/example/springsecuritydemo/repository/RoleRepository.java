package com.example.springsecuritydemo.repository;

import com.example.springsecuritydemo.model.Roles;
import com.example.springsecuritydemo.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Roles, Long> {


}

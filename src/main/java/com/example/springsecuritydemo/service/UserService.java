package com.example.springsecuritydemo.service;

import  com.example.springsecuritydemo.model.Users;
import com.example.springsecuritydemo.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService   {
    private final UserRepository repository;

    public Optional<Users> getById(Long userId){
        return repository.findById(userId);
    }

    public List<Users> getAll(){
        return repository.findAll();
    }

    @Transactional
    public List<Users> saveAll(List<Users> users){
        return repository.saveAll(users);
    }


}

package com.example.springsecuritydemo.controller;

import com.example.springsecuritydemo.model.Roles;
import com.example.springsecuritydemo.model.Users;
import com.example.springsecuritydemo.repository.RoleRepository;
import com.example.springsecuritydemo.service.PostService;
import com.example.springsecuritydemo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
@CrossOrigin
public class UserController {
    private UserService userService;

    @Autowired
    RoleRepository roleRepository;


    @GetMapping("/")
    public String hello(){
        return "Hello world";
    }

    @GetMapping("/users")
    public List<Users> getUsers(){
        return userService.getAll();
    }

    @GetMapping("/users/{userId}")
    public Optional<Users> getUserById(@PathVariable Long userId){
        return userService.getById(userId);
    }

    @PostMapping("/users")
    public List<Users> saveUsers(@RequestBody List<Users> users){
        return userService.saveAll(users);
    }

    @PostMapping("/adduser")
    public Users addRole(@RequestBody Users user){
        return userService.addUser(user);
    }

    @PostMapping("/addrole")
    public Roles addRole(@RequestBody Roles role){
       return roleRepository.save(role);
    }
}

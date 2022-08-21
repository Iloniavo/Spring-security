package com.example.springsecuritydemo.service;

import com.example.springsecuritydemo.model.Users;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class OtherUserService implements UserDetails {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user =  repository.findByUsername(username);
        return new UserDetailsPrincipal(user);
    }

    public Users addUser (Users user){
        return repository.save(user);
    }
}

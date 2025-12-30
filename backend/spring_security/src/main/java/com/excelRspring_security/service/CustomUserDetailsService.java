package com.excelRspring_security.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.excelRspring_security.entity.User;
import com.excelRspring_security.repository.UserRepo;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepo userRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepo.findByEmail(username)
                .orElseGet(() -> {
                    User newUser = new User();
                    newUser.setEmail(username);
                    newUser.setPassword(""); 
                    newUser.setRole("STUDENT");
                    newUser.setPhone(0);
                    userRepo.save(newUser);
                    return newUser;
                });

        return org.springframework.security.core.userdetails.User.builder()
                .username(user.getEmail())
                .password(user.getPassword())
                .roles(user.getRole()) 
                .build();
    }
}




package com.enigma.kingcaffe_java.service;

import com.enigma.kingcaffe_java.entity.AppUser;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    AppUser loadUserByUserId(String id);
}

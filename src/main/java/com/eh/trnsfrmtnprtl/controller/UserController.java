package com.eh.trnsfrmtnprtl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eh.trnsfrmtnprtl.exception.ResourceNotFoundException;
import com.eh.trnsfrmtnprtl.model.User;
import com.eh.trnsfrmtnprtl.repository.UserRepository;
import com.eh.trnsfrmtnprtl.security.CurrentUser;
import com.eh.trnsfrmtnprtl.security.UserPrincipal;
/**
 * @author   Md. Emran Hossain <emranhos1@gmail.com>
 * @version  1.0.00 EH
 * @since    1.0.00 EH
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/me")
    @PreAuthorize("hasRole('USER')")
    public User getCurrentUser(@CurrentUser UserPrincipal userPrincipal) {
        return userRepository.findById(userPrincipal.getId())
                .orElseThrow(() -> new ResourceNotFoundException("User", "id", userPrincipal.getId()));
    }
}

package com.iceman.controller;

import com.iceman.dao.UserRepository;
import com.iceman.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Iceman
 * 2018/12/27
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping( "/{id}" )
    // @RequestMapping( value = "/{id}", method = RequestMethod.GET )
    public User findById( @PathVariable Long id ) {
        User user = userRepository.findOne( id );
        return user;
    }

}

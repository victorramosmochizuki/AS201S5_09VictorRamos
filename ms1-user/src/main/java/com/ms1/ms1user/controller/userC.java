package com.ms1.ms1user.controller;

import com.ms1.ms1user.model.user;
import com.ms1.ms1user.repository.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

    @RestController
    @RequestMapping("/ms-/user")
    public class userC {

        private repository userR;

        @Autowired
        public userC(repository userR) {
            this.userR = userR;
        }

        @GetMapping("/all")
        Iterable<user> all() {
            return userR.findAll();
        }

        @GetMapping("/{id}")
        user userById(@PathVariable Long id) {
            return userR.findById(id).orElseThrow(() -> new ResponseStatusException(
                    HttpStatus.NOT_FOUND));
        }

        @PostMapping("/save")
        user save(@RequestBody user user) {
            return userR.save(user);
        }

    }

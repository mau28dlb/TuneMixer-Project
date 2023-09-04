package com.example.TuneMixer.Project.controllers;

import com.example.TuneMixer.Project.entities.User;
import com.example.TuneMixer.Project.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
    @RequestMapping("/api/user")
    public class UserController {
        private UserService userService;

        @Autowired
        public UserController(UserService userService){
            this.userService = userService;
        }


        //Create
        @PostMapping("/create")
        public ResponseEntity<String> insertNewUser(@RequestBody User user){
            this.userService.insertUser(user);
            return ResponseEntity.ok().body("Nuovo utente inserito!");
        }

        //Read
        @GetMapping("/retrieve")
        public ResponseEntity<User> retrieveUserById(@RequestParam Long id){
            User user = this.userService.findUserById(id);
            return ResponseEntity.ok().body(user);
        }


        //Update
        @PutMapping("/update")
        public ResponseEntity<User> updateUserById(@RequestBody User user, @RequestParam Long id){
            this.userService.updateUser(id,user);
            return ResponseEntity.ok().body(user);
        }

        //Delete
        @DeleteMapping("/delete")
        public void deleteUser(@RequestParam Long id){
            this.userService.deleteUser(id);
            System.out.println("Utente rimosso");
        }
    }


package com.example.TuneMixer.Project.controllers;

import com.example.TuneMixer.Project.DTO.ArtistaDTO;
import com.example.TuneMixer.Project.DTO.UserDTO;
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
        public UserDTO insertNewUser(@RequestBody UserDTO userDTO){
            return userDTO = userService.insertUser(userDTO);
        }

        //Read
        @GetMapping("/retrieve")
        public ResponseEntity<UserDTO> retrieveUserById(@RequestParam Long id){
            return ResponseEntity.ok().body(userService.findUserById(id));
        }


        //Update
        @PutMapping("/update")
        public ResponseEntity<UserDTO> updateUserById(@RequestBody UserDTO userDTO, @RequestParam Long id){
            userService.updateUser(id,userDTO);
            return ResponseEntity.ok().body(userDTO);
        }

        //Delete
        @DeleteMapping("/delete")
        public ResponseEntity<String> deleteUser(@RequestParam Long id){
            userService.deleteUser(id);
            return ResponseEntity.ok().body("Utente rimosso");
        }
    }


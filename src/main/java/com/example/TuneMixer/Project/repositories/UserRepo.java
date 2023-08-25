package com.example.TuneMixer.Project.repositories;

import com.example.TuneMixer.Project.entities.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepo {
    List<User> UserList = new ArrayList<>();

    public void addUser(User u){
        this.UserList.add(u);
    }
    public void deleteUser(User u){
        this.UserList.removeIf(i -> (i.getId()).equals(u.getId()));
    }

    public void updateUser(User u){
        this.UserList.removeIf(in -> in.getId().equals(u.getId()));
        this.UserList.add(u);
    }

    public List<User> getUserList(){
        return this.UserList;
    }
}

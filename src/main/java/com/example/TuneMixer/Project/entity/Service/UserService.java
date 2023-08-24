package com.example.TuneMixer.Project.entity.Service;

import com.example.TuneMixer.Project.entity.Dao.UserDao;
import com.example.TuneMixer.Project.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserDao userDao;
    @Autowired
    public UserService(UserDao userDao){
        this.userDao = userDao;
    }

    public void addUser(User u) throws Exception{

        if(u == null) {
            throw new IllegalArgumentException("User non può essere null!");
        }
        if(u.getId() == null || u.getId() < 1) {
            throw new IllegalArgumentException("L'Id utente non può essere null o minore di 1!");
        }
        if(u.getNickname() == null || u.getNickname().isEmpty()) {
            throw new IllegalArgumentException("Il nickname utente non può essere null o vuoto!");
        }
        if(u.getPassword() == null || u.getPassword().isEmpty()) {
            throw new IllegalArgumentException("La password non può essere null o vuota!");
        }
        if(u.getPassword().length() < 8) {
            throw new IllegalArgumentException("La password deve contenere almeno 8 caratteri!");
        }
        if(u.getEmail() == null || u.getEmail().isEmpty()) {
            throw new IllegalArgumentException("L'indirizzo Email non può essere null o vuoto!");
        }
        if(!u.getEmail().contains("@")) {
            throw new IllegalArgumentException("Indirizzo Email non valido!");
        }
        userDao.addUser(u);
    }
    public void deleteUser(User u) throws Exception{

        if(u.getId() == null || u.getId() < 1) {
            throw new IllegalArgumentException("L'Id utente non può essere null o minore di 1!");
        }
        userDao.deleteUser(u);
    }

    public void updateUser(User u){
        if(u == null) {
            throw new IllegalArgumentException("User non può essere null!");
        }
        if(u.getId() == null || u.getId() < 1) {
            throw new IllegalArgumentException("L'Id utente non può essere null o minore di 1!");
        }
        if(u.getNickname() == null || u.getNickname().isEmpty()) {
            throw new IllegalArgumentException("Il nickname utente non può essere null o vuoto!");
        }
        if(u.getPassword() == null || u.getPassword().isEmpty()) {
            throw new IllegalArgumentException("La password non può essere null o vuota!");
        }
        if(u.getPassword().length() < 8) {
            throw new IllegalArgumentException("La password deve contenere almeno 8 caratteri!");
        }
        if(u.getEmail() == null || u.getEmail().isEmpty()) {
            throw new IllegalArgumentException("L'indirizzo Email non può essere null o vuoto!");
        }
        if(!u.getEmail().contains("@")) {
            throw new IllegalArgumentException("Indirizzo Email non valido!");
        }
        userDao.updateUser(u);
    }

    public List<User> getUserList() throws Exception{
        if (userDao.getUserList().size() == 0) {
            throw new Exception("Non ci sono utenti!");
        } else {
            return userDao.getUserList();
        }
    }

}

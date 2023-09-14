package com.example.TuneMixer.Project.services;

import com.example.TuneMixer.Project.DTO.ArtistaDTO;
import com.example.TuneMixer.Project.DTO.UserDTO;
import com.example.TuneMixer.Project.entities.Album;
import com.example.TuneMixer.Project.entities.Artista;
import com.example.TuneMixer.Project.entities.User;
import com.example.TuneMixer.Project.repositories.ArtistaRepo;
import com.example.TuneMixer.Project.repositories.UserRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private UserRepo userRepo;
    @Autowired
    public UserService(UserRepo userRepo){
        this.userRepo = userRepo;
    }

    public UserDTO insertUser(UserDTO userDTO){
        User user = new User();
        BeanUtils.copyProperties(userDTO, user);
        user = userRepo.save(user);
        BeanUtils.copyProperties(user, userDTO);
        return userDTO;
    }

    public UserDTO findUserById(Long id){
        User user = userRepo.findById(id).get();
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setNickname(user.getNickname());
        userDTO.setEmail(user.getEmail());
        return userDTO;
    }


    public Optional<User> updateUser(Long id, UserDTO userDTO){
        Optional<User> userDaAggiornare = userRepo.findById(id);
        if(userDaAggiornare.isPresent()){
            userDaAggiornare.get().setNickname(userDTO.getNickname());
            userDaAggiornare.get().setPassword(userDTO.getPassword());
            userDaAggiornare.get().setEmail(userDTO.getEmail());
            userRepo.save(userDaAggiornare.get());
        }else{ return Optional.empty();}
        return userDaAggiornare;
    }

    public void deleteUser(Long id){
        userRepo.deleteById(id);
    }



//    private UserDao userDao;
//    @Autowired
//    public UserService(UserDao userDao){
//        this.userDao = userDao;
//    }
//
//    public void addUser(User u) throws Exception{
//
//        if(u == null) {
//            throw new IllegalArgumentException("User non può essere null!");
//        }
//        if(u.getId() == null || u.getId() < 1) {
//            throw new IllegalArgumentException("L'Id utente non può essere null o minore di 1!");
//        }
//        if(u.getNickname() == null || u.getNickname().isEmpty()) {
//            throw new IllegalArgumentException("Il nickname utente non può essere null o vuoto!");
//        }
//        if(userDao.getUserList().contains(u.getNickname()) ) {
//            throw new IllegalArgumentException("Il nickname è già in uso!");
//        }
//        if(u.getPassword() == null || u.getPassword().isEmpty()) {
//            throw new IllegalArgumentException("La password non può essere null o vuota!");
//        }
//        if(u.getPassword().length() < 8) {
//            throw new IllegalArgumentException("La password deve contenere almeno 8 caratteri!");
//        }
//        if(u.getEmail() == null || u.getEmail().isEmpty()) {
//            throw new IllegalArgumentException("L'indirizzo Email non può essere null o vuoto!");
//        }
//        if(!u.getEmail().contains("@")) {
//            throw new IllegalArgumentException("Indirizzo Email non valido!");
//        }
//        userDao.addUser(u);
//    }
//    public void deleteUser(User u) throws Exception{
//
//        if(u.getId() == null || u.getId() < 1) {
//            throw new IllegalArgumentException("L'Id utente non può essere null o minore di 1!");
//        }
//        userDao.deleteUser(u);
//    }
//
//    public void updateUser(User u){
//        if(u == null) {
//            throw new IllegalArgumentException("User non può essere null!");
//        }
//        if(u.getId() == null || u.getId() < 1) {
//            throw new IllegalArgumentException("L'Id utente non può essere null o minore di 1!");
//        }
//        if(u.getNickname() == null || u.getNickname().isEmpty()) {
//            throw new IllegalArgumentException("Il nickname utente non può essere null o vuoto!");
//        }
//        if(userDao.getUserList().contains(u.getNickname()) ) {
//            throw new IllegalArgumentException("Il nickname è già in uso!");
//        }
//        if(u.getPassword() == null || u.getPassword().isEmpty()) {
//            throw new IllegalArgumentException("La password non può essere null o vuota!");
//        }
//        if(u.getPassword().length() < 8) {
//            throw new IllegalArgumentException("La password deve contenere almeno 8 caratteri!");
//        }
//        if(u.getEmail() == null || u.getEmail().isEmpty()) {
//            throw new IllegalArgumentException("L'indirizzo Email non può essere null o vuoto!");
//        }
//        if(!u.getEmail().contains("@")) {
//            throw new IllegalArgumentException("Indirizzo Email non valido!");
//        }
//        userDao.updateUser(u);
//    }
//
//    public List<User> getUserList() throws Exception{
//        if (userDao.getUserList().size() == 0) {
//            throw new Exception("Non ci sono utenti!");
//        } else {
//            return userDao.getUserList();
//        }
//    }

}

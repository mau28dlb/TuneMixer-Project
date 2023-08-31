package com.example.TuneMixer.Project.repositories;

import com.example.TuneMixer.Project.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {}


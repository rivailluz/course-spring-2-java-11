package com.educandos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandos.course.entities.User;

public interface UserRespository extends JpaRepository<User,Long>{

}

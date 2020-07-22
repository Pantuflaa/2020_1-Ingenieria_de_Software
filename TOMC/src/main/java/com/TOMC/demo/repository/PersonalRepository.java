package com.TOMC.demo.repository;

import java.io.Serializable;
import java.util.List;

import com.TOMC.demo.entity.Personal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("repositorypersonal")
public interface PersonalRepository extends JpaRepository<Personal, Serializable>{
    
    public abstract Personal findById(long id);

    public abstract List<Personal> findAll();

}
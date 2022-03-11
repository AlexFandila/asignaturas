package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.repository.entity.Asignatura;

public interface EmpleadoRepoJPA extends JpaRepository<Asignatura, Integer>{

}

package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.EmpleadoRepoJPA;
import com.example.demo.repository.entity.Asignatura;
import com.example.demo.service.AsignaturaService;

@Service
public class AsignaturaServiceImpl implements AsignaturaService{
	
	@Autowired
	EmpleadoRepoJPA empleadoRepo;

	@Override
	public List<Asignatura> listarAsignaturas() {
		// TODO Auto-generated method stub
		return empleadoRepo.findAll();
	}

	@Override
	public void crearAsignatura(Asignatura asignatura) {
		// TODO Auto-generated method stub
		empleadoRepo.save(asignatura);

	}




}

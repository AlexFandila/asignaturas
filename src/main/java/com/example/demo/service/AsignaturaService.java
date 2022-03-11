package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.entity.Asignatura;

public interface AsignaturaService {
	public List<Asignatura> listarAsignaturas();
	public void crearAsignatura(Asignatura asignatura);
}

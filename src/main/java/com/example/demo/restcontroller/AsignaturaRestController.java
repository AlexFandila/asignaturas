package com.example.demo.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.entity.Asignatura;
import com.example.demo.service.AsignaturaService;
import com.example.demo.service.impl.AsignaturaServiceImpl;

@RestController
@RequestMapping("/api/asignaturas")
public class AsignaturaRestController {
	
	@Autowired
	AsignaturaServiceImpl asignaturaService;
	
	@GetMapping
	@Cacheable(value = "asignaturas")
	public List<Asignatura> listarEmpleados() {
		return asignaturaService.listarAsignaturas();
	}
	
	@PostMapping
	@CacheEvict(allEntries = true, value = "asignaturas")
	public void crearAsignatura(@RequestBody Asignatura asignatura) {
		asignaturaService.crearAsignatura(asignatura);
	}
}

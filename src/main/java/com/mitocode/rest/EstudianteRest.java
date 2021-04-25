package com.mitocode.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mitocode.model.Estudiante;

@RestController
@RequestMapping("/api/estudiantes")
public class EstudianteRest {
	
	private static List<Estudiante> lista = new ArrayList<Estudiante>();
	
	static {
		Estudiante e1 = new Estudiante(1L, "Perez", "Juan", 22);
		Estudiante e2 = new Estudiante(1L, "Cenas", "Dany", 22);
		
		lista.add(e1);
		lista.add(e2);
	}
	
	@GetMapping
	public List<Estudiante> listarTodos(){
		return lista;
	}
	
	@GetMapping("/{nombres}")
	public Estudiante listarPorNombres(@PathVariable String nombres){
		return lista.stream().filter(e -> e.getNombres().equals(nombres)).findFirst().orElse(null);
	}
	
	@PostMapping
	public void insertar(@RequestBody Estudiante estudiante) {
		lista.add(estudiante);
	}

}

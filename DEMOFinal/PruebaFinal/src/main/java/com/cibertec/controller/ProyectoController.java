package com.cibertec.controller;


import com.cibertec.model.Paciente;
import com.cibertec.repository.PacienteRepository;
import com.cibertec.servicio.PacienteServicio;

import java.io.FileNotFoundException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping ("/Paciente")
public class ProyectoController {
	  @Autowired
	    private PacienteServicio pacienteServicio;
	  
	  @GetMapping("/registrar")
	    public String mostrarFormularioRegistro(Model model) {
	        model.addAttribute("paciente", new Paciente()); 
	        return "registrar"; 
	    }
	
	    @PostMapping("/registrar")
	    public ResponseEntity<Paciente> registrarPaciente(@ModelAttribute Paciente paciente) {
	        Paciente nuevoPaciente = pacienteServicio.registrarPaciente(paciente);
	        return new ResponseEntity<>(nuevoPaciente, HttpStatus.CREATED);
	    }

	    @GetMapping("/listar")
	    public String listarPacientes(Model model) {
	        List<Paciente> pacientes = pacienteServicio.listarPacientes();
	        model.addAttribute("pacientes", pacientes);
	        return "listar";
	    }
	  
	    

	   
	   
	
}

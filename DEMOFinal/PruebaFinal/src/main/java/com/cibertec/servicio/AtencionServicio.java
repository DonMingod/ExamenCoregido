package com.cibertec.servicio;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.model.Atencion;
import com.cibertec.repository.AtencionRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class AtencionServicio {
	  @Autowired
	    private AtencionRepository atencionRepository;

	    public Atencion registrarAtencion(Atencion atencion) {
	        return atencionRepository.save(atencion);
	    }

	    public List<Atencion> listarAtenciones() {
	        return atencionRepository.findAll();
	    }
	    
}

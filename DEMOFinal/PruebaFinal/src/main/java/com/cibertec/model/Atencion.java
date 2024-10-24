package com.cibertec.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name ="Atencion")
public class Atencion {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id; 
	private String Atencion;
	 private String diagnostico;
	
	    @OneToOne 
	    private Paciente paciente ;
	    

		public Long getId() {
			return Id;
		}

		public void setId(Long id) {
			Id = id;
		}

		public String getAtencion() {
			return Atencion;
		}

		public void setAtencion(String atencion) {
			Atencion = atencion;
		}

		public String getDiagnostico() {
			return diagnostico;
		}

		public void setDiagnostico(String diagnostico) {
			this.diagnostico = diagnostico;
		}

		public Paciente getPaciente() {
			return paciente;
		}

		public void setPaciente(Paciente paciente) {
			this.paciente = paciente;
		} 

}

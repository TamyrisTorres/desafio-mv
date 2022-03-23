package com.example.desafiomv.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cafe")
public class Cafe implements Serializable {

	public Cafe() {

	}

	public Cafe(String colaborador, String cpf, String comida) {
		super();
		this.colaborador = colaborador;
		this.cpf = cpf;
		this.comida = comida;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_CAFE", nullable = false, unique = true)
	private long idCafe;

	@Column(name = "COLABORADOR", nullable = false, unique = true)
	private String colaborador;

	@Column(name = "CPF", nullable = false, unique = true)
	private String cpf;

	@Column(name = "COMIDA", nullable = false, unique = true)
	public String comida;

}

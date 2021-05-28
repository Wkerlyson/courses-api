package com.course.module.postgres.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "cursos_setor", schema = "pessoal")
public class Course implements Serializable {
	
	private static final long serialVersionUID = -1075419521693209775L;
	
	@Id
	@Basic(optional = false)
	@Column(name = "id_curso")
	@SequenceGenerator(allocationSize = 1, sequenceName = "seq_curso_setor", name = "seq_curso_setor")
	@GeneratedValue(generator = "seq_curso_setor", strategy = GenerationType.SEQUENCE)
	private Integer idCurso;
	
}
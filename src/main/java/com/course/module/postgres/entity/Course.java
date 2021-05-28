package com.course.module.postgres.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cursos_setor", schema = "pessoal")
public class Course implements Serializable {
	
	private static final long serialVersionUID = -1075419521693209775L;
	
}
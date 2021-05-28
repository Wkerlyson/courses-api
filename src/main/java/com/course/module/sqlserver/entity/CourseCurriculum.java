package com.course.module.sqlserver.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "GradesCurriculares", schema = "dbo")
public class CourseCurriculum implements Serializable {
	
	private static final long serialVersionUID = -1075419521693209775L;
	
	@Id
	@Column(name = "CD_CURSO")
	private Long id;
	
}
package com.course.module.sqlserver.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "GradesCurriculares", schema = "dbo")
public class CourseCurriculum implements Serializable {
	
	private static final long serialVersionUID = -1075419521693209775L;
	
}
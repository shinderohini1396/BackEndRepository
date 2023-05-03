package com.cjc.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Student {

	@Id
	private int id;
	private String name;
	private String addr;
}

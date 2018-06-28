package com.edoardo.test.ejb.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	public String id;
	public String name;
	public String surname;
	public String email;
}

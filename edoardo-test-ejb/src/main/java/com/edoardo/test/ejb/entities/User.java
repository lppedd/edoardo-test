package com.edoardo.test.ejb.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	public String id;
	public String name;
	public String surname;
	public String email;
}

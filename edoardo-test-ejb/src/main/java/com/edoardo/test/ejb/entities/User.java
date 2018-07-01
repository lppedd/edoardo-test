package com.edoardo.test.ejb.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	public long id;
	public String name;
	public String surname;
	public Date birthday;
}

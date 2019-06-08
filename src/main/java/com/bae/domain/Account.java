package com.bae.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Account {

	// attributes
	@Id
	@GeneratedValue
	private int id;
	private String name;

	// instantiate task collection
	@OneToMany(cascade = CascadeType.PERSIST) // declare one to many relationship
	@JoinColumn(name = "Account_id")
	// must be a collection for one to many to work
	Set<Task> tasklist = new HashSet<Task>();

	// constructor
	public Account() {
	}

	// getters and setters
	public int getId() {
		return id;
	}

	public Set<Task> getTasklist() {
		return tasklist;
	}

	public void setTasklist(Set<Task> tasklist) {
		this.tasklist = tasklist;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

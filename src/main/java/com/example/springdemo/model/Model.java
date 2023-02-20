package com.example.springdemo.model;

public class Model {
	private int id;
	private String name;
	public Model() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Model(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
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
	@Override
	public String toString() {
		return "Model [id=" + id + ", name=" + name + "]";
	}

}

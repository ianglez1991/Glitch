package com.proyectofinal.model;

public class Proyecto {
	private int idProject;
	private float rating;
	private String projectName;
	private String description;
	private String category;
	private String objective;
	private String registerDate;

	public Proyecto() {

	}

	public Proyecto(int idProyecto, float rating, String projectName, String description, String category,
			String objective, String registerDate) {
		setIdProject(idProject);
		setRating(rating);
		setProjectName(projectName);
		setDescription(description);
		setCategory(category);
		setObjective(objective);
		setRegisterDate(registerDate);
	}

	public int getIdProject() {
		return idProject;
	}

	public void setIdProject(int idProject) {
		this.idProject = idProject;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getObjective() {
		return objective;
	}

	public void setObjective(String objective) {
		this.objective = objective;
	}

	public String getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}

	public String toString() {
		return "Id Project: " + getIdProject() + " Rating: " + getRating() + " Project Name: " + getProjectName()
				+ " Description: " + getDescription() + " Category: " + getCategory() + " Objective: " + getObjective()
				+ " Register Date: " + getRegisterDate();
	}
}

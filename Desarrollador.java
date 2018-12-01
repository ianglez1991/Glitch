package com.proyectofinal.model;

public class Desarrollador {
	private int idDeveloper;
	private String name;
	private String nickname;
	private String email;
	private String birthDate;
	private String gender;
	private String country;

	public Desarrollador() {

	}

	public Desarrollador(int idDeveloper, String name, String nickname, String email, String birthDate, String gender,
			String country) {
		setIdDeveloper(idDeveloper);
		setName(name);
		setNickname(nickname);
		setEmail(email);
		setBirthDate(birthDate);
		setGender(gender);
		setCountry(country);
	}

	public int getIdDeveloper() {
		return idDeveloper;
	}

	public void setIdDeveloper(int idDeveloper) {
		this.idDeveloper = idDeveloper;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String toString() {
		return "Id Developer: " +getIdDeveloper()+" Name: "+getName()+" Nickname: "+getNickname()+" Email: "+getEmail()
				+" Birth Date: " +getBirthDate()+" Gender: " +getGender()+" Country: "+getCountry();
	}
}

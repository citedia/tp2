package fr.istic.tpjpa.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;











import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity

public class Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5336257879567529124L;

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id;


	
@ManyToMany(cascade={CascadeType.ALL})
private List<Person> friends = new ArrayList<Person>();
@OneToMany(mappedBy = "person", cascade = CascadeType.PERSIST)
private List<ElectronicDevice> devices = new ArrayList<ElectronicDevice>();
@OneToMany(mappedBy = "person", cascade = CascadeType.PERSIST)
private List<Home> homes = new ArrayList<Home>();
@Column( name = "NOM")
private String nom="ss";
private String prenom="dd";
private String email="";
private int age=0;
private String genre="";
private String profilFacebook="";
private Date dateNaissance;


/*
private Person person;
*/

public List<Person> getFriends() {
	return friends;
}


public void setFriends(List<Person> friends) {
	this.friends = friends;
} 




public List<ElectronicDevice> getDevices() {
	return devices;
}


public void setDevices(List<ElectronicDevice> devices) {
	this.devices = devices;
}


public List<Home> getHomes() {
	return homes;
}


public void setHomes(List<Home> homes) {
	this.homes = homes;
}


public String getNom() {
	return nom;
}


public void setNom(String nom) {
	this.nom = nom;
}


public String getPrenom() {
	return prenom;
}


public void setPrenom(String prenom) {
	this.prenom = prenom;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public int getAge() {
	return age;
}


public void setAge(int age) {
	this.age = age;
}


public String getGenre() {
	return genre;
}


public void setGenre(String genre) {
	this.genre = genre;
}


public String getProfilFacebook() {
	return profilFacebook;
}


public void setProfilFacebook(String profilFacebook) {
	this.profilFacebook = profilFacebook;
}


public Date getDateNaissance() {
	return dateNaissance;
}


public void setDateNaissance(Date dateNaissance) {
	this.dateNaissance = dateNaissance;
}


public Long getId() {
	return id;
}


public void setId(Long id) {
	this.id = id;
}



}

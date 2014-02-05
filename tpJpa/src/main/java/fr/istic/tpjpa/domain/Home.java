package fr.istic.tpjpa.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;









import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity

public class Home implements Serializable{
	
	
	@OneToMany(mappedBy = "home", cascade = CascadeType.PERSIST)
	private List<Heater> heaters = new ArrayList<Heater>();
	

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1146361349691039471L;
	private String adresse="";
	private String superficie="";
	private String ip="";
	
	@Id
    @GeneratedValue
	private Long id;

	@ManyToOne
	private Person person;
	public List<Heater> getHeaters() {
		return heaters;
	}

	public void setHeaters(List<Heater> heaters) {
		this.heaters = heaters;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getSuperficie() {
		return superficie;
	}

	public void setSuperficie(String superficie) {
		this.superficie = superficie;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}

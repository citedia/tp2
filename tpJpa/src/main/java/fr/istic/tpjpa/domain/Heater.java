package fr.istic.tpjpa.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Heater implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2093300396991507627L;
	@Id
    @GeneratedValue
	private Long id;


    public Long getId() {

        return id;

    }

    public void setId(Long id) {
       this.id = id;
    }
    
    @ManyToOne
	private Home home;

}

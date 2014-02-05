package fr.istic.tpjpa.domain;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity

public class SmartDevice implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8699388922294152372L;
	
	@Id
    @GeneratedValue
	private Long id;


    public Long getId() {

        return id;

    }

    public void setId(Long id) {
    	   this.id = id;
    }

}

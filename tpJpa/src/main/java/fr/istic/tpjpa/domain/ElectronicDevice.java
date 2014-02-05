package fr.istic.tpjpa.domain;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity

public class ElectronicDevice   {

	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;

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
    private Person person;
}

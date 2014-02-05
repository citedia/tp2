package fr.istic.tpjpa.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import fr.istic.tpjpa.domain.Home;
import fr.istic.tpjpa.domain.Person;

public class JpaTest {

	private EntityManager manager;

	public JpaTest(EntityManager manager) {
		this.manager = manager;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("example");
		EntityManager manager = factory.createEntityManager();
		JpaTest test = new JpaTest(manager);

		
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		
		
		
		Person p  = new Person();
		p.setNom("toto");
		Person p2  = new Person();
		p2.setNom("ttitsssssi");
		Home h =new Home();
		Person p3  = new Person();
		p3.setNom("riri");
		List<Person> amis = new ArrayList<Person>();
		amis.add(p3);
		amis.add(p2);
		p.setFriends(amis);
		List<Home> homes = new ArrayList<Home>();
		homes.add(h);
		p.setHomes(homes);
	
		manager.persist(p);
		p.setNom("tossssto");
		// TODO persist entity

		tx.commit();

		test.getPerson();
		
				//manager.close();
		
		// TODO run request

		System.out.println(".. done");
	}
	
	public void getPerson(){
			List<Person> resultList =  (List<Person>) manager.createQuery("Select a From Person a", Person.class).getResultList();
				for (Person next : resultList) {
		            System.out.println("next person: " + next.getNom());
		        }
	}

}

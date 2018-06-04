package Aplicativo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		// criando pessoa e salvando no banco de dados via JPA e Hibernate
		/* Pessoa p1 = new Pessoa(null,"Renato","renato@gmail.com");
		Pessoa p2 = new Pessoa(null,"Francele","fran@gmail.com");
		Pessoa p3 = new Pessoa(null,"Paulo","paulo@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();*/
		
		
		// buscando informacoes do banco de dados. 
		/*EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		Pessoa p = em.find(Pessoa.class, 2);
		System.out.println(p);*/
		
		// Remover registro do banco de dados
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		Pessoa p = em.find(Pessoa.class, 2);
		
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		
		em.close();
		emf.close();

		System.out.println("pronto");

	}

}

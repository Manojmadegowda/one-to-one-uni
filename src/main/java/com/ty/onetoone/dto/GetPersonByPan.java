package com.ty.onetoone.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetPersonByPan {
	public static void main(String[] args) {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("manoj");
			EntityManager entityManager =entityManagerFactory.createEntityManager();
			Pan pan=entityManager.find(Pan.class, 1);
			Person person=pan.getPerson();
			System.out.println("pan number  "+pan.getPanNumber());
			System.out.println("country  "+pan.getCountry());
			System.out.println("Date  "+pan.getCurentdate());
			System.out.println("person Details");
			System.out.println("Name  "+person.getName());
			System.out.println("contact number  "+person.getPhone());
			System.out.println("gender "+person.getGender());
			
	}

}

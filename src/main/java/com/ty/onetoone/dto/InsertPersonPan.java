package com.ty.onetoone.dto;

import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertPersonPan {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("manoj");
		EntityManager entityManager =entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		Person person=new Person();
		person.setName("anatharama");
		person.setPhone(90684845);
		person.setGender("male");
		Pan pan =new Pan();
		pan.setPanNumber(1233);
		pan.setCountry("India");
		pan.setCurentdate(LocalDateTime.now());
		pan.setPerson(person);
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(pan);
		entityTransaction.commit();

}
}
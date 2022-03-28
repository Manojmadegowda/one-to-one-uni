package com.ty.onetoone.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Insert {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("manoj");
		EntityManager entityManager =entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		Branch branch = new Branch();
		branch.setName("jsp");
		branch.setPhone(96889955);
		Address address = new Address();
		address.setArea("basavanagudi");
		address.setPin(560078);
		address.setState("karnataka");
		branch.setAddress(address);
		entityTransaction.begin();
		entityManager.persist(branch);
		entityManager.persist(address);
		entityTransaction.commit();
	}

}

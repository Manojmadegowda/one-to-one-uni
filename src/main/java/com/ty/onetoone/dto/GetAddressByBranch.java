package com.ty.onetoone.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GetAddressByBranch {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("manoj");
		EntityManager entityManager =entityManagerFactory.createEntityManager();
		Branch branch =entityManager.find(Branch.class,1);
		Address address =branch.getAddress();
		System.out.println("Branch name  "+branch.getName());
		System.out.println("Branch contact  "+branch.getPhone());
		System.out.println("Branch address");
		System.out.println("area  "+address.getArea());
		System.out.println("Pin  "+address.getPin());
		System.out.println("state  "+address.getState());
	}

}

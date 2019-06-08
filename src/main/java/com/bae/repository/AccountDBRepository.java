package com.bae.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bae.domain.Account;

public class AccountDBRepository {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
	EntityManager manager = emf.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();

	// CREATE
	public Account create(Account account) {
		transaction.begin();
		manager.persist(account);
		account.setName("Chris");
		transaction.commit();
		return account;
	}
	// READ
	// manager.find();

	// UPDATE
	public Account update(int id) {
		transaction.begin();
		Account returned = manager.find(Account.class, id);
		returned.setName("Lucy");
		transaction.commit();
		return returned;
	}
	// DELETE
	// manager.delete();

}

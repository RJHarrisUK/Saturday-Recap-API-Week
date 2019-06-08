package com.bae.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.bae.domain.Account;

public class AccountDBRepository {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory(null);
	EntityManager manager = emf.createEntityManager();

	// C
	public Account create(Account account) {
		manager.persist(account);
		return account;
	}

}

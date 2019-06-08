package com.bae;

import com.bae.domain.Account;
import com.bae.domain.Task;
import com.bae.repository.AccountDBRepository;

public class App {

	// this would all go in a test normally instead of a main method (this is just to go through in a learning environment)
	public static void main(String[] args) {
		
		Account a = new Account();
		a.setName("Danny");
		
		Task t = new Task();
		t.setTodo("work");
		a.getTasklist().add(t);
		
		AccountDBRepository db = new AccountDBRepository();
		// call the method in the DB repo to persist the account.
		db.create(a);
		db.update(10);
	}
	
}

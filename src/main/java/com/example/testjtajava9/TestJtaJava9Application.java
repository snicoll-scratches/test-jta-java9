package com.example.testjtajava9;

import javax.transaction.Transaction;
import javax.transaction.TransactionManager;

import bitronix.tm.BitronixTransactionManager;
import bitronix.tm.Configuration;
import bitronix.tm.TransactionManagerServices;

public class TestJtaJava9Application {

	private final TransactionManager transactionManager;

	public TestJtaJava9Application(TransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}

	public TransactionManager getTransactionManager() {
		return this.transactionManager;
	}

	static TestJtaJava9Application create() {
		Configuration conf = TransactionManagerServices.getConfiguration();
		conf.setServerId("my-server");
		return new TestJtaJava9Application(TransactionManagerServices.getTransactionManager());
	}

	public static void main(String[] args) {
		create();
	}
}

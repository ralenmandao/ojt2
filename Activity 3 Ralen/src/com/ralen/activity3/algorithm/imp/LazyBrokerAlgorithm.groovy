package com.ralen.activity3.algorithm.imp

import com.ralen.activity3.algorithm.LoanBrokerAlgorithm
import com.ralen.activity3.model.BankQoute
import com.ralen.activity3.model.Customer
import com.ralen.di.annotation.Bean

@Bean("lazyBrokerAlgorithm")
class LazyBrokerAlgorithm implements LoanBrokerAlgorithm{

	@Override
	public boolean isAccepted(Customer c, BankQoute b) {
		return false;
	}

}

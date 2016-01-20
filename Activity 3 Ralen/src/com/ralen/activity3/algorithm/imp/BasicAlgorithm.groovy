package com.ralen.activity3.algorithm.imp

import com.ralen.activity3.algorithm.LoanBrokerAlgorithm
import com.ralen.activity3.model.BankQoute
import com.ralen.activity3.model.Customer
import com.ralen.di.annotation.Bean
import com.ralen.di.annotation.Inject

@Bean("basicAlgorithm")
class BasicAlgorithm implements LoanBrokerAlgorithm{

	@Inject("maxYear")
	int maxYear
	
	@Override
	public boolean isAccepted(Customer c, BankQoute b) {
		if(c.term > maxYear) return false
		return true;
	}

}

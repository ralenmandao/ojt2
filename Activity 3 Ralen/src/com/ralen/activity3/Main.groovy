package com.ralen.activity3

import com.ralen.activity3.service.LoanBrokerService
import com.ralen.di.ApplicationContext
import com.ralen.di.ApplicationContextImp

class Main{
	static void main(args){
		ApplicationContext context = new ApplicationContextImp("com.ralen.activity3");
		LoanBrokerGUI gui = context.getBean(LoanBrokerGUI.class)
		gui.show();
	}
}

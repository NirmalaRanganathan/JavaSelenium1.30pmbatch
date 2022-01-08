package org.base;

import org.sample.CompanyInfo;

public class ClientInfo extends  CompanyInfo {//child class

	private void clientId() {
    System.out.println("Clint Id is = 89765");
    
	}

	private void clientName() {
	System.out.println("client Name is = Hexa");

}
public static void main(String[] args) {
	
	//ClassName objectName = new ClassName();
	ClientInfo o = new ClientInfo();
	//objectName.methodName();
	o.clientId();
	o.clientName();
	o.compId();
	o.compname();
	o.EmpId();
	o.EmpName();
	
	
	}
}
	
	
	

		
		
	



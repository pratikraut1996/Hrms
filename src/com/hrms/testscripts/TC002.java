package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC002 {
	@Test
	
	public void tc002(){
		//public void main (String args[]) { 
		DOMConfigurator.configure("log4j.xml");	
	General obj =new General();
	obj.openApplication();
	obj.login();
	obj.enterFrame();
	obj.AddNewEmp();
	obj.exitFrame();
	obj.logout();
	obj.closeApplication();
}
}

package com.back.testcases;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class demooo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BasicConfigurator.configure();
Logger log=Logger.getLogger("projrctt");
PropertyConfigurator.configure("log4j2.xml");

log.debug("this is debug");
log.info("this is info");
log.error("this is error");
log.warn("this is wwarn");
log.trace("this is trace");
	}

}

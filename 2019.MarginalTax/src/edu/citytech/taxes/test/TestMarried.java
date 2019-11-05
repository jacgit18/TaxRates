package edu.citytech.taxes.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import edu.citytech.taxes.service.MarginalTax;
import gov.irs.marignal.taxrate.ICalculate;
import gov.irs.marignal.taxrate.Status;

class TestMarried {

	@Test
	@DisplayName("Test for married people 19400k")
	void test() {
		
		ICalculate tax = new MarginalTax();
		float taxPaid = tax.getTaxRate(Status.MARRIED, 2019, 19_400);
		boolean status = taxPaid == 1940;
		
		assertTrue(status, "1940 was expected wrong value " + taxPaid);
	}
	
	@Test
	@DisplayName("Test for married people 300000k")
	void test2() {
		
		ICalculate tax = new MarginalTax();
		float taxPaid = tax.getTaxRate(Status.MARRIED, 2019, 300_000);
		boolean status = taxPaid == 60_349;
		
		assertTrue(status, "60,349 was expected wrong value " + taxPaid);
	}
	
	@Test
	@DisplayName("Test for married people 1mil")
	void test3() {
		
		ICalculate tax = new MarginalTax();
		float taxPaid = tax.getTaxRate(Status.MARRIED, 2019, 1_000_000);
		boolean status = taxPaid == 308_140;
		
		assertTrue(status, "308_140 was expected wrong value " + taxPaid);
	}
	


}

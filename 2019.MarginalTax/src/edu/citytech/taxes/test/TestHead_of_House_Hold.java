package edu.citytech.taxes.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import edu.citytech.taxes.service.MarginalTax;
import gov.irs.marignal.taxrate.ICalculate;
import gov.irs.marignal.taxrate.Status;

class TestHead_of_House_Hold {


	@Test
	@DisplayName("Test for Head of HouseHold people 1 Milllion")
	void test() {
		
		ICalculate tax = new MarginalTax();
		float taxPaid = tax.getTaxRate(Status.HEAD_OF_HOUSE_HOLD, 2019, 1_000_000);
		boolean status = taxPaid == 333_625;
		
		assertTrue(status, "333_625 was expected wrong value " + taxPaid);
	}
	
	


}

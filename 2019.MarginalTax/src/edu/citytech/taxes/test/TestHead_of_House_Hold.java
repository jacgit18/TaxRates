package edu.citytech.taxes.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import edu.citytech.taxes.service.MarginalTax;
import gov.irs.marignal.taxrate.ICalculate;
import gov.irs.marignal.taxrate.Status;

class TestHead_of_House_Hold {

	@Test
	@DisplayName("test for people who are head of house hold making 900k") // generates name for test name is junit report
	void test() {

		ICalculate tax = new MarginalTax();
		float taxPaid = tax.getTaxRate(Status.HEAD_OF_HOUSE_HOLD, 2019, 9_000);
		boolean status = taxPaid == 900;
		assertTrue(status, "900 was expected wrong values" + taxPaid);// assert produce junit report
	}
	
	@Test
	@DisplayName("test for single people who are head of house hold making 1000k") // generates name for test name is junit report
	void test2() {

		ICalculate tax = new MarginalTax();
		float taxPaid = tax.getTaxRate(Status.HEAD_OF_HOUSE_HOLD, 2019, 10_000);
		boolean status = taxPaid == 1006;
		assertTrue(status, "1006 was expected wrong values" + taxPaid);// assert produce junit report
	}
	
	@Test
	@DisplayName("test for single people who are head of house hold making 10") // generates name for test name is junit report
	void test3() {

		ICalculate tax = new MarginalTax();
		float taxPaid = tax.getTaxRate(Status.HEAD_OF_HOUSE_HOLD, 2019, 10);
		boolean status = taxPaid == 1;
		assertTrue(status, "1 was expected wrong values" + taxPaid);// assert produce junit report
	}
	
	@Test
	@DisplayName("test for single people who are head of house hold making 150,000") // generates name for test name is junit report
	void test4() {

		ICalculate tax = new MarginalTax();
		float taxPaid = tax.getTaxRate(Status.HEAD_OF_HOUSE_HOLD, 2019, 150_000);
		boolean status = taxPaid == 30_174.50;
		assertTrue(status, "30_174.50 was expected wrong values" + taxPaid);// assert produce junit report
	}
	
	


}

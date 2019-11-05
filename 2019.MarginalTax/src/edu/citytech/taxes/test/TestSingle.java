package edu.citytech.taxes.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import edu.citytech.taxes.service.MarginalTax;
import gov.irs.marignal.taxrate.ICalculate;
import gov.irs.marignal.taxrate.Status;

class TestSingle {

	@Test
	@DisplayName("test for single people 900k") // generates name for test name is junit report
	void test() {

		ICalculate tax = new MarginalTax();
		float taxPaid = tax.getTaxRate(Status.SINGLE, 2019, 9_000);
		boolean status = taxPaid == 900;
		assertTrue(status, "900 was expected wrong values" + taxPaid);// assert produce junit report
	}
	
	@Test
	@DisplayName("test for single people 1000k") // generates name for test name is junit report
	void test2() {

		ICalculate tax = new MarginalTax();
		float taxPaid = tax.getTaxRate(Status.SINGLE, 2019, 10_000);
		boolean status = taxPaid == 1006;
		assertTrue(status, "1006 was expected wrong values" + taxPaid);// assert produce junit report
	}
	
	@Test
	@DisplayName("test for single people 10") // generates name for test name is junit report
	void test3() {

		ICalculate tax = new MarginalTax();
		float taxPaid = tax.getTaxRate(Status.SINGLE, 2019, 10);
		boolean status = taxPaid == 1;
		assertTrue(status, "1 was expected wrong values" + taxPaid);// assert produce junit report
	}
	
	@Test
	@DisplayName("test for single people 150,000") // generates name for test name is junit report
	void test4() {

		ICalculate tax = new MarginalTax();
		float taxPaid = tax.getTaxRate(Status.SINGLE, 2019, 150_000);
		boolean status = taxPaid == 30_174.50;
		assertTrue(status, "30_174.50 was expected wrong values" + taxPaid);// assert produce junit report
	}
	
	@Test
	@DisplayName("Test for single people 200,000")
	void test5() {
		
		ICalculate tax = new MarginalTax();
		float taxPaid = tax.getTaxRate(Status.SINGLE, 2019, 200_000);
		boolean status = taxPaid == 45_316.50;
		
		assertTrue(status, "45_316.50 was expected wrong value" + taxPaid);
	}
	
	@Test
	@DisplayName("Test for single people 300,000")
	void test6() {
		
		ICalculate tax = new MarginalTax();
		float taxPaid = tax.getTaxRate(Status.SINGLE, 2019, 300_000);
		boolean status = taxPaid == 80_193.50;
		
		assertTrue(status, "80_193.50 was expected wrong value" + taxPaid);
	}
	
	@Test
	@DisplayName("Test for single people 600,000")
	void test7() {
		
		ICalculate tax = new MarginalTax();
		float taxPaid = tax.getTaxRate(Status.SINGLE, 2019, 600_000);
		boolean status = taxPaid == 186_987.50;
		
		assertTrue(status, "186_987.50 was expected wrong value" + taxPaid);
	}


}

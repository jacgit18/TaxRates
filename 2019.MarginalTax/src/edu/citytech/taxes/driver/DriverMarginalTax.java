package edu.citytech.taxes.driver;

import edu.citytech.taxes.service.MarginalTax;
import gov.irs.marignal.taxrate.ICalculate;
import gov.irs.marignal.taxrate.Status;

public class DriverMarginalTax {

	public static void main(String[] args) {

		
		ICalculate tax = new MarginalTax();
		float taxPaid = tax.getTaxRate(Status.SINGLE, 2019, 9_000);
		System.out.println(taxPaid);
		
		
		
	}

}

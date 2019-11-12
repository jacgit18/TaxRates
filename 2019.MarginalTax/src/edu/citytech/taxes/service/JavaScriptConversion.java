package edu.citytech.taxes.service;

import static gov.irs.marignal.taxrate.Status.SINGLE;
import static gov.irs.marignal.taxrate.Status.MARRIED;
import static gov.irs.marignal.taxrate.Status.HEAD_OF_HOUSE_HOLD;


import java.util.Arrays;

import gov.irs.marignal.taxrate.Status;

public class JavaScriptConversion {

	public static void main(String[] args) {
		// apply this code to marginal tax to were it is reusable and passes junit test
		float rate = 0, r1 = 0 ,r2 = 0;
		
//
//		TaxRate[] taxRateForAll = {
//				  new TaxRate(rate = .10f, r1 = 9700, r2 = 0, SINGLE)
//				  ,new TaxRate(rate = .12f, r1 = 39475, r2 = 9700, SINGLE)
//				  ,new TaxRate(rate = .22f, r1 = 84200, r2 = 39475, SINGLE)
//				  ,new TaxRate(rate = .24f, r1 = 160725, r2 = 84200, SINGLE)
//				  ,new TaxRate(rate = .32f, r1 = 204100, r2 = 160725, SINGLE)
//				  ,new TaxRate(rate = .35f, r1 = 510300, r2 = 204100, SINGLE)
//				  ,new TaxRate(rate = .37f, r1 = 99999999, r2 = 510300, SINGLE)
//				  
//				  ,new TaxRate(rate = .10f, r1 = 19400, r2 = 0, MARRIED)
//				  ,new TaxRate(rate = .12f, r1 = 78950, r2 = 19400, MARRIED)
//				  ,new TaxRate(rate = .22f, r1 = 168400, r2 = 78950, MARRIED)
//				  ,new TaxRate(rate = .24f, r1 = 321450, r2 = 168400, MARRIED)
//				  ,new TaxRate(rate = .32f, r1 = 408200, r2 = 321450, MARRIED)
//				  ,new TaxRate(rate = .35f, r1 = 612350, r2 = 408200, MARRIED)
//				  ,new TaxRate(rate = .37f, r1 = 999999999, r2 = 612350, MARRIED)
//
//
//
//				  ,new TaxRate(rate = .10f, r1 = 13850, r2 = 0, HEAD_OF_HOUSE_HOLD)
//				  ,new TaxRate(rate = .12f, r1 = 52850, r2 = 13850, HEAD_OF_HOUSE_HOLD)
//				  ,new TaxRate(rate = .22f, r1 = 84200, r2 = 52850, HEAD_OF_HOUSE_HOLD)
//				  ,new TaxRate(rate = .24f, r1 = 160000, r2 = 84200, HEAD_OF_HOUSE_HOLD)
//				  ,new TaxRate(rate = .32f, r1 = 204100, r2 = 160000, HEAD_OF_HOUSE_HOLD)
//				  ,new TaxRate(rate = .35f, r1 = 510300, r2 = 204100, HEAD_OF_HOUSE_HOLD)
//				  ,new TaxRate(rate = .37f, r1 = 999999999, r2 = 510300, HEAD_OF_HOUSE_HOLD)
//				  
//				  

		};
		
		

		  float salary = 150000; // dont  include in main code
		  int i = 0;
		  Status status = SINGLE;// dont  include in main code

//		  TaxRate [] taxRate = Arrays.stream(taxRateForAll)
//									  .filter(m -> m.status == status)
//									  .toArray(TaxRate[]::new);
//
//		
//		  while(salary > taxRate[i].r1){
//			  float taxPaid = (taxRate[i].r1 - taxRate[i].r2) * taxRate[i].rate;
//			      taxRate[i].taxPaid = taxPaid;
//			      System.out.println(taxRate[i]);
//			    i++;
//			  }
//		
//		  
//		  // what happened hear 
//		float taxPaid = (salary - taxRate[i].r2) * taxRate[i].rate;
//
//		  taxRate[i].taxPaid = taxPaid;
//
//
//		double totalPaid = Arrays.stream(taxRate)
//			                  .filter(f -> f.taxPaid != 0)
//		                      .mapToDouble(m -> m.taxPaid)
//		                      .sum();
//		                      
//		
//
//		  System.out.println("Total Paid: " + totalPaid);
	



}

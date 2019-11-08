package edu.citytech.taxes.service;

import static gov.irs.marignal.taxrate.Status.HEAD_OF_HOUSE_HOLD;
import static gov.irs.marignal.taxrate.Status.MARRIED;
import static gov.irs.marignal.taxrate.Status.SINGLE;

public class Taxstorage {

	public void taxlib() {
	
	float rate = 0, r1 = 0 ,r2 = 0;
	

	TaxRate[] taxRateForAll = {
			  new TaxRate(rate = .10f, r1 = 9700, r2 = 0, SINGLE)
			  ,new TaxRate(rate = .12f, r1 = 39475, r2 = 9700, SINGLE)
			  ,new TaxRate(rate = .22f, r1 = 84200, r2 = 39475, SINGLE)
			  ,new TaxRate(rate = .24f, r1 = 160725, r2 = 84200, SINGLE)
			  ,new TaxRate(rate = .32f, r1 = 204100, r2 = 160725, SINGLE)
			  ,new TaxRate(rate = .35f, r1 = 510300, r2 = 204100, SINGLE)
			  ,new TaxRate(rate = .37f, r1 = 999999999, r2 = 510300, SINGLE)
			  
			  ,new TaxRate(rate = .10f, r1 = 19400, r2 = 0, MARRIED)
			  ,new TaxRate(rate = .12f, r1 = 78950, r2 = 19400, MARRIED)
			  ,new TaxRate(rate = .22f, r1 = 168400, r2 = 78950, MARRIED)
			  ,new TaxRate(rate = .24f, r1 = 321450, r2 = 168400, MARRIED)
			  ,new TaxRate(rate = .32f, r1 = 408200, r2 = 321450, MARRIED)
			  ,new TaxRate(rate = .35f, r1 = 612350, r2 = 408200, MARRIED)
			  ,new TaxRate(rate = .37f, r1 = 999999999, r2 = 612350, MARRIED)



			  ,new TaxRate(rate = .10f, r1 = 13850, r2 = 0, HEAD_OF_HOUSE_HOLD)
			  ,new TaxRate(rate = .12f, r1 = 52850, r2 = 13850, HEAD_OF_HOUSE_HOLD)
			  ,new TaxRate(rate = .22f, r1 = 84200, r2 = 52850, HEAD_OF_HOUSE_HOLD)
			  ,new TaxRate(rate = .24f, r1 = 160000, r2 = 84200, HEAD_OF_HOUSE_HOLD)
			  ,new TaxRate(rate = .32f, r1 = 204100, r2 = 160000, HEAD_OF_HOUSE_HOLD)
			  ,new TaxRate(rate = .35f, r1 = 510300, r2 = 204100, HEAD_OF_HOUSE_HOLD)
			  ,new TaxRate(rate = .37f, r1 = 999999999, r2 = 510300, HEAD_OF_HOUSE_HOLD)
			  
			  

	};
	
	}
	
	
}

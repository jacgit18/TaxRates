package edu.citytech.taxes.service;

import gov.irs.marignal.taxrate.Status;

public class TaxRate {

	public final float rate;
	public final float r1;
	public final float r2;
	public final Status status;
	public final int year;
	public float taxPaid;
	
	/**
	 * 
	 * @param rate
	 * @param r1
	 * @param r2
	 * @param status
	 */
	public TaxRate(float rate, float r1, float r2, Status status, int year) {
		super();
		this.rate = rate;
		this.r1 = r1;
		this.r2 = r2;
		this.status = status;
		this.year = year;
	
	}

	@Override
	public String toString() {
		return "TaxRate [rate=" + rate + ", r1=" + r1 + ", r2=" + r2 + ", status=" + status + ", year=" + year
				+ ", taxPaid=" + taxPaid + "]";
	}
	
	
}

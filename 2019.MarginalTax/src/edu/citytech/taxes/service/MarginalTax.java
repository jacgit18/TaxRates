package edu.citytech.taxes.service;

import gov.irs.marignal.taxrate.ICalculate;
import gov.irs.marignal.taxrate.Status;

public class MarginalTax implements ICalculate {

	@Override
	public float getTaxRate(Status status, int year, float salary) {
		float taxPaid = 0f;
		if (status == status.SINGLE && year == 2019 && salary <= 9700) {
			taxPaid = salary * .10f;
		}
		
		if (status == status.SINGLE && year == 2019 && salary > 9700 && salary <= 39_475) {
			float salaryDifference = salary - 9_700;
			taxPaid = 970f + salaryDifference * .12f;
		}
		
		// 22%
		if (status == status.SINGLE && year == 2019 && salary > 39_475 && salary <= 84_200) {
			float salaryDifference = salary - 39_475;
			taxPaid = 970f + 3_753.00f + salaryDifference * .22f;
		}
		
		// 24%
		if (status == status.SINGLE && year == 2019 && salary > 84_200 && salary <= 160_725) {
			float salaryDifference = salary - 84_200;
			taxPaid = 970f + 3_753.00f + 9_839.50f + salaryDifference * .24f;
		}
		
		
		return taxPaid;
	}
	
	// do married then head of house hold

	
	/**
	 * 
		double hoursWorked, hourlyPay, RegularPay, RegularHour, OverTime,
		OverTimePay, WeeklyPay, YearlyPay;
		double tax = 0, net = 0;
		hoursWorked = Double.parseDouble(txtfd_HoursWork.getText());
		hourlyPay = Double.parseDouble(txtfd_HourlyWage.getText());

		if (hoursWorked <= 40) {
			RegularHour = hoursWorked;
			hoursWorked = RegularHour;
			OverTimePay = 0;
			OverTime = 0;
			RegularPay = hoursWorked * hourlyPay;
			WeeklyPay = RegularPay;
			YearlyPay = WeeklyPay * 52;

			tax = YearlyPay;
			if (tax >= 0 && tax <= 9_699.99  ) {
				tax = 10 * YearlyPay /100; 
				net =  YearlyPay - tax;
			}
			else if(tax >= 9_699.99 && tax <= 39_474.99  ) {
				tax = 12 * YearlyPay /100; 
				net =  YearlyPay - tax;
			}
			else if( tax >= 39_474.99 && tax <= 84_199.99) {
				tax = 22 * YearlyPay /100; 
				net =  YearlyPay - tax;
			}
			
			else if( tax >= 84_200.00 && tax <= 160_725.999) {
				tax = 24 * YearlyPay /100; 
				net =  YearlyPay - tax;
			}
			
			else if( tax >= 160_725.999 && tax <= 204_100.999) {
				tax = 32 * YearlyPay /100; 
				net =  YearlyPay - tax;
			}
			
			else if( tax >= 204_100.999 && tax <= 400_999.999) {
				tax = 35 * YearlyPay /100; 
				net =  YearlyPay - tax;
			}

			else if( tax >= 400_999.999 && tax >= 550_999.999) {
				tax = 37 * YearlyPay /100; 
				net =  YearlyPay - tax;
			}

			
		}

		else {
			OverTime = hoursWorked - 40;
			OverTimePay = OverTime * 1.5 * hourlyPay;
			RegularHour = 40;
			hoursWorked = RegularHour;
			RegularPay = 40 * hourlyPay;
			WeeklyPay = OverTimePay + RegularPay;
			YearlyPay = WeeklyPay * 52;
			
			tax = YearlyPay + OverTime;
			if (tax >= 0 && tax <= 9_699.99  ) {
				tax = 10 * YearlyPay /100; 
				net =  YearlyPay - tax;
			}
			else if(tax >= 9_699.99 && tax <= 39_474.99  ) {
				tax = 12 * YearlyPay /100; 
				net =  YearlyPay - tax;
			}
			else if( tax >= 39_474.99 && tax <= 84_199.99) {
				tax = 22 * YearlyPay /100; 
				net =  YearlyPay - tax;
			}
			
			else if( tax >= 84_200.00 && tax <= 160_725.999) {
				tax = 24 * YearlyPay /100; 
				net =  YearlyPay - tax;
			}
			
			else if( tax >= 160_725.999 && tax <= 204_100.999) {
				tax = 32 * YearlyPay /100; 
				net =  YearlyPay - tax;
			}
			
			else if( tax >= 204_100.999 && tax <= 400_999.999) {
				tax = 35 * YearlyPay /100; 
				net =  YearlyPay - tax;
			}

			else if( tax >= 400_999.999 && tax >= 550_999.999) {
				tax = 37 * YearlyPay /100; 
				net =  YearlyPay - tax;
			}




		}

		OverTimeDiplay.setText(Double.toString(OverTime) + "0");
		RegularHoursDisplay.setText(Double.toString(RegularHour) + "0");
		OverTimePayDisplay.setText(Double.toString(OverTimePay) + "0");
		RegularPayDisplay.setText(Double.toString(RegularPay) + "0");
		WeeklyPayDisplay.setText(Double.toString(WeeklyPay) + "0");
		YearlyPayDisplay.setText(Double.toString(YearlyPay) + "0");
		MarginalTaxDisplay.setText(Double.toString(tax) + "0");
		NetSalaryDisplay.setText(Double.toString(net) + "0");
	 */
}

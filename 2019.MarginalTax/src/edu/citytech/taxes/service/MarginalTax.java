package edu.citytech.taxes.service;

import gov.irs.marignal.taxrate.ICalculate;
import gov.irs.marignal.taxrate.Status;

public class MarginalTax implements ICalculate {

	@Override
	public float getTaxRate(Status status, int year, float salary) {
		float taxPaid = 0f;


        
        
		if (status == Status.SINGLE && year == 2019 && salary <= 9700) {

			taxPaid = salary * .10f;

		}

		if (status == Status.SINGLE && year == 2019 && salary > 9700 && salary <= 39_475) {

			float salaryDifference = salary - 9_700;
			taxPaid = 970f + (salaryDifference * .12f);

		}

		// 22% Bracket: ($84,200 - $39,475) x 22% = $9,839.00

		if (status == Status.SINGLE && year == 2019 && salary > 39_475 && salary <= 84_200) {

			float salaryDifference = salary - 39_475;
			taxPaid = 3_573.00f + 970f + (salaryDifference * .22f);

		}

		// 24% Bracket: ($160,725 - $84,200) x 24& = $18,366.00

		if (status == Status.SINGLE && year == 2019 && salary > 84_200 && salary <= 160_725) {

			float salaryDifference = salary - 84_200;
			taxPaid = 9_839.50f + 3_573.00f + 970f + (salaryDifference * .24f);

		}

		// 32% Bracket: ($204,100 - $160,725) x 32& = $13,880.00

		if (status == Status.SINGLE && year == 2019 && salary > 160_725 && salary <= 204_100) {

			float salaryDifference = salary - 160_725;
			taxPaid = 18_366.00f + 9_839.50f + 3_573.00f + 970f + (salaryDifference * .32f);

		}

		// 35% Bracket: ($510,300 - $204,100) x 35& = $107170

		if (status == Status.SINGLE && year == 2019 && salary > 204_100 && salary <= 510_300) {

			float salaryDifference = salary - 204_100;
			taxPaid = 13_880.00f + 18_366.00f + 9_839.50f + 3_573.00f + 970f + (salaryDifference * .35f);

		}

		// 37% Bracket: ($) x 37& = ??

		if (status == Status.SINGLE && year == 2019 && salary > 510_300) {

			float salaryDifference = salary - 510_300;
			taxPaid = 107_170.00f + 13_880.00f + 18_366.00f + 9_839.50f + 3_573.00f + 970f + (salaryDifference * .37f);

		}

		// 10% = 19400 - 0 * 10% = 1940

		if (status == Status.MARRIED && year == 2019 && salary <= 19_400) {

			taxPaid = salary * .10f;

		}

		// 12% Bracket: ($78,950 - $19,400) x 12% = $7,146

		if (status == Status.MARRIED && year == 2019 && salary > 19_400 && salary <= 78_950) {

			float salaryDifference = salary - 19_400;
			taxPaid = 1_940.00f + (salaryDifference * .12f);

		}

		// 22% Bracket: ($168,400 - $78,950) x 22% = $19,679.00

		if (status == Status.MARRIED && year == 2019 && salary > 78_950 && salary <= 168_400) {

			float salaryDifference = salary - 78_950;
			taxPaid = 7_146.00f + 1_940.00f + (salaryDifference * .22f);

		}

		// 24% Bracket: ($321,450 - $168,400) x 24% = $36,732 + 28735

		if (status == Status.MARRIED && year == 2019 && salary > 168_400 && salary <= 321_450) {

			float salaryDifference = salary - 168_400;
			taxPaid = 19_679.00f + 7_146.00f + 1_940.00f + (salaryDifference * .24f);

		}

		// 32% Bracket: ($408,200 - $321,450) x 32% = $27760

		if (status == Status.MARRIED && year == 2019 && salary > 321_450 && salary <= 408_200) {

			float salaryDifference = salary - 321_450;
			taxPaid = 36_732.00f + 19_679.00f + 7_146.00f + 1_940.00f + (salaryDifference * .32f);

		}

		// 35% Bracket: ($612_350 - $408,200) x 35% = $71_452.5

		if (status == Status.MARRIED && year == 2019 && salary > 408_200 && salary <= 612_350) {

			float salaryDifference = salary - 408_200;
			taxPaid = 27_760.00f + 36_732.00f + 19_679.00f + 7_146.00f + 1_940.00f + (salaryDifference * .35f);

		}

		// 37% Bracket: (??? - $612_350) x 37% = ??? 164_709.5

		if (status == Status.MARRIED && year == 2019 && salary > 612_350) {

			float salaryDifference = salary - 612_350;
			taxPaid = 71_452.50f + 27_760.00f + 36_732.00f + 19_679.00f + 7_146.00f + 1_940.00f
					+ (salaryDifference * .37f);

		}

		// 10% = 13_850 - 0 * 10% = 1385

		if (status == Status.HEAD_OF_HOUSE_HOLD && year == 2019 && salary <= 13_850) {

			taxPaid = salary * .10f;

		}

		// 12% = 52_850 - 13_850 * 12% = 4680

		if (status == Status.HEAD_OF_HOUSE_HOLD && year == 2019 && salary > 13_850 && salary <= 52_850) {

			float salaryDifference = salary - 13_850;
			taxPaid = 1_385.00f + (salaryDifference * .12f);

		}

		// 22% = 84_200 - 52_850 * 22% = 6897

		if (status == Status.HEAD_OF_HOUSE_HOLD && year == 2019 && salary > 52_850 && salary <= 84_200) {

			float salaryDifference = salary - 52_850;
			taxPaid = 4_680.00f + 1_385.00f + (salaryDifference * .22f);

		}

		// 24% = 160_000 - 84_200 * 24% = 18192

		if (status == Status.HEAD_OF_HOUSE_HOLD && year == 2019 && salary > 84_200 && salary <= 160_000) {

			float salaryDifference = salary - 84_200;
			taxPaid = 6_897.00f + 4_680.00f + 1_385.00f + (salaryDifference * .24f);

		}

		// 32% = 204_100 - 160_000 * 32% = 14112

		if (status == Status.HEAD_OF_HOUSE_HOLD && year == 2019 && salary > 160_000 && salary <= 204_100) {

			float salaryDifference = salary - 160_000;
			taxPaid = 18_192.00f + 6_897.00f + 4_680.00f + 1_385.00f + (salaryDifference * .32f);

		}

		// 35% = 510_300 - 204_100 * 35% = 107170

		if (status == Status.HEAD_OF_HOUSE_HOLD && year == 2019 && salary > 204_100 && salary <= 510_300) {

			float salaryDifference = salary - 204_100;
			taxPaid = 14_112.00f + 18_192.00f + 6_897.00f + 4_680.00f + 1_385.00f + (salaryDifference * .35f);

		}

		// 37% = ??? - 510_300 * 37% = ??? 152_436 +

		if (status == Status.HEAD_OF_HOUSE_HOLD && year == 2019 && salary > 510_300) {

			float salaryDifference = salary - 510_300;
			taxPaid = 107_170.00f + 14_112.00f + 18_192.00f + 6_897.00f + 4_680.00f + 1_385.00f
					+ (salaryDifference * .37f);

		}

		return taxPaid;
	}

}

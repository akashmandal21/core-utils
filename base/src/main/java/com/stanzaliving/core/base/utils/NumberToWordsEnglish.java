package com.stanzaliving.core.base.utils;

import java.text.DecimalFormat;

public class NumberToWordsEnglish {

	private static final String[] tensNames = {
			"",
			" Ten",
			" Twenty",
			" Thirty",
			" Forty",
			" Fifty",
			" Sixty",
			" Seventy",
			" Eighty",
			" Ninety"
	};

	private static final String[] numNames = {
			"",
			" One",
			" Two",
			" Three",
			" Four",
			" Five",
			" Six",
			" Seven",
			" Eight",
			" Nine",
			" Ten",
			" Eleven",
			" Twelve",
			" Thirteen",
			" Fourteen",
			" Fifteen",
			" Sixteen",
			" Seventeen",
			" Eighteen",
			" Nineteen"
	};

	private NumberToWordsEnglish() {
	}

	private static String convertLessThanOneThousand(int number) {
		String soFar;

		if (number % 100 < 20) {
			soFar = numNames[number % 100];
			number /= 100;
		} else {
			soFar = numNames[number % 10];
			number /= 10;

			soFar = tensNames[number % 10] + soFar;
			number /= 10;
		}
		if (number == 0)
			return soFar;
		return numNames[number] + " Hundred" + soFar;
	}

	public static String convert(long number) {
		// 0 to 999 999 999 999
		if (number == 0) {
			return "zero";
		}

		// pad with "0"
		String mask = "000000000";
		DecimalFormat df = new DecimalFormat(mask);
		String snumber = df.format(number);

		// XXnnnnnnn
		int crores = Integer.parseInt(snumber.substring(0, 2));
		// nnXXnnnnn
		int lakhs = Integer.parseInt(snumber.substring(2, 4));
		// nnnnXXnnn
		int tenThousands = Integer.parseInt(snumber.substring(4, 6));
		// nnnnnnXXX
		int thousands = Integer.parseInt(snumber.substring(6, 9));

		String tradCrores;
		switch (crores) {
			case 0:
				tradCrores = "";
				break;
			case 1:
				tradCrores = convertLessThanOneThousand(crores) + " Crore ";
				break;
			default:
				tradCrores = convertLessThanOneThousand(crores) + " Crore ";
		}
		String result = tradCrores;

		String tradLakhs;
		switch (lakhs) {
			case 0:
				tradLakhs = "";
				break;
			case 1:
				tradLakhs = convertLessThanOneThousand(lakhs) + " Lakh ";
				break;
			default:
				tradLakhs = convertLessThanOneThousand(lakhs) + " Lakh ";
		}
		result = result + tradLakhs;

		String tradThousands;
		switch (tenThousands) {
			case 0:
				tradThousands = "";
				break;
			case 1:
				tradThousands = "One Thousand ";
				break;
			default:
				tradThousands = convertLessThanOneThousand(tenThousands) + " Thousand ";
		}
		result = result + tradThousands;

		String tradThousand;
		tradThousand = convertLessThanOneThousand(thousands);
		result = result + tradThousand;

		// remove extra spaces!
		return result.replaceAll("^\\s+", "").replaceAll("\\b\\s{2,}\\b", " ");
	}
}
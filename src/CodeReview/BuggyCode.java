package CodeReview;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UnknownFormatConversionException;

public class BuggyCode {
	
	public static void main(final String[] args) {

	
	
		System.out.println("Changing the code for my group and stuff");

	
		// CORRECT
		BuggyCode.bcImpossibleCastCORRECT();

		// CORRECT
		BuggyCode.bcImpossibleDowncastCORRECT();


		// CORRECT
		BuggyCode.bcImpossibleInstanceOfCORRECT();


		// CORRECT
		BuggyCode.bcImpossibleDowncastOfArrayCORRECT();


		// CORRECT
		BuggyCode.dmiBigDecimalConstructedFromDoubleCORRECT();


		// CORRECT
		BuggyCode.esComparingStringsWithEqCORRECT();


		// CORRECT
		BuggyCode.vaFormatStringIllegalCORRECT();

		// CORRECT
		BuggyCode.rvReturnValueIgnoredCORRECT();


		// CORRECT
		BuggyCode.npAlwaysNullCORRECT();

		// CORRECT
		BuggyCode.qabQuestionableBooleanAssignmentCORRECT();

	}



	private static void bcImpossibleCastCORRECT() {
		final Object doubleValue = Double.valueOf(1.0);
		final Double value = (Double) doubleValue;
		System.out.println("   - " + value);
	}


	private static void bcImpossibleDowncastCORRECT() {
		final Object exception = new RuntimeException("abc");
		final RuntimeException value = (RuntimeException) exception;
		System.out.println("   - " + value.getMessage());
	}


	private static void bcImpossibleInstanceOfCORRECT() {
		final Object value = Double.valueOf(1.0);
		System.out.println("   - " + (value instanceof Double));
	}


	private static void bcImpossibleDowncastOfArrayCORRECT() {
		final Collection<String> stringVector = new ArrayList<String>();
		stringVector.add("abc");
		stringVector.add("xyz");
		final String[] stringArray = stringVector.toArray(new String[stringVector.size()]);
		System.out.println("   - " + stringArray.length);
	}



	private static void dmiBigDecimalConstructedFromDoubleCORRECT() {
		final BigDecimal bigDecimal = new BigDecimal("3.1");
		System.out.println("   - " + bigDecimal.toString());
	}


	private static void esComparingStringsWithEqCORRECT() {
		final StringBuilder sb1 = new StringBuilder("1234");
		final StringBuilder sb2 = new StringBuilder("1234");
		final String string1 = sb1.toString();
		final String string2 = sb2.toString();
		System.out.println("   - " + string1.equals(string2));
	}



	private static void vaFormatStringIllegalCORRECT() {
		System.out.println(String.format("   - %s > %s", "10", "9"));
	}




	private static void npAlwaysNullCORRECT() {
		final String value = null;
		if (null != value && value.length() > 2) {
			System.out.println(String.format("   - " + value));
		} else {
			System.out.println(String.format("   - value is invalid"));
		}
	}

	private static void qabQuestionableBooleanAssignmentCORRECT() {
		final boolean value = false;
		if (value == true) {
			System.out.println(String.format("   - value is true"));
		} else {
			System.out.println(String.format("   - value is false"));
		}
	}

}

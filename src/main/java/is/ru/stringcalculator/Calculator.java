package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text){
			if(text.equals(""))
				return 0;
			else if (text.contains(",") || text.contains(" ")){
				return sum(splitNumbers(text));
			}
			else
				return 1;		
	}

	private static int toInt(String text){
		return Integer.parseInt(text);
	}

	private static String[] splitNumbers(String numbers){
		return numbers.split("[;,\\s\\n]+");
	}

	private static int sum(String[] numbers){
		int total = 0;
		String minusNumbers = "";

		for(String number : numbers){
			if (toInt(number) < 0){
				minusNumbers += number;
			}
			else if (toInt(number) > 1000)
				total = total;
			else
				total += toInt(number);
		}

		if (minusNumbers.isEmpty())
			return total;
		else
			throw new IllegalArgumentException("Negatives not allowed:");
	}

}
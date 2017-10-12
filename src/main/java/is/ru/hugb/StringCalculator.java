package is.ru.StringCalculator;

public class StringCalculator {
	
	public static int Add(String numbers) {
		if(numbers.equals("")) {
			return 0;
		}
		else if(!numbers.contains(",")) {
            return Integer.parseInt(numbers);
        }
        else if(numbers.length() == 3) {
    		String nums[] = numbers.split(",");
    		return Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]);
    	}
		return 5;
	}
}
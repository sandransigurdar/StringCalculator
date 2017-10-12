package is.ru.StringCalculator;

public class StringCalculator {
	
	public static int Add(String numbers) {
		if(numbers.equals("")) {
			return 0;
		}
		else if(!numbers.contains(",")) {
            return Integer.parseInt(numbers);
        }
        else if(numbers.contains(",")) {
    		String nums[] = numbers.split(",");
    		return sum(nums);
    	}
		return 5;
	}

	private static int sum(String[] nums) {
        int sum = 0;
        for(String num : nums) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }
}
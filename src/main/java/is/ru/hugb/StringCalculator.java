package is.ru.StringCalculator;

public class StringCalculator {
	
	public static int Add(String numbers) {
		if(numbers.equals("")) {
            return 0;
        }
        else if(!numbers.contains(",") && !numbers.contains("\n")) {
        	return Integer.parseInt(numbers);
        }
        else if(numbers.contains(",") || numbers.contains("\n")) {
            String nums[] = numbers.split(",|\n");
            return sum(nums);
        }
        return 9;        
    }

    private static int sum(String[] nums) {
        int sum = 0;
        for(String num : nums) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }
}
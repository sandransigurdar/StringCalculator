package is.ru.StringCalculator;

public class StringCalculator {
	
	public static int Add(String numbers) {
	    if(numbers.equals("")) {
            return 0;
        }
        else if(!numbers.contains(",") && !numbers.contains("\n")) {
        	int num = Integer.parseInt(numbers);
        	if(num < 0) {
        		throw new IllegalArgumentException("Negatives not allowed: " + num);
        	}
            else return num;
        }
        else if(numbers.contains(",") || numbers.contains("\n")) {
            String nums[] = numbers.split(",|\n");
            return sum(nums);
        }
        return 9;        
    }

    private static int sum(String[] nums) {
        int sum = 0;
        int i = 0;
        for(String num : nums) {
        	int no = Integer.parseInt(num);
            sum += no;
            if(no < 0) {
            	throw new IllegalArgumentException("Negatives not allowed: " + no);
            }
        }
        return sum;
    }
}
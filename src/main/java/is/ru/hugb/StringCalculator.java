package is.ru.StringCalculator;

public class StringCalculator {
	
public static int Add(String numbers) {
	if(numbers.equals("")) {
            return 0;
        }
        else if(!numbers.contains(",") && !numbers.contains("\n")) {
        	int num = Integer.parseInt(numbers);
        	if(num < 0) {
        		throw new IllegalArgumentException("Negatives not allowed:" + num);
        	}
        	else if(num >= 1000) {
        		return 0;
        	}
        	else return num;
        }
        else if(numbers.startsWith("//")) {       	
        	String digits = numbers.replaceAll("\\D+", ",");      	
        	String dig[] = digits.split(",");
        	dig[0] = "0";      	
        	return sum(dig);       	
        }
        else if(numbers.contains(",") || numbers.contains("\n")) {
            String nums[] = numbers.split(",|\n");
            return sum(nums);
        }
        return 9;        
    }

    private static int sum(String[] nums) {
        int sum = 0;
        String minuses = "";
        boolean minusIncluded = false;
        for(String num : nums) {
        	int no = Integer.parseInt(num);	
        	if(num.contains("-")) {        		
        		minusIncluded = true;
        		minuses += num;
        	}
        	else {
        		if(no >= 1000) {
        			no = 0;
        		}
        		sum += no;
        	}
        }
        if(minusIncluded == true) {
        		throw new IllegalArgumentException("Negatives not allowed: " + minuses);
        }
        return sum;
    }
    
}
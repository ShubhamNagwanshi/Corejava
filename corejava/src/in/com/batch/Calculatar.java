package in.com.batch;

public class Calculatar {
public static void main(String[] args) {
	
	double num1 = 1800;
	double num2 = 200;
	char operator = '-';
	double result;
	
	switch (operator) {
	case '-':
		result = num1-num2;
		System.out.println("sub = "+ result);
		
		
		break;
	case '+' :
		result = num1 +num2;
		System.out.println("add =" + result);
		
		break;
	case '*':
		result = num1*num2;
		System.out.println("mult = " + result);
		break;
		
	case '/':
		result = num1/num2;
		System.out.println("divide = " + result);
		break;
		

	default:
		System.out.println("invalid operator");
		break;
	}
	
}
}

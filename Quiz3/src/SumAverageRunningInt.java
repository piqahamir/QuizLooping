
public class SumAverageRunningInt {

	public static void main(String[] args) {
		
		int sum=0, sum1=0, sum2=0;
		double average, average1, average2;
		int lowerbound=1;
		int upperbound=100;
		
		System.out.println("FOR LOOP");
		for (int number = lowerbound; number <= upperbound; ++number) {
			sum += number;
		}
		
		average = sum/100;
		System.out.println("The sum is: " + sum);
		System.out.println("The average is: " + average);
		
		System.out.println();
		System.out.println("WHILE-DO LOOP");
		int number1 = lowerbound;
		
		while(number1 <= upperbound) {
			sum1 += number1;
			++number1;
		}
		
		average1 = sum1/100;
		System.out.println("The sum is: " + sum1);
		System.out.println("The average is: " + average1);
		
		System.out.println();
		System.out.println("DO-WHILE LOOP");
		int number2 = lowerbound;
		
		do {
			sum2 += number2;
			++number2;
		} while (number2 <= upperbound);
		
		average2 = sum2/100;
		System.out.println("The sum is: " + sum2);
		System.out.println("The average is: " + average2);
		
		
	}

}

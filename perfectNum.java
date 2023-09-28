
public class perfectNum {
		public static void main(String[] args) {
		int sumOfD = 0;   //Initializing the variable as Integer and it's value to zero
		int numOfPerfect = 0;   //Initializing the variable as integer and it's value to zero
		for (int i = 1; i <= 10000; i++) {
		for (int j = 1; j < i; j++) {
		if (i % j == 0) {
		sumOfD += j;
		}
		}
		if (sumOfD == i) {
		System.out.println(i + " is a perfect number");
		numOfPerfect++;
		}
		sumOfD = 0;
		}
		System.out.println("Total number of perfect numbers are: "
		+ numOfPerfect);
		}
		}	



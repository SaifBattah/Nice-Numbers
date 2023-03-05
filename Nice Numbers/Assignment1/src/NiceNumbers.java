import java.util.Scanner;
// Done By Saif Battah
public class NiceNumbers {
	public static void main (String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter Left bound: ");
	int left = input.nextInt();
	System.out.print("Enter Right bound: ");
	int right = input.nextInt();
	System.out.print("Enter digit to exclude it: ");
	int m = input.nextInt();
	System.out.print("Nice Numbers in Range Left = "+left+", Right = "+right+" with exclude digit m = "+m+" are: ");
	System.out.println();
	NiceNumbers(left,right,m);
}
	public static void NiceNumbers(int left, int right, int m) {
		int TempValue;
		int Digit;
		int Div;
		
		for (int i = left; i <= right; i++) {
			int Sum = 0 ;
			TempValue = i; 
			Digit = TempValue % 10; // Digit : used to Store each number separately.
			Sum+= Digit; // Sum: used to store previous digits value to check if less than next digit.
			if(Digit == 0 || Digit == Sum && Digit != m) { 
			Div = TempValue / 10; // Div : used to store the value of leftbound after checking first digit
			TempValue = Div;
			Digit = TempValue % 10;
			}
			while (Digit > Sum && Digit != m){ 
				Sum+= Digit;
				Div = TempValue / 10;
				TempValue = Div;
				Digit = TempValue % 10;
				if (Div == 0 && TempValue == 0 && Digit == 0) { // it means that everything is done and the number is nicenumber, and print it.
					System.out.print(i+", ");
					
			}
			
			}
			}
			
		}

}
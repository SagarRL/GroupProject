import java.util.Scanner;

class simpleCalculator
{
	double operand1, operand2;
	char operator;

	// other functions go here

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("expresultsion : ");
        operand1 = input.nextInt();
        operator = input.next().charAt(0);
        operand2 = input.nextInt();

        double result;
        switch(operator)
        {
            case('+') : result = add(a,b);
                        break;
            case('-') : result = subtract(a,b);
                        break;
            case('*') : result = multiply(a,b);
                        break;
            case('/') : result = divide(a,b);
                        break;
            case('^') : result = expo(a,b);
                        break;
        }

        System.out.println("Ans = " + result);
    }
}
import java.util.Scanner;

class simpleCalculator
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("expresultsion : ");
        double a        = input.nextInt();
        String operator = input.next();
        double b        = input.nextInt();

        double result;
        switch(operator)
        {
            case("+") : result = add(a,b);
                        break;
            case("-") : result = subtract(a,b);
                        break;
            case("*") : result = multiply(a,b);
                        break;
            case("/") : result = divide(a,b);
                        break;
            case("^") : result = expo(a,b);
                        break;
        }

        System.out.println("Ans = " + result);
    }
}
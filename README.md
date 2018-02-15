import java.util.Scanner;
class calculator
{
    int a,b;
    calculator(int a,int b)
    {
        this.a = a;
        this.b = b;
    }

    int addition()
    {
        return (a+b);//Addition
    }

    int subtraction()
    {
        return (a-b);//Subtraction
    }
}

class calc
{
    public static void main(String args[])
    {
        int p,r;
        Scanner s = new Scanner(System.in);
        while(1)
        {
            System.out.println("Enter the 2 numbers :");
            p = s.nextInt();
            r = s.nextInt();
            calculator cal = new calculator(p,r);

            int choice;
            System.out.println("1 - Addition\n2-Subtraction\3-Exit");
            choice = s.nextInt();

            switch(choice)
            {
                case 1:
                        cal.addition(p,r);
                        break;
                case 2:
                        cal.subtrction(p,r);
                        break;
                case 3:
                        return 0;
                default:
                        System.out.println("Enter the correct choice");
                        break;
            }
        }
    }
}
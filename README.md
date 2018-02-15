
#Sagar R. Laturkar
import java.util.Scanner;
class calc
{
    public static void main(String args[])
    {
        System.out.println("Calculator");
        for(;;)
        {
                 System.out.println("Enter The First Num");
                 Scanner ob= new Scanner(System.in);
                 int num1=ob.nextInt();
                 int num1=ob.nextInt();
                 System.out.println("1.Add 2.Sub 3.Mul 4.Div");
                 System.out.println("Enter ur Choice");
                 int ch=ob.nextInt();
                 int res;
                 switch(ch)
                 {
                     case 1: res=num1+num2;
                            System.out.println("Addition"+res);
                            break;
                    case 2: res=num1-num2;
                            System.out.println("Subtraction"+res);
                            break;       
                    case 3: res=num1*num2;
                            System.out.println("Multiplication"+res);
                            break;    
                     case 4: res=num1/num2;
                            System.out.println("Divison"+res);
                            break;
                 }

        }
    }

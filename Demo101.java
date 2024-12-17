import java.util.Scanner;

public class Demo101 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your first number");
        double num1=sc.nextDouble();
        System.out.println("please enter you(+, —, *, /):");
        String op=sc.next();
        System.out.println("Enter your second number");
        double num2=sc.nextDouble();
        double result=calc(num1,op,num2);
        System.out.println(num2+" "+op+" "+num2+" = "+result);
    }
 
    public static double calc(double num1, String op, double num2) {
        double result=0;
        switch (op){
            case "+":
                result=num1+num2;
                break;
            case "-":
                result=num1-num2;
                break;
            case "*":
                result=num1*num2;
                break;
            case "/":
                result=num1/num2;
                break;
            default:
                System.out.println("Bruh please enter the correct character");
        }
        return result;
    }
}

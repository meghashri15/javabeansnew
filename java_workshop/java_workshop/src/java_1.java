import java.util.Scanner;
public class java_1 {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the first integer(>=40)");
        int num1= scanner.nextInt();
        System.out.println("enter the second integer(>=40)");
        int num2= scanner.nextInt();
        System.out.println("enter the third integer(>=40)");
        int num3= scanner.nextInt();
        if (num1<40 || num2<40|| num3<40) {
            System.out.println("each number should be greater than 40");
        }else{
            int sum= num1+num2+num3;
            if(sum<125){
                System.out.println("Satisfies the condition");
            }else{
                System.out.println("Pass");
            }
        }
    }
}
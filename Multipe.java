import java.util.Scanner;

public class Multipe {
    public static void main(String[] args) {
        boolean bool=false,bool2=false;
        int fact=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the val 1:");
        int a = sc.nextInt();
        System.out.println("Enter the val 2:");
        int b = sc.nextInt();

        if(a*a==b)
        bool=true;

        if(b%a==0){
            bool2=true;
            fact=b/a;  
        }
         if(bool==true && bool2==true){
             System.out.println("The number "+a+" is perfect square of number "+b+ " also it is multiple of "+b+" with factor "+fact);
         }
         else
         if(bool==false && bool2==true){
            System.out.println("The number "+a+" is not perfect square of number "+b+ " but it is multiple of "+b+" with factor "+fact);
         }
         else
         if(bool==false && bool2==false){
            System.out.println("The number "+a+" is not perfect square of number "+b+ "and it is also not multiple of "+b);
         }
        

    }
}

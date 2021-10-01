import java.util.Scanner;

public class CharCount {

    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      int count = 0;
      System.out.println("enter number : ");
      int num=sc.nextInt();
  
      while (num != 0) {
        num /= 10;
        ++count;
      }
      if(count<2)
      System.out.println(count);
      else
      if(count%2==0)
      System.out.println(count*count);
      else
      if(count%3==0)
      System.out.println(count*count*count);
      else 
      System.out.println((count-1)*(count-1));
    }
  }
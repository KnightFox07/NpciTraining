import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stock[] ={4,4,4,4,4};
        ArrayList <String> list=new ArrayList<String>();
        System.out.println("1-Maggi \n 2-choclate \n 3-Soap \n 4-biscuit \n 5-apple \n 6-Exit");
        System.out.println("Enter the item code to add to cart");
        
        Boolean bool = true;

        while(bool){
        int n=sc.nextInt();        
        if(n==1)
        { if(stock[n-1]>0)
        {list.add("Maggi");
        System.out.println("Item added");
        System.out.println("1-Maggi \n 2-choclate \n 3-Soap \n 4-biscuit \n 5-apple \n 6-Exit");
        stock[n-1]-=1;}
        else
        System.out.println("out of stock");}

        if(n==2)
        { if(stock[n-1]>0)
        {list.add("Choclate");
        System.out.println("Item added");
        System.out.println("1-Maggi \n 2-choclate \n 3-Soap \n 4-biscuit \n 5-apple \n 6-Exit");
        stock[n-1]-=1;}
        else
        System.out.println("out of stock");}

        if(n==3)
        { if(stock[n-1]>0)
        {list.add("Soap");
        System.out.println("Item added");
        System.out.println("1-Maggi \n 2-choclate \n 3-Soap \n 4-biscuit \n 5-apple \n 6-Exit");
        stock[n-1]-=1;}
        else
        System.out.println("out of stock");}

        if(n==4)
        { if(stock[n-1]>0)
        {list.add("Biscuit");
        System.out.println("Item added");
        System.out.println("1-Maggi \n 2-choclate \n 3-Soap \n 4-biscuit \n 5-apple \n 6-Exit");
        stock[n-1]-=1;}
        else
        System.out.println("out of stock");}

        if(n==5)
        { if(stock[n-1]>0)
        {list.add("Apple");
        System.out.println("Item added");
        System.out.println("1-Maggi \n 2-choclate \n 3-Soap \n 4-biscuit \n 5-apple \n 6-Exit");
        stock[n-1]-=1;}
        else
        System.out.println("out of stock");}

        if(n==6){
            bool=false;
        }
        
        


        }

        System.out.println("Cart values are : ");

        Iterator iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        sc.close();


    }
}

import java.util.*;
public class fizzbuzz{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       if(a%3==0){
           System.out.println("fizz");
       }
       if(a%5==0){
           System.out.println("buzz");
       }
       else{
           System.out.println("fizz buzz");
       }
    }
}

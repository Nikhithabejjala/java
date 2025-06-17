import java.util.*;
public class largest{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
if(a>=b){
if(a>c){
System.out.println(a+"is greater");
}
else if(a<c){
System.out.println(c+"is greater");
}

else{
System.out.print(a);
}
}
if(b<=a)
{
if(a>b){
System.out.println(a+"is greater");
}
else if(a<b){
System.out.println(b+"is greater");
}
else{
System.out.print(b);
}
}
}
}

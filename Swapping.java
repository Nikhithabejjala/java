import java.util.*;Add commentMore actions
public class Swapping{
     public static void main(String[] args){
       int [] a=new int[5];
	   Scanner sc=new Scanner(System.in);
	   for(int i=0;i<a.length;i++){
	       a[i]=sc.nextInt();
		}
		int i=0;
		int j=a.length-1;
		while(i<j){
		    int temp=0;
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
			
	    }
		for(int k=0;k<a.length;k++){
		   System.out.println(a[k]);Add commentMore actions
		}
		
	  }
	}
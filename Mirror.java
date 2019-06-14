import java.util.*;
import java.lang.*;
import java.io.*;
 public class Mirror
{
	public static void main (String[] args) 
	{
        int no,rem,rev=0;
        int k;
  Scanner sc=new Scanner(System.in);
  no=sc.nextInt();
 k=sc.nextInt();
while(no!=0)
{
rem=no%10;
rev=rev*10+rem;
no=no/10;
}
if(rev==k)
System.out.println("yes");
else
System.out.println("no");


}
    } 

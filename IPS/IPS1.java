import java.util.*;
public class IPS1
{
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     for(int i=0;i<8;i++)
     {
       for(int j=0;j<i;j++)
       {
         System.out.print(n);
       }
       System.out.println();
     }
   }
}

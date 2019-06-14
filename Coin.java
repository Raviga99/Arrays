import java.util.*;
public class Coin
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int n,i,result=0;
n=in.nextInt();
int arr1[]=new int[]{25,10,5,1};
int arr2[]=new int[n];
for(i=0;i<4;i++)
{
arr2[i]=n/arr1[i];
n=n-(arr1[i]*arr2[i]);
result=result+arr2[i];
}
System.out.print(result);
}
}
//INPUT:16
//OUTPUT:3

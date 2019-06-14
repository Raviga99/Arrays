import java.util.*;
public class Profit
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int n,i,j,result=0,temp=0,temp1=0;
n=in.nextInt();
int arr[]=new int[n];
for(i=0;i<n;i++)
{
arr[i]=in.nextInt();
}
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
temp=arr[j]-arr[i];
if(temp>temp1)
{
temp1=temp;
result=temp;
}
}
}
System.out.print(result);
}
}
//INPUT:4      200,200,200,200
//OUTPUT:0
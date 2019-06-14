import java.util.*;
public class Missingnumber
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int n,i,j,temp=0,count=0,result=-1;
n=in.nextInt();
int arr[]=new int[n];
for(i=0;i<n;i++)
{
arr[i]=in.nextInt();
}
for(i=0;i<n-1;i++)
{
temp=arr[i];
for(j=0;j<n;j++)
{
if(arr[j]==temp+1)
count++;
}
if(count==0)
result=temp+1;
count=0;
}
System.out.print(result);
}
}
//INPUT:3   1,4,2
//OUTPUT:3
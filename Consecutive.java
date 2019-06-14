import java.util.*;
public class Consecutive
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int n,i,j,count=0,temp=0,result=0;
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
if(arr[i]>arr[j])
{
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
for(i=0;i<n-1;i++)
{
if(arr[i+1]==arr[i]+1)
{
count++;
}
else
count=0;
if(count>result)
{
result=count;
}
}
System.out.print(result+1);
}
}
//INPUT:7   100,200,99,3,4,2,1
//OUTPUT:4



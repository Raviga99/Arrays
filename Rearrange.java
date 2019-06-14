import java.util.*;
public class Rearrange
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int n,i,j,count=0,temp=0,x=0;
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
temp=arr[j];
arr[j]=arr[i];
arr[i]=temp;
}
}
}
for(i=0;i<=arr[n-1];i++)
{
x=0;
for(j=0;j<n;j++)
{
if(arr[j]==i)
x++;
}
if(x>=1)
System.out.print(i+" ");
else
System.out.print("-1 ");
}
}
}
//INPUT:6    6,1,9,3,2,4
//OUTPUT:-1,1,2,3,4,-1,6,-1,-1,9
import java.util.*;
public class Kthsmallest
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int n,i,j,k,temp=0;
n=in.nextInt();
k=in.nextInt();
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
System.out.print(arr[k-1]);
}
}
//INPUT:5   1,2,4,3,5    K=2
//OUTPUT:2
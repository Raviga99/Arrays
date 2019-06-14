import java.util.*;
public class Subarray
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int n,i,j,k,x=0,result=0;
n=in.nextInt();
int arr[]=new int[n];
for(i=0;i<n;i++)
{
arr[i]=in.nextInt();
}
for(i=0;i<n;i++)
{
for(j=i;j<n;j++)
{
result=0;
for(k=i;k<=j;k++)
{
System.out.print(arr[k]);
result=result+arr[k];
}
if(result==0)
x++;
}
}
if(x>0)
System.out.print("true");
else
System.out.print("false");
}
}
//INPUT:5   4,3,-3,1,6
//OUTPUT:TRUE
import java.util.*;
public class Pivot
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int n,i,pivot;
n=in.nextInt();
int arr[]=new int[n];
String str="";
for(i=0;i<n;i++)
{
arr[i]=in.nextInt();
}
pivot=in.nextInt();
for(i=0;i<n;i++)
{
if(arr[i]<pivot)
str=str+arr[i]+" ";
}
for(i=0;i<n;i++)
{
if(arr[i]==pivot)
str=str+arr[i]+" ";
}
for(i=0;i<n;i++)
{
if(arr[i]>pivot)
str=str+arr[i]+" ";
}
System.out.print(str);
}
}
//INPUT:5 6,7,2,3,8   PIVOT=6
//OUTPUT:2,3,6,7,8
import java.util.*;
public class Commonelements
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int n1,n2,n3,i,j,k;
n1=in.nextInt();
n2=in.nextInt();
n3=in.nextInt();
int arr1[]=new int[n1];
int arr2[]=new int[n2];
int arr3[]=new int[n3];
for(i=0;i<n1;i++)
{
arr1[i]=in.nextInt();
}
for(i=0;i<n2;i++)
{
arr2[i]=in.nextInt();
}
for(i=0;i<n3;i++)
{
arr3[i]=in.nextInt();
}
for(i=0;i<n1;i++)
{
for(j=0;j<n2;j++)
{
if(arr1[i]==arr2[j])
{
for(k=0;k<n3;k++)
{
if(arr1[i]==arr3[k])
System.out.print(arr1[i]+" ");
}
}
}
}
}
}
//INPUT:3     1,2,3
//          2    1,2
//          4    1,2,3,4
//OUTPUT:1,2








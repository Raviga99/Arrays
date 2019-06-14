import java.util.*;
public class Largeprimefactor
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int n,k=0,i,j,count,temp=0,output=0,result=0;
int arr[]=new int[100];
n=in.nextInt();
for(i=2;i<=n;i++)
{
count=0;
for(j=2;j<=i;j++)
{
if(i%j==0)
count++;
}
if(count==1)
{
arr[k]=i;
result=n%arr[k];
k++;
if(result==0 && i>temp)
{
output=i;
}
}
}
System.out.print(output);
}
}
//INPUT:6
//OUTPUT:3

import java.util.*;
public class Freqsort
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int n,i,j,k=0,count=1,temp=0;
n=in.nextInt();
int arr[]=new int[n];
int arr1[][]=new int[n][2];
for(i=0;i<n;i++)
{
arr[i]=in.nextInt();
}
for(i=0;i<n;i++)
{
count=1;
for(j=i+1;j<n;j++)
{
if(arr[i]==arr[j])
{
count++;
arr[j]=0;
}
}
if(arr[i]!=0)
{
arr1[k][0]=count;
arr1[k][1]=arr[i];
k++;
}
}
for(i=0;i<k;i++)
{
System.out.println(arr1[i][0]+ " "+arr1[i][1]);
}
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if((arr[i]!=0 || arr[j]!=0)&&(arr1[i][0]==arr1[j][0]))
{
if(arr1[i][1]>arr1[j][1])
{
temp=arr1[i][1];
arr1[i][1]=arr1[j][1];
arr1[j][1]=temp;
}
}
else if(arr1[i][0]<arr1[j][0])
{
temp=arr1[i][0];
arr1[i][0]=arr1[j][0];
arr1[j][0]=temp;
temp=arr1[i][1];
arr1[i][1]=arr1[j][1];
arr1[j][1]=temp;
}
}
}
for(i=0;i<n;i++)
{
temp=arr1[i][0];
while(temp>0)
{
System.out.print(arr1[i][1]);
temp--;
}
}
}
}
//INPUT:5 5,5,4,6,4
//OUTPUT:4,4,5,5,6
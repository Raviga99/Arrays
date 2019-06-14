import java.util.*;
public class Firstrepeating
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int n,i,j,count=0,temp=0;
n=in.nextInt();
int arr[]=new int[n];
int freq[]=new int[n];
for(i=0;i<n;i++)
{
arr[i]=in.nextInt();
freq[i]=-1;
}
for(i=0;i<n;i++)
{
count=1;
for(j=i+1;j<n;j++)
{
if(arr[i]==arr[j])
{
count++;
freq[j]=0;
}
}
if(freq[i]!=0)
{
freq[i]=count;
}
}
for(i=0;i<n;i++)
{
if(freq[i]>=2)
{
System.out.print(arr[i]);
break;
}
}
}
}
//INPUT:7    10,5,3,4,3,5,6
//OUTPUT:5
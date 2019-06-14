import java.util.*;
public class Segregate
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int n;
n=in.nextInt();
int left=0,right=n-1,temp=0,i;
int arr[]=new int[n];
for(i=0;i<n;i++)
arr[i]=in.nextInt();
while(left<right)
{
while(arr[left]%2==0 && left<right)
left++;
while(arr[right]%2==1 && left<right)
right--;
if(left<right)
{
temp=arr[left];
arr[left]=arr[right];
arr[right]=temp;
left++;
right--;
}
}
for(i=0;i<n;i++)
System.out.print(arr[i]);
}
}
//INPUT:5  1,0,1,0,1
//OUTPUT:0,0,1,1,1
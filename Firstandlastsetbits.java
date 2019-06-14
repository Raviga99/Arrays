import java.util.*;
public class Firstandlastsetbits
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int n,rem=0,count=0,i,l;
n=in.nextInt();
String str="";
while(n>0)
{
rem=n%2;
str=rem+str;
n=n/2;
}
l=str.length();
char ch[]=str.toCharArray();
if(ch[0]=='1' && ch[l-1]=='1')
{
for(i=1;i<l-2;i++)
{
if(ch[i]=='1')
count++;
}
if(count==0)
System.out.print("True");
else
System.out.print("False");
}
else
System.out.print("False");
}
}
//INPUT:9
//OUTPUT:TRUE
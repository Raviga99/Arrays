import java.util.*;
public class Binarygap
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int n,rem=0,count=0,i,j,l,len,temp=0,result=0,k,len1;
n=in.nextInt();
String str="";
String str1="";
String str2="";
while(n>0)
{
rem=n%2;
str=rem+str;
n=n/2;
}
l=str.length();
for(i=0;i<l;i++)
{
for(j=i+1;j<=l;j++)
{
str1=str.substring(i,j);
str2=str2+str1+" ";
}
}
String[] str3=str2.split(" ");
len1=str3.length;
for(k=0;k<len1;k++)
{
len=str3[k].length();
if(len>2)
{
char ch[]=str3[k].toCharArray();
if(ch[0]=='1' && ch[len-1]=='1')
{
count=0;
for(i=1;i<len-1;i++)
{
if(ch[i]=='0')
count++;
}
if(count==len-2 && count>temp)
{
temp=count;
result=count;     
}
}
}
}    
System.out.print(result);                                                                                                                               
}
}
//INPUT:9 
//OUTPUT:2
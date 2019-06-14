import java.util.*;
public class Arraypattern
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int n,temp=0;
n=in.nextInt();
temp=n;
System.out.print(n+" ");
while(n>0)
{
n=n-5;
System.out.print(n+" ");
}
while(n<temp)
{
n=n+5;
System.out.print(n+" ");
}
}
}
//INPUT:16
//OUTPUT:16 11 6 1 -4 1 6 11 16

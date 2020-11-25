import java.util.Scanner;
public class EvenSum{
public static void main (String args[]){

int sum=0,total=0, evenNumber=2, n=10;
while(total != n)
{
    total++;
    sum+= evenNumber;
    evenNumber+= 2;
}
System.out.println("Sum of first 10 even numbers are: "+sum);
}
}
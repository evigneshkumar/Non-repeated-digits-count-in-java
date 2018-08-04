import java.util.*;
 
class nrd
{
public static void main(String args[])
{
 //getting the input using Scanner
Scanner sc= new Scanner(System.in);
int input = sc.nextInt();
int count=0;
 //To convert the given number into an array element
ArrayList<Integer> list = new ArrayList<Integer>();

 //To add the digits to the list
while(input>0)
{
list.add(input%10);
input=input/10;
}

for(Integer i: list)
{
 //to check for the frequency
int x= Collections.frequency(list,i);
if(x==1)
count++;
}

System.out.println("Non repeated digit count is " + count);
}
}

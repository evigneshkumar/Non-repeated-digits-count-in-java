import java.util.*;
 
class nrd
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int input = sc.nextInt();
int count=0;
ArrayList<Integer> list = new ArrayList<Integer>();

while(input>0)
{
list.add(input%10);
input=input/10;
}

for(Integer i: list)
{
int x= Collections.frequency(list,i);
if(x==1)
count++;
}

System.out.println("Non repeated digit count is " + count);
}
}
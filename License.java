import java.util.Scanner;
class Details {
public static void main(String[] args) {
int age;
System.out.println("Enter your age: ");
Scanner s = new Scanner(System.in);
age = s.nextInt();
if(age >= 18)
System.out.println("You are eligible to apply driving license");
else
System.out.println("You are not elgible to apply driving license");
int choose;
System.out.println("choose your Gender: 1. MALE\t2. FEMALE\t");
Scanner a = new Scanner(System.in);
choose = a.nextInt();
switch(choose)
{
case 1 : System.out.println("you choosed MALE");
break;
case 2 : System.out.println("you choosed FEMALE");
}
}
}



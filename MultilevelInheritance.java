import java.util.*;
class Person
{
String name;
String gender;
String address;
int age;
Person()
{
Scanner sc2=new Scanner(System.in);
System.out.println("enter person name :");
name=sc2.next();

System.out.println("enter person  gender:");
gender=sc2.next();



System.out.println("enter person  address:");
address=sc2.next();

System.out.println("enter person  age:");
age=sc2.nextInt();


}
}


class Employee
{
int empid;
String company_name;
String qualification;
double salary;

Employee()
{
Scanner sc2=new Scanner(System.in);
System.out.println("enter employee   id:");
empid=sc2.nextInt();

System.out.println("enter employee  company name:");
company_name=sc2.next();
System.out.println("enter employee  qualification:");
qualification=sc2.next();

System.out.println("enter employee  salary:");
salary=sc2.nextDouble();


}
}
class Teacher extends Employee
{
String department;
String subject;
Teacher()
{
Scanner sc3=new Scanner(System.in);
System.out.println("enter  department:");
department=sc3.next();

System.out.println("enter  subject:");
subject=sc3.next();
}
void display()
{
System.out.println("................................");
System.out.println("id:" +empid);
System.out.println("NAME :" +name);
System.out.println("SALARY :" +salary);
System.out.println("ADDRESS :" +address);
System.out.println("DEPARTMENT:" +department);
System.out.println("SUBJECT :" +subject);
System.out.println("...............................");
}

}
class MultilevelInheritance
{
public static void main(String args[])
{
int n;
Scanner sc1=new Scanner(System.in);
System.out.println("enter number of employees:");
n=sc1.nextInt();
Teacher t[]= new Teacher[n];
for(int i=0;i<n;i++)
{
t[i]=new Teacher();

}
System.out.println("...............................");
System.out.println("...............................");
System.out.println("THE DETAILS ARE...:");
System.out.println("...............................");

for(int i=0;i<n;i++)
{

t[i].display();
}
}  
}

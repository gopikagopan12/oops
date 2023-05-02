import java.util.*;
class Employee
{
int empid;
String name;
double salary;
String address;
Employee()
{
Scanner sc2=new Scanner(System.in);
System.out.println("enter employee id");
empid=sc2.nextInt();
System.out.println("enter employee name:");
name=sc2.next();
System.out.println("enter employee salary");
salary=sc2.nextDouble();
System.out.println("enter employee address");
address=sc2.next();
}
}
class Teacher extends Employee
{
String department;
String subject;
Teacher()
{

Scanner sc3=new Scanner(System.in);
System.out.println("enter departement");
department=sc3.next();
System.out.println("enter suvbje4ct");
subject=sc3.next();
}
void display()
{
System.out.println("_____________");
System.out.println("id:"+empid);
System.out.println("Name:"+name);
System.out.println("Salary:"+salary);
System.out.println("Address:"+address);
System.out.println("Department:"+department);
System.out.println("Subject:"+subject);
System.out.println("_______________");
}
}
class Multi
{
public static void main(String args[])
{
int n;
Scanner sc1=new Scanner(System.in);
System.out.println("enter number of employee");
n=sc1.nextInt();
Teacher t[]=new Teacher[n];
for(int i=0;i<n;i++)
{
t[i]=new Teacher();
}
System.out.println("_______________");
System.out.println("_______________");
System.out.println("THE DEATILS ARE....");
System.out.println("______________");
for(int i=0;i<n;i++)
{
t[i].display();
}
}
}



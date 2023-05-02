import java.util.Scanner;
class Person {
String Name;
String Gender;
String Address;
int Age;
Person(String name,String
gender,String address,int age)
{
 this.Name = name;
 this.Gender = gender;
 this.Address = address;
 this.Age = age;
 }
 }
 class Employee extends Person
 {
 int Empid;
 String Company_name;
 String Qualification;
 long Salary;
Employee(String name,String gender,String address,int age,int empid,String company_name,String qualification,long salary)
 {
 super(name,gender,address,age);
 this.Empid=empid;
 this.Company_name=company_name;
 this.Qualification=qualification;
 this.Salary=salary;
 }
 }
 class Teacher extends Employee{
 String Subject;
 String Department;
 String Teacherid;
 Teacher(String name,String gender,String address,int age,int empid,String company_name,String qualification,long salary,String subject, String department,String teacherid) 
{
super(name,gender,address,age,empid,company_name,qualification,salary);
this.Subject=subject;
this.Department=department;
this.Teacherid=teacherid;
}
void display(){
System.out.println("Name:"+Name);
System.out.println("Gender:"+Gender);
System.out.println("Address:"+Address);
System.out.println("Age:"+Age);
System.out.println("Employee id:"+Empid);
System.out.println("Company Name:"+Company_name);
System.out.println("Qualification:"+Qualification);
System.out.println("Salary:"+Salary);
System.out.println("Subject:"+Subject);
System.out.println("Department:"+Department);
System.out.println("Teacher id:"+Teacherid);
}
public static void main(String[]args)
{
System.out.println("Enter the No. of Teacher's");
Scanner sc1 = new Scanner(System.in);
int num = sc1.nextInt();
Teacher arr[]=new Teacher[num];
System.out.println("Enter the Teacher Details");
int x = 0,j=0;
Scanner sc = new Scanner(System.in);
for(int i =0;i<num;i++)
{
x= i +1;
System.out.println(""+x+").");
System.out.println("Name:");
String a =sc.next();
System.out.println("Gender:" );
String b =sc.next();
System.out.println("Address:" );
String c =sc.next();
System.out.println("Age:");
int d =sc.nextInt();
System.out.println("Employee id:");
int e =sc.nextInt();
System.out.println("Company name:");
String f =sc.next();
System.out.println("Qualification: ");
String g =sc.next();
System.out.println("Salary: ");
long h =sc.nextLong();
System.out.println("Subject: ");
String k =sc.next();
System.out.println("Department: ");
String l =sc.next();
System.out.println("Teacher id: ");
String n =sc.next();
arr[i]=new Teacher(a,b,c,d,e,f,g,h,k,l,n);
}
sc.close();
System.out.println("\n**************informations of all the Teacher's***************");
for(int i=0;i<num;i++){
j=i+1;
System.out.println("\n"+j+").");
arr[i].display();
}
sc1.close();
}
}



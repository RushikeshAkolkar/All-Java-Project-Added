import java.util.*;
class Employee
{
private int id;
private String name;
private String dept;
private float sal;
float total;
public float gettotal()
{
total=total+sal;
return total;
}
public void accept()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter id name salary\n");
id=s.nextInt();
name=s.next();
sal=s.nextFloat();
}
public void display()
{
System.out.println("id"+id+"name= "+name+"salary="+sal);
}
}
class Manager extends Employee
{
private float bonus;
public void accept();
{
Scanner s=new Scanner(System.in);
super.accept();
System.out.println("enter bonus");
bonus=s.nextFloat();
supper.total=bonus;
}
public void display()
{
super.display();
System.out.println("bonus\t"+bonus);
System.out.println("total=\t"+super.total);
}
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("How many employee do you want");
int n=s.nextInt();
Managar m[]=new Managar[n];
for(int i=0;i<n;i++)
{
System.out.println("enter employee id,name,salary");
e[i]=new Manager();
e[i].accept();
e[i].gettotal();
}
for(int i=0;i<n;i++)
{
e[i].display();
}
float max=e[0].total;
int temp=0;
for(int i=0;i<n;i++)
{
if(max<e[i].total)
{
max=e[i].total;
temp=i;
}
}
Sustem.out.println("manager max salary ");
e[tempp].display();
}
}
import java.util.*;
class Employee
{
private int id;
private String name;
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
System.out.println("id\n"+id+"\nname= "+name+"\nsalary="+sal);
}
}
class Managar extends Employee
{
private float bonus;
public void accept()
{
super.accept();
Scanner s=new Scanner(System.in);
System.out.println("enter bonus\t");
bonus=s.nextFloat();
super.total=bonus;
}
public void display()
{
super.display();
System.out.println("\nmbonus\t"+bonus);
System.out.println("\ntotal=\t"+super.total);
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
m[i]=new Managar();
m[i].accept();
m[i].gettotal();
}
for(int i=0;i<n;i++)
{
m[i].display();
}
float max=m[0].total;
int temp=0;
for(int i=0;i<n;i++)
{
if(max<m[i].total)
{
max=m[i].total;
temp=i;
}
}
System.out.println("manager max salary ");
m[temp].display();
}
}
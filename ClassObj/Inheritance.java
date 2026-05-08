class Employee
{
    int id;
    int salary;
    Employee(int id,int salary)
    {
        this.id=id;
        this.salary=salary;
        
    }
   
}
class SalesEmployee extends Employee
{
    int sales;
    
    SalesEmployee(int id,int salary,int sales)
    {
        super(id,salary);
        this.sales=sales;
        
    }
}
class Inheritance
{
    public static void main(String args[])
    {
      SalesEmployee st=new SalesEmployee(14,30000,20);  
      System.out.println(st.id+" "+st.salary);
      System.out.println(st.id+" "+st.salary+" "+st.sales);
    }
}
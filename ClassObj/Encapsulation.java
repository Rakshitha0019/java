class Person
{
    private String name="Geeks";
    private int age=10;
    public String getName()
    {
     return name;   
    }
    public int getAge()
    {
     return age;   
    }
    
    public void setName(String name)
    {
        this.name=name;
        
    }
    public void setAge(int age)
    {
        this.age=age;
    }
}
class Encapsulation
{
    public static void  main(String a[])
    {
       Person person=new Person();
       System.out.println(person.getName());
       person.setName("john");
        System.out.println(person.getName());
         person.setAge(21);
         System.out.println(person.getAge());
        
       
       
    }
}
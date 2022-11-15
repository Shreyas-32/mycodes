class Student
{
    private int id;
    private String name;

    public void setId(int id)
    {
        this.id=id;
    }

    public int getId()
    {
        return id;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public String getName()
    {
        return name;
    }
}

public class Encapsulation
{
    public static void main(String[] args)
    {
        Student s = new Student();
        s.setId(25);
        System.out.println("The actual ID is "+s.getId());

        s.setName("Shreyas");
        System.out.println(s.getName());

    }
}

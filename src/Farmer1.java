import java.util.*;
class F1
{
    private float pa;
    private float ri;
    private float sv;
    private float time;

    void display()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount");
        pa=sc.nextFloat();
        System.out.println("Enter the Time Duration");
        time=sc.nextFloat();
        ri=2.5f;
    }
    void input()
    {
        sv=(pa*time*ri)/100;
    }
    void show()
    {
        System.out.println("The simple interst is "+sv);
    }


}
public class Farmer1
{
    public static void main(String[] args)
    {
        F1 f=new F1();
        f.display();
        f.input();
        f.show();

        F1 f2 = new F1();
        f2.display();
        f2.input();
        f2.show();
    }

}

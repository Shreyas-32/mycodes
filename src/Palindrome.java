public class Palindrome
{
    public static void main(String[] args)
    {
        int n=2552;
        int rev=0;
        int org_num=n;
        boolean flag =false;
        while(n!=0)
        {
            rev=rev*10+n%10;
            n=n/10;
        }
        System.out.println("The reverse number is "+rev);
        if(org_num==rev)
        {
            System.out.println("The number is " +rev + " is palindrome number");
            flag=true;
        }
        else {
            System.out.println(+org_num + " IT IS NOT A PALINDROME NUMBER");
        }
    }

}

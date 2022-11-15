public class Duplichar
{
    public static void main(String[] args)
    {
        String s ="Great Responsibility";
        boolean flag=false;
        char ar[]=s.toCharArray();
        for(int i=0;i<=s.length()-1;i++)
        {
            for(int j=i+1;j<=s.length()-1;j++)
            {
                if(ar[i]==ar[j])
                {
                    System.out.println("THE DUPICATE CHARCTERS ARE found " +ar[j]);
                    flag=true;
                }
            }
        }
        if(flag==false)
        {
            System.out.println("THE DUPICATE CHARCTERS ARE NOT FOUND ");
        }

    }
}

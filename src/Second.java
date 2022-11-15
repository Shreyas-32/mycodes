public class Second
{
    public static void main(String[] args)
        {
            int ar[]={54,52,98,86,54,52,104,104};
            boolean flag=false;
            for(int i=0;i<=ar.length-1;i++)
            {
                for(int j=i+1;j<=ar.length-1;j++)
                {
                    if(ar[i]==ar[j])
                    {
                        System.out.println("THE DUPLICATE INTEGERS ARE " +ar[j]);
                        flag=true;
                    }
                }
            }
            if(flag==false)
            {
                System.out.println("The dupicates are not found");
            }

        }
}

public class Duplicates
{
    public static void main(String[] args)
    {
        String arr[] ={"bunny","sunny","sunny","naveen","kilash","naveen","bunny"};
        boolean Flag =false;
        for(int i=0;i<=arr.length-1;i++)
        {
            for(int j=i+1;j<=arr.length-1;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println("The duplicates are found "+arr[j]);
                    Flag=true;

                }
            }
            if(Flag==false)
            {
                System.out.println("The duplicates are not found");
            }
        }
    }
}

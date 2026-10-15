public class prime {
    public static void main(String args[])
    {
        int no=42;
        boolean res=false;
        for(int i=2;i<=no/i;i++)
        {
            if(no%i==0)
            {
                res=true;
                System.out.println("Number is not  Prime");
                break;
            }
   
        }
        if(!res)
        {
            System.out.println("Number is  prime");
        }
    
    }
    
}

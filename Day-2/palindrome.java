public class palindrome {
    public static void  main(String args[])
    {
     int no=121;
     int res,rev=0;
     int palin=no;
     while(no>0)
     {
         res=no%10;
         rev=rev*10+res;
         no/=10;
     }
     if(rev==palin)
     {
     System.out.println("Number is palindrome");
     }
     else{
        System.out.println("Number is not plaindrome");
     }
    }
    
}

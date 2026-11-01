public class reverse {
    public static void main(String args[])
    {
      int no=123,n=0;
      int res=0;
      while(no>0)
      {
       n=no % 10;
       res=res*10 +n;
       no = no / 10;
         }
         System.out.println("Reverse of number:"+res);
    }
    
}

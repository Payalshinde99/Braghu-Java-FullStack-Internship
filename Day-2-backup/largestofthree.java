public class largestofthree {
    public static void main(String args[])
    {
      int a=10,b=20,c=30;
      if(a>b && a>c)
      {
            System.out.println("No a is largest among three values");
        
      }
      else if (b>c && b>a){
        System.out.println("No. b is largest among three numbers");
      }
       else{
            System.out.println("No. c is largest among three numbers");
        }
    }
    
}

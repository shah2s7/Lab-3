import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int num;

    System.out.println("Enter a number to count down or up from: ");
    num = s.nextInt();

    if(num < 0) 
    {
      for(int i = num; i <=0; ++i)
      {
        System.out.println(i);
      }
      
    }
    else 
    {

      for(int i = num;  i >=0; --i)
      {
        System.out.println(i);
      }
      
    }

      System.out.println("Blast off!");

  }
}
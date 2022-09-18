import java.util.Scanner;
class Main {
    static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
 
    public static void main(String args[])
    {
      Scanner scnr = new Scanner(System.in);
      int n = 0, choice;
      System.out.println("Up to what number do you want to print the series out?");
      choice = scnr.nextInt();
      while(fib(n) <= choice){
        System.out.print(fib(n) + " ");
        n++;
      }
    }
}

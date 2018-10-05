import java.util.Scanner;
class Main {

    public static void main(String[] args) {
      int num;
      Scanner read=new Scanner(System.in);
      System.out.println("enter the num");
      num =read.nextInt();

        int count = 0;

        while(num != 0)
        {
            // num = num/10
            num /= 10;
            ++count;
        }

        System.out.println("Number of digits: " + count);
    }
}
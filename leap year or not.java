import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int num;
    Scanner read=new Scanner(System.in);
    System.out.println("enter a number:");
     num=read.nextInt();
    if(num %2==0)
    System.out.println("yes");
    else
    System.out.println("no");
  }
  }

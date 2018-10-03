class Main {
  public static void main(String[] args) {
       int leapYear = 1900; 

        while (leapYear <= 2020) { 
            for (int x = 0; x < 10; x++) {
                System.out.print(leapYear + " "); 
                leapYear = leapYear + 4;
            }
            System.out.println();
    }
}
}
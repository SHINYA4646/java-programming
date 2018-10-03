class Main
{
	public static void main (String[] args) 
	{
		String name ="shiny1998";
      count(name);
    }
      public static void count(String x){
        char[] test=x.toCharArray();
        int letter=0;
        int number=0;
        for(int i=0;i<x.length();i++){
          if(Character.isLetter(test[i]))
            letter++; 
          else if(Character.isDigit(test[i]))
            number++;
        }
          System.out.println("letter"+letter);
          System.out.println("number"+number);
          int alphanumeric;
          alphanumeric=letter+number;
          System.out.println("alphanumeric"+alphanumeric);
        }
      }
          
          
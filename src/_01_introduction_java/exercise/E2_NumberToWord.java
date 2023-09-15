package _01_introduction_java.exercise;
import java.util.Scanner;
public class E2_NumberToWord {
   public static void main(String[] args) {
      while (true){
         Scanner scanner = new Scanner(System.in);
         System.out.println("Input number to word: ");
         int number = scanner.nextInt();
         if(number>=0 && number<10){
         String word = OneNumber(number);
         System.out.println(word);
       //  break;
         }else if(number<100){
            String word = TwoNumber(number);
            System.out.println(word);
         } else if (number<1000) {
            String word = ThreeNumber(number);
            System.out.println(word);
         }else {
            System.out.println("out of ability");
         }
      }
}
   public static String OneNumber(int number) {
      String word;
      switch (number) {
         case 0:
            word = "zero";
            break;
         case 1:
            word = "one";
            break;
         case 2:
            word = "two";
            break;
         case 3:
            word = "three";
            break;
         case 4:
            word = "four";
            break;
         case 5:
            word = "five";
            break;
         case 6:
            word = "six";
            break;
         case 7:
            word = "seven";
            break;
         case 8:
            word = "eight";
            break;
         case 9:
            word = "nine";
            break;
         default:
            word = "Invalid number";
      }
      return word;
   }
   private static String TwoNumber(int number){
      String result= "";
      if(number< 20){
         switch (number){
            case 11:
               return "eleven";
            case 12:
               return "twelve";
            case 13:
               return "thirteen";
            case 14:
               return "fourteen";
            case 15:
               return "fifteen";
            case 16:
               return "sixteen";
            case 17:
               return "seventeen";
            case 18:
               return "eighteen";
            case 19:
               return "nineteen";
         }
      }
      else {
         int teens= number / 10;
         int ones= number % 10;

         switch (teens){
            case 2:
               result= "twenty ";
               break;
            case 3:
               result= "thirty ";
               break;
            case 4:
               result= "forty ";
               break;
            case 5:
               result= "fifty ";
               break;
            case 6:
               result= "sixty ";
               break;
            case 7:
               result= "seventy ";
               break;
            case 8:
               result= "eighty ";
               break;
            case 9:
               result= "ninety ";
               break;
         }

         if(ones!= 0){
            result+=  OneNumber(ones);
         }
      }

      return result;
   }
   private static String ThreeNumber(int number){
      String result= "";
      int hundreds= number / 100;
      int others= number - (hundreds * 100);
      switch (hundreds){
         case 1:
            result = "one hundred and ";
            break;
         case 2:
            result = "two hundred and ";
            break;
         case 3:
            result = "three hundred and ";
            break;
         case 4:
            result = "four hundred and ";
            break;
         case 5:
            result = "five hundred and ";
            break;
         case 6:
            result = "six hundred and ";
            break;
         case 7:
            result = "seven hundred and ";
            break;
         case 8:
            result = "eight hundred and ";
            break;
         case 9:
            result = "nine hundred and ";
            break;
      }

      if(others!= 0){
         result+= TwoNumber(others);
      }
      else {
         return "one hundred";
      }

      return result;
   }
}

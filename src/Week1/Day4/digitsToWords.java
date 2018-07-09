package Week1.Day4;

public class digitsToWords {
     public void convert(int a) {
         int first;
         int second;
         int third;
         third = a /100;
         first = (a % 100)/10;
         second =(a % 10)%10;

         String stringOfNumber = "";
         String stringOfNumber2 = "";

          if (a>20 ||a<=10){
              if(first == 0){
                  stringOfNumber += singleNumberToString(second);
              }
              else if(first == 1){
                  stringOfNumber += "Ten";
              }
              else if(first == 2){
                  stringOfNumber += "Twenty " + singleNumberToString(second);
              }
              else if(first == 3){
                  stringOfNumber += "Thirty " + singleNumberToString(second);
              }
              else if(first == 4){
                  stringOfNumber += "Fourty " + singleNumberToString(second);
              }
              else if(first == 5){
                  stringOfNumber += "Fifty " + singleNumberToString(second);
              }
              else if(first == 6){
                  stringOfNumber += "Sixty " + singleNumberToString(second);
              }
              else if(first == 7){
                  stringOfNumber += "Seventy " + singleNumberToString(second);
              }
              else if(first == 8){
                  stringOfNumber += "Eighty " + singleNumberToString(second);
              }
              else if(first == 9){
                  stringOfNumber += "Ninety " + singleNumberToString(second);
              }
          }
          else if(a>10 && a<20){
              if (a == 11){
                  stringOfNumber += "Eleven";
              }
              else if (a == 12){
                  stringOfNumber += "Tweleve";
              }
              else if (a == 13){
                  stringOfNumber += "Thirteen";
              }
              else if (a == 14){
                  stringOfNumber += "Fourteen";
              }
              else if (a == 15){
                  stringOfNumber += "Fifteen";
              }
              else if (a == 16){
                  stringOfNumber += "Sixteen";
              }
              else if (a == 17){
                  stringOfNumber += "Seventeen";
              }
              else if (a == 18){
                  stringOfNumber += "Eighteen";
              }
              else if (a == 19){
                  stringOfNumber += "Nineteen";
              }
          }

         if (a>=100 && a<1000){
             if (a == 100){
                 stringOfNumber2 += "One Hundred";
             }
             else if (a == 200){
                 stringOfNumber2 += "Two Hundred";
             }
             else if (a == 300){
                 stringOfNumber2 += "Three Hundred";
             }
             else if (a == 400){
                 stringOfNumber2 += "Four Hundred";
             }
             else if (a == 500){
                 stringOfNumber2 += "Five Hundred";
             }
             else if (a == 600){
                 stringOfNumber2 += "Six Hundred";
             }
             else if (a == 700){
                 stringOfNumber2 += "Seven Hundred";
             }
             else if (a == 800){
                 stringOfNumber2 += "Eight Hundred";
             }
             else if (a == 900){
                 stringOfNumber2 += "Nine Hundred";
             }
         }
         else if (a>=100 && a<1000){
             if (third == 1){
                 stringOfNumber2 += "One Hundred and " + stringOfNumber;
             }
             else if (third == 2){
                 stringOfNumber2 += "Two Hundred and " + stringOfNumber;
             }
             else if (third == 3){
                 stringOfNumber2 += "Three Hundred and " + stringOfNumber;
             }
             else if (third == 4){
                 stringOfNumber2 += "Four Hundred and " + stringOfNumber;
             }
             else if (third == 5){
                 stringOfNumber2 += "Five Hundred and " + stringOfNumber;
             }
             else if (third == 6){
                 stringOfNumber2 += "Six Hundred and " + stringOfNumber;
             }
             else if (third == 7){
                 stringOfNumber2 += "Seven Hundred and " + stringOfNumber;
             }
             else if (third == 8){
                 stringOfNumber2 += "Eight Hundred and " + stringOfNumber;
             }
             else if (third == 9){
                 stringOfNumber2 += "Nine Hundred and " + stringOfNumber;
             }
         }
            System.out.println(stringOfNumber2);
     }

      public String singleNumberToString(int a) {
              if (a == 1) {
                  return "One";
              } else if (a == 2) {
                  return "Two";
              } else if (a == 3) {
                  return "Three";
              } else if (a == 4) {
                  return "Four";
              } else if (a == 5) {
                  return "Five";
              } else if (a == 6) {
                  return "Six";
              } else if (a == 7) {
                  return "Seven";
              } else if (a == 8) {
                  return "Eight";
              } else if (a == 9) {
                  return "Nine";
              }
              return "";
      }
}
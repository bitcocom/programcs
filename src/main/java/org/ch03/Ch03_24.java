package org.ch03;

public class Ch03_24 {
    public static void main(String[] args) {
        // 구구단
        /*
         2X1= 2  3X1= 3  4X1= 4................9X1= 9
         2X2= 4  3X2= 6  4X2= 8................9X2=19
         2X3= 6  3X3= 9  4X3=12................9X3=27
           |       |        |                    |

         2X9=18  3X9=27  4X9=36................9X9=81
         */
       for(int i=1;i<10;i++) {
           for (int j = 2; j < 10; j++) {
               if ((j * i) < 10) { // i=1,2,3,4,,,,,9
                   System.out.print(j + "X" + i + "= " + (j * i) + "\t");
               } else {
                   System.out.print(j + "X" + i + "=" + (j * i) + "\t");
               }
           }
           System.out.println();
       }
    }
}

package org.ch03;

public class Ch03_22 {
    public static void main(String[] args) {
        // 이중 for
        /*
           for(int i=0;i<5;i++){ // i->0,1,2,3,4
             for(int j=0;j<5;j++) //j->0,1,2,3,4
                반복할 문장(5*5=25번)
             }
           }
         */
        /*
         ★★★★★
         ★★★★★
         ★★★★★
         ★★★★★
         ★★★★★
         */
      for(int i=0;i<5;i++) {
          for (int j = 0; j < 5; j++) { // j=0,1,2,3,4
              System.out.print("★"); // ★★★★★
          }//
          System.out.println();
      }//
       /*
         ★
         ★★
         ★★★
         ★★★★
         ★★★★★
       */
       for(int i=0;i<5;i++) { // i=0,1,2,3,4
           for (int j = 0; j <= i; j++) { //
               System.out.print("★"); // ★
           }
           System.out.println();
       }
    }
}

import java.util.Scanner;

public class hienthisont {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;
        System.out.println("20 so nguyen to dau tien la: ");
      while (count<20){
          boolean so = true;
          for (int i=2;i<= Math.sqrt(number);i++){
              if (number %i ==0){
                  so = false;
                  break;

              }
          }
          if (so){
              System.out.print(number + " ");
              count++;

          }
          number++;
      }





    }
}

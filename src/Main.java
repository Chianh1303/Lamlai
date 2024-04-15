import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhap vao day");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        boolean check = true;
        if (input <2){
            System.out.println("khong la so nt");
        }
        for(int i =2; i < input-1;i++){
        if (input % i == 0){
            check = false;

        }else {
          check = true;
        }
    }
if(check==true){
    System.out.println("La so nguyen to");
}else {


    System.out.println("lp la sp nt");
}
    }
}

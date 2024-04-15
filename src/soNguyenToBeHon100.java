public class soNguyenToBeHon100 {
    public static void main(String[] args) {
        System.out.println("So nguyen to be hon 100 là: ");
        for (int i=2;i<100;i++){
            boolean so = true;
            for (int j =2;j<=Math.sqrt(i);j++){
                if (i % j==0){
                    so = false;
                    break;
                }
            }
            if (so){
                System.out.println(i + " ");
            }
        }
    }
}

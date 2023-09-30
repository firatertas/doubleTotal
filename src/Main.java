import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int total=0;
        int n;
        do {
            System.out.print("Sayı giriniz : ");
            n = sc.nextInt();
            if (n % 2 == 0 && n % 4 ==0){
                total+=n;
            }
        }while (n % 2 != 1);
        System.out.println("Toplam : "+total);
    }
}
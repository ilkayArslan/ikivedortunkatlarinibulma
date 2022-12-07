import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int girilenSayi , sum=0;

        do {
            System.out.print("Lütfen Bir Sayi Giriniz : ");
            girilenSayi = input.nextInt();
            if (girilenSayi%4==0){
                sum+=girilenSayi;

            }
        }while (girilenSayi%2==0);
        System.out.println(sum);
    }
}
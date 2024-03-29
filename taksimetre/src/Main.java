import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    // taksimetre km başına 2.20 tl açılış 10 tl 20 tl den az tutar için 20 tl
        //değişkenleri tanımla

        double  km,price, tmac, hesap;

        Scanner input = new Scanner(System.in);

        System.out.print("KM Giriniz : ");
        km = input.nextDouble();

        price = (km * 2.2);
        tmac = price + 10;
        hesap = (tmac <= 20) ? 20 : tmac ;
        System.out.print("Ödenecek Tutar : " + hesap);



    }
}
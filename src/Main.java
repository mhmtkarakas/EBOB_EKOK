import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayiyi giriniz: ");
        int sayi1 = input.nextInt();

        System.out.print("ikinci sayiyi giriniz: ");
        int sayi2 = input.nextInt();

        int ebob = 1;
        int ekok = 2;
        int i =1;

        while(i<=sayi1 && i<=sayi2){
            if(sayi1%i==0 && sayi2%i==0){
                ebob=i;
            }
            i++;
        }
        ekok =(sayi1*sayi2)/ebob;
        System.out.println("EBOB: " +ebob);
        System.out.println("EKOK " +ekok);


    }
}
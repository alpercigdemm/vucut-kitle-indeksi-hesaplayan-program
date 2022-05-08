import  java.util.Scanner;

public class VucutKitleIndeksiHesaplayanProgram {

    public static void main(String[] args) {

        double boy,kilo,kitleEndeksi;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lutfen boyunuzu(metre cinsinde) giriniz: ");
        boy = inp.nextDouble();

        System.out.print("Lutfen kilonuzu giriniz: ");
        kilo = inp.nextDouble();

        kitleEndeksi = kilo / (boy * boy);

        System.out.println("Vucut Kitle Indeksiniz= " + kitleEndeksi);

    }
}

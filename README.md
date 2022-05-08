# Vücut Kitle İndeksi Hesaplayan Program

* Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
* Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

## Formül
* Kilo (kg) / (Boy(m) * Boy(m))

**CEVAP:**

```
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


```
www.patika.dev

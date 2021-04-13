package tugas3;

import tugas3.ruang.Balok;
import tugas3.ruang.Kerucut;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        boolean ulang = true;

        do{
            System.out.println();
            System.out.println("INPUT");
            System.out.println("1. BALOK");
            System.out.println("2. KERUCUT");
            System.out.println("3. EXIT");

            System.out.print("PILIH : ");
            int pilih = menu.nextInt();

            switch(pilih){
                case 1:
                        hitungBalok(input);
                    break;

                case 2:
                        hitungKerucut(input);
                    break;

                case 3:
                    ulang=false;
                    break;

                default:
                    System.out.println("MOHON MASUKKAN PILIHAN MENU DENGAN BENAR!!!");
                    break;
            }

        }while(ulang);
    }

     private static void hitungBalok(Scanner input){
        System.out.print("PANJANG\t = ");
        double panjang = input.nextInt();
        System.out.print("LEBAR\t = ");
        double lebar = input.nextInt();
        System.out.print("TINGGI\t = ");
        double tinggiBalok = input.nextInt();

        Balok balok = new Balok(panjang, lebar, tinggiBalok);

        balok.setPanjang(panjang);
        balok.setLebar(lebar);
        balok.setTinggiBalok(tinggiBalok);

        System.out.println();
        System.out.println("________OUTPUT________");
        System.out.println("LUAS PERSEGI\t\t\t = " + balok.luas());
        System.out.println("KELILING PERSEGI\t\t = " + balok.keliling());
        System.out.println("VOLUME BALOK\t\t\t = " + balok.volume());
        System.out.println("LUAS PERMUKAAN BALOK\t = " + balok.luasPermukaan());
    }

    private static void hitungKerucut(Scanner input){
        System.out.print("JARI-JARI\t = ");
        double jari = input.nextInt();
        System.out.print("TINGGI\t\t = ");
        double tinggiKerucut = input.nextInt();

        Kerucut kerucut = new Kerucut(jari, tinggiKerucut);

        kerucut.setJari(jari);
        kerucut.setTinggiKerucut(tinggiKerucut);

        System.out.println();
        System.out.println("________OUTPUT________");
        System.out.println("LUAS LINGKARAN\t\t\t = " + kerucut.luas());
        System.out.println("KELILING LINGKARAN\t\t = " + kerucut.keliling());
        System.out.println("VOLUME KERUCUT\t\t\t = " + kerucut.volume());
        System.out.println("LUAS PERMUKAAN KERUCUT\t = " + kerucut.luasPermukaan());
    }


}

package latihan;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class weton {


 public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Masukan tanggal lahirmu (format : dd/MM/yyyy)");
String tanggal = scan.nextLine();
    String [] arrTanggal = tanggal.split("/");
    int tanggal1 = Integer.parseInt(arrTanggal[0]);
    int bulan = Integer.parseInt(arrTanggal[1]);
    int tahun = Integer.parseInt(arrTanggal[2]);
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
LocalDate tanggalLahir = LocalDate.parse(tanggal, formatter);
    int jumlahHari = 0;
    for (int i = 1950; i < tahun; i++){
        if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0){
            jumlahHari += 366;
        } else {
            jumlahHari += 365;
        }
    }
    for (int i = 1; i < bulan; i++){
        if (i==2){
            if (tahun % 4 == 0 &&  i % 100 != 0 || i % 400 == 0){
                jumlahHari += 29;
            } else {
                jumlahHari +=28;
            }
        } else if (i == 4 || i == 6 || i == 9 || i == 11){
            jumlahHari += 30;
        } else {
            jumlahHari += 31;
        }
    }
    jumlahHari += tanggal1 - 1;
String[] arrWeton = { "Wage", "Kliwon", "Legi", "Pahing", "Pon"};
int indexWeton = jumlahHari % 5;
String weton = arrWeton[indexWeton];
@SuppressWarnings("deprecation")
Locale locale = new Locale("id","ID");
String namaHari = tanggalLahir.getDayOfWeek().getDisplayName(TextStyle.FULL, locale);
System.out.println("Kamu lahir pada hari " + namaHari + " " + weton);
System.out.println( "kamu lahir pada tanggal " + tanggal );

    }
}

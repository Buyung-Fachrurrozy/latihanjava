package latihan;
import java.util.Scanner;

public class jumlah_hari {

    public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
        System.out.println("Masukan bulan (1-12): ");
        int bulan =input.nextInt();
        
        System.out.println("Masukan tanggal : ");
        int tanggal =input.nextInt();
        
        int jumhari = hitungjumlahhari(tanggal,bulan);
        System.out.println("Jumlah hari dari tanggal "+ tanggal + " " + getnamabulan(bulan)
                + "sampai dengan " + getakhirbulan(bulan)+ " adalah "+ jumhari + " hari ");
    }
    
   }
    public static int hitungjumlahhari(int tanggal, int bulan){
        int jumhari = 0 ;
        int tanggalakhir = getakhirbulan(bulan);
        for ( int x = tanggal; x <= tanggalakhir; x++){
            jumhari++;
        }
     return jumhari;
    } 
    public static String getnamabulan(int bulan){
        String namabulan = "";
        switch (bulan){
            case 1:
                namabulan = "Januari " ;
                break;
            case 2:
                namabulan = "Februari " ;
                break;
            case 3:
                namabulan = "Maret" ;
                break;
            case 4:
                namabulan = "April " ;
                break;
            case 5:
                namabulan = "Mei " ;
                break;
            case 6:
                namabulan = "Juni " ;
                break;
            case 7:
                namabulan = "Juli " ;
                break;
            case 8:
                namabulan = "Agustus " ;
                break;
            case 9:
                namabulan = "September " ;
                break;
            case 10:
                namabulan = "Oktober " ;
                break;
            case 11:
                namabulan = "November " ;
                break;
            case 12:
                namabulan = "Desember " ;
                break;
        }
        return namabulan;   
    }
    public static int getakhirbulan(int bulan){
        int akhirbulan = 0 ;
        switch (bulan) {
            case 1, 3, 5, 7, 8, 10, 12:
                akhirbulan = 31;
                break;
            case 4, 6, 9, 11:
                akhirbulan = 30;
                break;
            case 2:
                akhirbulan = 28;
                break;
            default:
                System.out.println("Bulan yang salah!");
                break;
        }
        return akhirbulan;
    }
}
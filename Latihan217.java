import java.util.Scanner;

public class Latihan217 {
    public static void main(String[] args){
        Scanner input17 = new Scanner (System.in);

        double diskon = 0, Harga, total;
        String jenisBuku;
        int jumlahBuku;

        System.out.print("masukkan Jenis Buku: ");
        jenisBuku = input17.nextLine();
        System.out.print("masukkan Jumlah buku: ");
        jumlahBuku = input17.nextInt();
        System.out.print("masukkan Harga: ");
        Harga = input17.nextDouble();

        if (jenisBuku.equalsIgnoreCase("kamus")){
            if (jumlahBuku <= 2){
                diskon = 0.10;
            }else if (jumlahBuku > 2){
                diskon = 0.12;
            }
        }else if (jenisBuku.equalsIgnoreCase("Novel")){
            if (jumlahBuku == 1){
                diskon = 0.07;
            }else if (jumlahBuku <= 3){
                diskon = 0.08;
            }else if (jumlahBuku > 3){
                diskon = 0.09;
            }
        }else if (jumlahBuku > 3){
            diskon = 0.05;
        }else {
            diskon = 0;
        }
        total =  (Harga * jumlahBuku) - ((jumlahBuku * Harga) * diskon);
        System.out.println("total yang harus dibayar: Rp " + total); 



     }
}
    
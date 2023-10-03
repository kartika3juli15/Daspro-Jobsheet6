import java.util.Scanner;

public class Pemilihan2Percobaan317_1 { 
    public static void main(String[] args){
    Scanner input17 = new Scanner (System.in);
    
    String kategori;
    int penghasilan, gajiBersih;
    double pajak = 0;

    System.out.print("masukkan kategori : ");
    kategori = input17.nextLine();
    System.out.print("masukkan besarnya penghasilan : ");
    penghasilan = input17.nextInt();
    
    if (kategori.equals("pekerja")){
        if (penghasilan <= 2000000)
            pajak = 0.1;
        else if (penghasilan <= 3000000)
            pajak =0.15;
        else 
            pajak = 0.2;
        gajiBersih = (int) (penghasilan - (pajak * penghasilan));
        System.out.print("penghasil bersih : " + gajiBersih);

        } else if (kategori.equals("pebisnis")) {
        if (penghasilan <= 2500000)
            pajak = 0.1;
        else if (penghasilan <= 3500000)
            pajak =0.15; 
        else 
            pajak = 0.25;
        gajiBersih = (int) (penghasilan - (pajak * penghasilan));
        System.out.print("penghasil bersih : " + gajiBersih);
 } 
 else
    System.out.println("masukkan kategori salah");
            
    }
}

    
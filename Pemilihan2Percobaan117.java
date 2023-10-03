import java.util.Scanner;

public class Pemilihan2Percobaan117 {
    public static void main(String[] args){
    Scanner input17 = new Scanner (System.in);

    System.out.print("masukkan tahun: ");
    int tahun = input17.nextInt();

    if ((tahun % 4) == 0) {
        if ((tahun % 100) != 0)
            System.out.println("tahun kabisat");
        else 
        System.out.println("bukan tahun kabisat");
        
        }
     }
}
   
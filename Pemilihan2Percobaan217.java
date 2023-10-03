import java.util.Scanner;

public class Pemilihan2Percobaan217 {
public static void main(String[] args){
Scanner input17 = new Scanner (System.in);


int totalSudut;
System.out.print("masukkan sudut 1: ");
int sudut1 = input17.nextInt();
System.out.print("masukkan sudut 2: ");
int sudut2 = input17.nextInt();
System.out.print("masukkan sudut 3: ");
int sudut3 = input17.nextInt();

totalSudut = sudut1 + sudut2 + sudut3;

if (totalSudut == 180) {
    if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)){
        System.out.println("segitiga tersebut adalah segitiga siku-siku");
    } else 
        System.out.println("segitiga tersebut adalah bukan segitiga siku-siku");
} else 
    System.out.println("bukan segitiga");

    }
}
    
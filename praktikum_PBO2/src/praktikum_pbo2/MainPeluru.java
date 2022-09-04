package praktikum_pbo2;
import java.util.Scanner;
public class MainPeluru {
    public static void main(String[] args) {
        Peluru peluru1 = new Peluru();
        Peluru peluru2 = new Peluru();
        Peluru peluru3 = new Peluru();
        inputData(peluru1,peluru2,peluru3);
    }
    static void inputData(Peluru peluru1,Peluru peluru2,Peluru peluru3){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kecepatan I : ");
        peluru1.vo = input.nextInt();
        System.out.print("Masukkan kecepatan II : ");
        peluru2.vo = input.nextInt();
        System.out.print("Masukkan kecepatan III : ");
        peluru3.vo = input.nextInt();
        System.out.println();
        System.out.println("Peluru I");
        System.out.println();
        peluru1.tampil();
        System.out.println();
        System.out.println("Peluru II");
        System.out.println();
        peluru2.tampil();
        System.out.println();
        System.out.println("Peluru III");
        System.out.println();
        peluru3.tampil();
    }
    
}

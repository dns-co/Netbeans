package praktikum_pbo2;
import java.util.Scanner;
public class Pegawai {
    Scanner input = new Scanner(System.in);
    public String nama,alamat,namajabatan;
    double bonus;
    public int gaji,gajiBonus,total,noPokok,jabatan;
    
    public void Jabatan(){
        System.out.println("JABATAN");
        System.out.println("1. Manager");
        System.out.println("2. Pegawai");
        System.out.println("3. CS");
        System.out.println("4. HRD");
        System.out.println("Masukkan nama jabatan : ");
        jabatan = input.nextInt();
        switch (jabatan){
            case 1:
                namajabatan = "Manager";
                bonus = 0.5;
                break;
            case 2:
                namajabatan = "Pegawai";
                bonus = 0.1;
                break;
            case 3:
                namajabatan = "CS";
                bonus = 0.2;
                break;
            case 4:
                namajabatan = "HRD";
                bonus = 0.4;
                break;
        }
    }
    public double bonusGaji(){
        gajiBonus = (int) (gaji*bonus);
        return gajiBonus;
    }
    public double totalGaji(){
        total = gajiBonus+gaji;
        return total;
    }
    public void tabel(){
        System.out.println(noPokok+"\t"+nama+"\t"+alamat+"\t"+namajabatan+"\t"+gaji+"\t"+bonus+"\t"
        +bonusGaji());
    }
}

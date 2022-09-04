package praktikum_pbo2;
import java.util.Scanner;
public class PrismaSegitigaMain {
    public static void main(String[] args) {
        PrismaSegitiga prismaSegitiga = new PrismaSegitiga();
        Scanner input = new Scanner(System.in);
        
        System.out.print("absis titik A (x1) : ");
        prismaSegitiga.x1 = input.nextDouble();
        System.out.print("ordinat titik A (y1) : ");
        prismaSegitiga.y1 = input.nextDouble();
        System.out.print("absis titik B (x2) : ");
        prismaSegitiga.x2 = input.nextDouble();
        System.out.print("ordinat titik B (y2) : ");
        prismaSegitiga.y2 = input.nextDouble();
        System.out.print("absis titik C (x3) : ");
        prismaSegitiga.x3 = input.nextDouble();
        System.out.print("ordinat titik C (y3) : ");
        prismaSegitiga.y3 = input.nextDouble();
        System.out.print("Masukkan tinggi : ");
        prismaSegitiga.t = input.nextDouble();
        System.out.println("Luas permukaan Prisma Segitiga : "+prismaSegitiga.luasPermukaan());
    }
    
}

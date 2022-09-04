package praktikum_pbo3;
import java.util.Scanner;
public class SegitigaMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("absis titik A (x1) : ");
        double x1 = input.nextDouble();
        System.out.print("ordinat titik A (y1) : ");
        double y1 = input.nextDouble();
        System.out.print("absis titik B (x2) : ");
        double x2 = input.nextDouble();
        System.out.print("ordinat titik B (y2) : ");
        double y2 = input.nextDouble();
        System.out.print("ordinat titik C (y3) : ");
        double x3 = input.nextDouble();
        System.out.print("ordinat titik C (y3) : ");
        double y3 = input.nextDouble();
        Titik A = new Titik(x1,y1);
        Titik B = new Titik(x2,y2);
        Titik C = new Titik(x3,y3);
        Segitiga seg1 = new Segitiga(A,B,C);
       
        
        System.out.println("Luas segitiga dengan titik adalah :"+ seg1.hitungLuas());
        System.out.println("Keliling segitiga dengan titik adalah :"+ seg1.hitungKeliling());
     }
} 

        
    

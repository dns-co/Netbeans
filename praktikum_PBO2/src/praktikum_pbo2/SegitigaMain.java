package praktikum_pbo2;
public class SegitigaMain {
        public static void main(String[] args) {
        Segitiga seg1=new Segitiga(); // membentuk obyek seg1 dari class Segitiga
        seg1.x1=1; seg1.y1=2;	// isi data titik pertama (1,2) ke obyek seg1
        seg1.x2=7; seg1.y2=2;   // isi data titik kedua (7,2) ke obyek seg2
        seg1.x3=7; seg1.y3=9;	// isi data titik ketiga (7,9) ke obyek seg3
        System.out.println("Luas segitiga dengan titik (1,2) (7,2) dan (7,9) adalah : "+seg1.hitungLuas());
        System.out.println("Keliling segitiga dengan titik (1,2)(7,2) (7,9) adalah : "+seg1.hitungKeliling());
        System.out.println("\n");
        
        Segitiga seg2=new Segitiga(); // membentuk obyek seg2 dari class Segitiga
        seg2.x1=0; seg2.y1=0;	// pengisian data 3 titik segitiga
        seg2.x2=5; seg2.y2=4;
        seg2.x3=8; seg2.y3=2;
        System.out.println("Luas segitiga dengan titik (0,0) (5,4) dan (8,2) adalah : "+seg2.hitungLuas());
        System.out.println("Keliling segitiga dengan titik (0,0) (5,4) dan (8,2) adalah : "+seg2.hitungKeliling());
        System.out.println("\n");
        
        Segitiga seg3=new Segitiga(); // membentuk obyek seg2 dari class Segitiga
        seg2.x1=0; seg2.y1=0;	// pengisian data 3 titik segitiga
        seg2.x2=0; seg2.y2=4;
        seg2.x3=3; seg2.y3=0;
        System.out.println("Luas segitiga dengan titik (0,0) (0,4) dan (3,0) adalah : "+seg3.hitungLuas());
        System.out.println("Keliling segitiga dengan titik (0,0) (0,4) dan (3,0) adalah : "+seg3.hitungKeliling());
        System.out.println("\n");
        
        
     }
}



package praktikum_pbo2;
import java.util.Scanner;
public class Kuadrat {
    Scanner input = new Scanner(System.in);
    public double a,b,c,x1,x2,y;
    
    public void inputData(int i){
        do{
        System.out.print("Masukkan nilai a : ");
        a = input.nextDouble();
        if (a!=0){
            break;
        }
        System.out.println("Nilai a tidak boleh sama dengan nol");
        }while(a==0);
        System.out.print("Masukkan nilai b : ");
        b = input.nextDouble();
        System.out.print("Masukkan nilai c : ");
        c = input.nextDouble();
        
        System.out.println("a. Bentuk persamaan kuadrat : "+kategoriDeterminan());
        System.out.println("b. Titik potong dengan sumbu X : ");
        System.out.println("X1 : "+titikPotongX1());
        System.out.println("X2 : "+titikPotongX2());
        System.out.println("c. Titik potong dengan sumbu Y : "+titikPotongY());
        System.out.println("d. Titik koordinat puncak parabola : "+titikX()+","+titikY()+"\n");
        
    }
    public double determinan(){
        return Math.pow(b,2)-(4*a*c);    
    }
    public String kategoriDeterminan(){
        if (determinan()==0){
            return "Akar real kembar";
        }else if (determinan()<0){
            return "Tidak ada akar real";
        }else{
            return "Akar real berbeda";
        }
    }
    public double titikX(){
        double titikX = -b/2*a;
        return titikX;
    }
    public double titikY(){
        double titikY = a*Math.pow(titikX(),2) + b*titikX()+c;
        return titikY;
    }
    public double simetri(){
        System.out.print("Masukkan nilai X : ");
        double x = input.nextDouble();
        return y = a*Math.pow(x,2)+(b*x)+c;
    }
    public double titikPotongX1(){
        return -b+Math.sqrt (determinan())/2*a;
    }
    public double titikPotongX2(){
        return -b+Math.sqrt (determinan())/2*a;
    }
    public double titikPotongY(){
        return c;
}
}

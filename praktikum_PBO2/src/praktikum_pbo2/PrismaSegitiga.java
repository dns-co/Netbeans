package praktikum_pbo2;
public class PrismaSegitiga {
    public double x1,y1,x2,y2,x3,y3,t;
    
    public double hitungSisi(double xa, double ya, double xb, double yb){
        return Math.sqrt( Math.pow(xa-xb, 2) + Math.pow(ya-yb,2));
    }
    
    public double hitungKeliling(){
        return hitungSisi(x1,y1,x2,y2)+
        hitungSisi(x2,y2,x3,y3)+hitungSisi(x3,y3,x1,y1);
    }
    public double hitungLuas(){
        double s = hitungKeliling()/2;
         
        return Math.sqrt(s * (s-hitungSisi(x1,y1,x2,y2)) * (s-hitungSisi(x2,y2,x3,y3)) * (s-hitungSisi(x3,y3,x1,y1)));
    }
    public double hitungPermukaan(){
        return hitungSisi(x1,y1,x2,y2)+
        hitungSisi(x2,y2,x3,y3)+hitungSisi(x3,y3,x1,y1);
    }
    public double luasPermukaan(){
        return hitungPermukaan() + hitungLuas()*2;
}
}

package praktikum_pbo2;
public class Peluru {
    public double  vo,i,g=10;
    public double hitungRadian(double i){
        double radian = (i*3.14)/180;
        return radian;
    }
    public double TitikTertinggi(double vo){
        double titik = ((vo * Math.sin(hitungRadian(i)))*(vo*Math.sin(hitungRadian(i))))/(2*vo);
        return titik;
    }
    public double waktuTotal(double vo){
        double waktu = ((2*vo)*Math.sin(hitungRadian(i)))/g;
        return waktu;
    }
    public double jarakTerjauh(double vo){
        double jarak = ((vo*vo)*Math.sin(hitungRadian(i)*2))/g;
        return jarak;
    }
    public void tampil(){
        System.out.println("Lintasan bola untuk berbagai sudut lingkaran");
        System.out.println("Sudut\tkec.awalwaktu tempuh\t\ttitik tertinggi\t\tjarak terjauh");
        System.out.println("===========================================================================");
        
        for (i=5;i<=90;i+=5){
        System.out.print(i);
        hitungRadian(i);
        System.out.print("\t"+vo+"\t"+waktuTotal(vo)+"\t"+TitikTertinggi(vo)
        +"\t"+jarakTerjauh(vo)+"\n");
        }
    }
}

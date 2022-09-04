package praktikum_pbo3;
public class Mahasiswa {
    private String nim, nama, alamat;
    private Dosen dpa;
    
    public Mahasiswa (String nim, String nama, String alamat, Dosen dosen){
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.dpa = dosen;
    }    
    public void setNim(String nim){
        this.nim = nim;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;    
    } 
    public void setDpa(Dosen dpa){
        this.dpa = dpa;
    }
    public String getNim(){
        return nim;
    }
    public String getNama(){
        return nama;
    }
    public String getAlamat(){
        return alamat;
    }
    public Dosen getDosen(){
        return dpa;
    }
}

    


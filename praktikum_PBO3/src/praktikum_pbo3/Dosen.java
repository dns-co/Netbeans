package praktikum_pbo3;
public class Dosen {
    private String nip;
    private String nama;
    private String email;
    
    public Dosen(String npp, String nama, String alamat, String email){
        this.nip = nip;
        this.nama = nama;
        this.email = email;
    }
    public void setNip(String npp){
        this.nip = nip;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getNip(){
        return nip;
    }
    public String getNama(){
        return nama;
    }
    public String getemail(){
        return nip;
    }
}

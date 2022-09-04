package praktikum_pbo3;
public class MahasiswaMain {
    public static void main(String[] args) {
        Dosen in = new Dosen("123","Pak Adi","solo","adi98@gmail.com");
        Mahasiswa mhs1 = new Mahasiswa("111","Denis","Jl.Kaliurang",in);
        Mahasiswa mhs2 = new Mahasiswa("112","Kento","Jl.Malioboro",in);
        Mahasiswa mhs3 = new Mahasiswa("113","Rich","Jl.Godean",in);
        Mahasiswa mhs4 = new Mahasiswa("114","Louis","Jl.Paingan",in);
        Mahasiswa mhs5 = new Mahasiswa("115","Martha","Jl.Seturan",in);
        
        System.out.println("NIM : "+mhs1.getNim()+"\nNama Mahasiswa : "+mhs1.getNama()+
               "\nAlamat : "+mhs1.getAlamat()+"\nDosen : "+mhs1.getDosen().getNama());
        System.out.println("NIM : "+mhs2.getNim()+"\nNama Mahasiswa : "+mhs2.getNama()+
                "\nAlamat : "+mhs2.getAlamat()+"\nDosen : "+mhs2.getDosen().getNama());
        System.out.println("NIM : "+mhs3.getNim()+"\nNama Mahasiswa : "+mhs3.getNama()+
                "\nAlamat : "+mhs3.getAlamat()+"\nDosen : "+mhs3.getDosen().getNama());
        System.out.println("NIM : "+mhs4.getNim()+"\nNama Mahasiswa : "+mhs4.getNama()+
                "\nAlamat : "+mhs4.getAlamat()+"\nDosen : "+mhs4.getDosen().getNama());
        System.out.println("NIM : "+mhs5.getNim()+"\nNama Mahasiswa : "+mhs5.getNama()+
                "\nAlamat : "+mhs5.getAlamat()+"\nDosen : "+mhs5.getDosen().getNama());
    }
    
}

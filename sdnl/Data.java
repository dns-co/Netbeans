package projek.sdnl;

public class Data { // merupakan class data 
    private String nama,alamat, pekerjaan; // deklarasi atribut nama, alamat, pekerjaan dengan tipe data String dan bersifat private
    private int no, jam; // deklarasi atribut no, malam dengan tipe data integer dan bersifat private 
    
    /*
    merupakan consttuctor dari kelas data dengan parameter no dan malam yang bertipe int dan
    nama, alamat dan pekerjaan yang bertipe String.
    
    costructor ini berfungsi untuk menginisialisasi atribut no dengan parameter no, nama dengan parameter nama,
    alamat dengan parameter alamat, pekerjaan dengan parameter pekerjaan dan malam dengan parameter malam
    */
    public Data(int no, String nama, String alamat, String pekerjaan, int jam){
        this.no = no;
        this.nama = nama;
        this.alamat = alamat;
        this.pekerjaan = pekerjaan;
        this.jam = jam;
    }
    public Data (){ // constructor 
    }

    /*
    merupakan method getNama yang bertipe String 
    method ini berfungsi untuk mengembalikan nilai dari atribut nama
    */
    public String getNama() {
        return nama;
    }

     /*
    merupakan method setNama yang bertipe void
    method ini berfungsi untuk menginisialisasi atribut nama dengan parameter nama
    */
    public void setNama(String nama) {
        this.nama = nama;
    }

     /*
    merupakan method getAlamat yang bertipe String 
    method ini berfungsi untuk mengembalikan nilai dari atribut alamat
    */
    public String getAlamat() {
        return alamat;
    }

     /*
    merupakan method setAlamat yang bertipe void 
    method ini berfungsi untuk menginisialisasi atribut alamat dengan parameter alamat 
    */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

     /*
    merupakan method getPekerjaan yang bertipe String 
    method ini berfungsi untuk mengembalikan nilai dari atribut pekerjaan
    */
    public String getPekerjaan() {
        return pekerjaan;
    }

     /*
    merupakan method setPekerjaan yang bertipe String 
    method ini berfungsi untuk menginisialisasi atribut pekerjaan dengan parameter pekerjaan
    */
    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

     /*
    merupakan method getNo yang bertipe integer 
    method ini berfungsi untuk mengembalikan nilai dari atribut no
    */
    public int getNo() {
        return no;
    }

      /*
    merupakan method setNo yang bertipe integer 
    method ini berfungsi untuk menginisialisasi atribut no dengan parameter no
    */
    public void setNo(int no) {
        this.no = no;
    }

    /*
    merupakan method getMalam yang bertipe integer 
    method ini berfungsi untuk mengembalikan nilai dari atribut malam
    */
    public int getJam() {
        return jam;
    }

      /*
    merupakan method setMalam yang bertipe integer 
    method ini berfungsi untuk menginisialisasi atribut malam dengan parameter malam
    */
    public void setJam(int jam) {
        this.jam = jam;
    }
    
}

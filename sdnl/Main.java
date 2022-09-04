package projek.sdnl;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();
        Data kerja = new Data();
        TreeNode ubah = new TreeNode(kerja);
        Scanner in = new Scanner(System.in);

        boolean ulang;
        int aksi;

        Data user = new Data(1, "Mbappe", "Jl.Hayam Wuruk", "Mahasiswa", 3);
        tree.insertNode(user);

        Data user1 = new Data(2, "Griezman", "Jl.CondongCatur", "Honorer", 2);
        tree.insertNode(user1);

        Data user2 = new Data(3, "Karim", "Jl.Paingan", "PNS", 3);
        tree.insertNode(user2);

        System.out.println("\nProgram Booking Lapangan Futsal Jogokaryan \n===========================");
        awal:
        while (ulang = true) {
            System.out.println("\nPilih Opsi : ");
            System.out.println("1. Mencari Lapangan");
            System.out.println("2. Menambahkan Data Lapangan");
            System.out.println("3. Menampilkan Semua Data Pemesanan Lapangan");
            System.out.println("4. Mengubah Data User Lapangan");
            System.out.println("5. Menghapus Data Lapangan");
            System.out.println("6. Exit");
            System.out.print("Aksi : ");
            aksi = in.nextInt();

            switch (aksi) {
                case 1:
                    if (tree != null) {
                        System.out.println("");
                        System.out.println("==================================");
                        System.out.print("Nomor Lapangan Yang Ingin Dicari\t: ");
                        kerja.setNo(in.nextInt());
                        if (tree.search(kerja) != null) {
                            int aksi2;
                            System.out.println("Lapangan Sudah Dibooking User Lain");
                            System.out.println("");
                            System.out.println("1. Lihat Data Pemesanan Lapangan");
                            System.out.println("2. Keluar");
                            System.out.print("Aksi: ");
                            aksi = in.nextInt();

                            switch (aksi) {
                                case 1:
                                    System.out.println("\nData Dari User"
                                            + "\nNomor Lapangan    :" + tree.search(kerja).getData().getNo() + ""
                                            + "\nNama Pemesanan :" + tree.search(kerja).getData().getNama() + ""
                                            + "\nAlamat         :" + tree.search(kerja).getData().getAlamat() + ""
                                            + "\nPekerjaan      :" + tree.search(kerja).getData().getPekerjaan()
                                            + "\nLama Waktu Penyewaan  :" + tree.search(kerja).getData().getJam());
                                    System.out.println("=========================================================");
                                    continue awal;

                                case 2:
                                    System.out.println("=========================================================");
                                    continue awal;

                            }

                        }else{
                            System.out.println("Lapangan Masih Kosong");
                            System.out.println("==========================================================");
                        }
                    }
                    break;
                case 2:
                    int nomor;
                    String lama;
                    String alamat;
                    int lama2;
                    Data kerja1 = new Data();
                    while(ulang = true){
                        System.out.println("");
                        System.out.println("====================================================");
                        System.out.print("Masukan Nomor Lapangan\t: ");
                        nomor = in.nextInt();
                        kerja1.setNo(nomor);
                        
                        if (tree.search(kerja) == null) {
                            
                            System.out.print("Masukan Nama Pemesanan  : ");
                            in.nextLine();
                            kerja1.setNama(in.nextLine());
                            
                            System.out.print("Masukan Alamat User\t: ");
                            alamat = in.nextLine();
                            kerja1.setAlamat(alamat);
                            
                            System.out.print("Lama Waktu Penyewaan\t\t: ");
                            lama =in.next();
                            lama2 = Integer.parseInt(lama);
                            kerja1.setJam(lama2);
                            
                            System.out.print("Masukan Pekerjaan User  : ");
                            in.nextLine();
                            kerja1.setPekerjaan(in.nextLine());
                            
                            tree.insertNode(kerja1);
                            System.out.println("");
                            System.out.println("Lapangan Berhasil Dibooking");
                            System.out.println("================================");
                            ulang=false;
                            continue awal;
                        }else{
                            System.out.println("Lapangan Sudah Dibooking User Lain!");
                            System.out.println("===============================");
                            ulang=true;
                           
                        }
                    }
                    System.out.println("================================================");
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("======================================="
                            + "================================================");
                    System.out.printf("%-16s", "No.Lapangan");
                    System.out.printf("%-17s", "Nama Pemesan");
                    System.out.printf("%-20s", "Alamat");
                    System.out.printf("%-15s", "Pekerjaan");
                    System.out.printf("%-20s", "Lama Waktu Penyewaan");
                    System.out.println();
                    tree.inorderTraversal();
                    System.out.println("=======================================" 
                            + "================================================");
                    continue awal;
                    
                case 4:
                    int pilih;
                    do{
                        System.out.println("");
                        System.out.println("===========================================");
                        int no2;
                        System.out.print("Masukan Nomor Lapangan Yang Akan diubah \t : ");
                        no2 = in.nextInt();
                        kerja.setNo(no2);
                        ubah = tree.search(kerja);
                    }while (ubah == null);
                    boolean a = true;
                    while(a){
                        if (ubah.getData() != null) {
                            System.out.println("1. No Lapangan\t\t: " + ubah.getData().getNo());
                            System.out.println("2. Nama\t\t\t: " + ubah.getData().getNama());
                            System.out.println("3. Alamat\t\t: " + ubah.getData().getAlamat());
                            System.out.println("4. Pekerjaan\t\t: " + ubah.getData().getPekerjaan());
                            System.out.println("5. Lama Menyewa Lapangan\t: " + ubah.getData().getJam());
                            System.out.println("6. Keluar");
                            
                            do{
                                System.out.println("");
                                System.out.println("===========================================");
                                System.out.print("Masukan Data Yang Akan Diubah \t : ");
                                pilih = in.nextInt();
                                System.out.println("===========================================");
                                System.out.println("");
                            }while(pilih < 1 || pilih > 6);
                            switch(pilih){
                                case 1:
                                    System.out.println("Nomor Lapangan\t\t: ");
                                    ubah.getData().setNo(in.nextInt());
                                    System.out.println("");
                                    break;
                                    
                                case 2:
                                    System.out.println("Nama\t\t\t: ");
                                    in.nextLine();
                                    ubah.getData().setNama(in.nextLine());
                                    System.out.println("");
                                    break;
                                    
                                case 3:
                                    System.out.println("Alamat\t\t\t: ");
                                    in.nextLine();
                                    ubah.getData().setAlamat(in.nextLine());
                                    System.out.println("");
                                    break;
                                    
                                case 4:
                                    System.out.println("Pekerjaan\t\t: ");
                                    in.nextLine();
                                    ubah.getData().setPekerjaan(in.nextLine());
                                    System.out.println("");
                                    break;
                                    
                                case 5:
                                    System.out.println("Lama Waktu Penyewaan\t\t: ");
                                    ubah.getData().setJam(in.nextInt());
                                    System.out.println("");
                                    break;
                                    
                                case 6:
                                    System.out.println("===============================");
                                    continue awal;
                                default:
                                    break;
                                    
                            }
                            
                        }
                    }
                case 5:
                    if (tree != null) {
                        int no1;
                        System.out.print("Masukan Nomor Lapangan Yang  Ingin Dihapus\t : ");
                        no1 = in.nextInt();
                        if (tree.search(kerja) !=null) {
                            tree.delete(kerja);
                            System.out.println("Data Dari Lapangan " + kerja.getNo() + "Berhasil Dihapus");
                        }else{
                            System.out.println("Data tidak ditemukan!!!");
                            
                        } 
                    }
                    break;
                case 6:
                    System.out.println("Terima Kasih, Salam Olahraga!");
                    System.exit(0);
                    ulang=false;
                default:
                    break;
                
        }
    }
}
}       
                        
                        
                        
                        
                        
           
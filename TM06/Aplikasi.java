import java.util.*;
import util.*;
import entity.*;

public class Aplikasi {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Aplikasi app = new Aplikasi();
        for(;;) {
            app.printMenu();
            int answer = sc.nextInt();
            switch(answer) {
                case 1:
                    System.out.println("Tambah data");
                    app.addData();
                    break;
                case 2:
                    System.out.println("Ubah data");
                    app.ubahData();
                    break;
                case 3:
                    System.out.println("Hapus data");
                    app.hapusData();
                    break;
                case 4:
                    System.out.println("Lihat data");
                    app.listData();
                    break;
                case 5:
                    return;
            }
        }
    }


    public void hapusData() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("--------------------");
        System.out.println("Hapus data ke: "); int idx = Integer.parseInt(sc.nextLine());
        Operasi.removeData(idx-1);
        System.out.println("Data telah terhapus");
    }

    public void ubahData() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("--------------------");
        System.out.println("Ubah data ke: "); int idx = Integer.parseInt(sc.nextLine());
        System.out.println("No Surat: "); String noSurat = sc.nextLine();
        System.out.println("Tanggal: "); String tglSurat = sc.nextLine();
        System.out.println("Perihal: "); String perihal = sc.nextLine();
        System.out.println("Tujuan: "); String tujuan = sc.nextLine();
        Operasi.editData(new Data(noSurat, tglSurat, perihal, tujuan), idx-1);
        System.out.println("Data telah diubah");
    }

    public void listData() {
          List<Data> data = Operasi.getListData();
          for(int i=0; i<data.size(); i++) {
            System.out.println();
            System.out.println("Data ke-"+ (i+1));
            System.out.println("No Surat: "+data.get(i).getNoSurat());
            System.out.println("Tanggal: "+data.get(i).getTanggalSurat());
            System.out.println("Perihal: "+data.get(i).getPerihal());
            System.out.println("Tujuan: "+data.get(i).getTujuan());
          }
    } 

    public void addData() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("--------------------");
        System.out.println("No Surat: "); String noSurat = sc.nextLine();
        System.out.println("Tanggal Surat: "); String tglSurat = sc.nextLine();
        System.out.println("Perihal: "); String perihal = sc.nextLine();
        System.out.println("Tujuan: "); String tujuan = sc.nextLine();
        Operasi.addData(new Data(noSurat, tglSurat, perihal, tujuan));
        System.out.println("Data telah tersimpan");
    }

    public void printMenu() {
        System.out.println();
        System.out.println("--------------------");
        System.out.println("Aplikasi Data Surat Keluar");
        System.out.println("1. Tambah Data");
        System.out.println("2. Ubah Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Lihat Data");
        System.out.println("5. Keluar");
        System.out.println("Pilihan: ");
    }


}
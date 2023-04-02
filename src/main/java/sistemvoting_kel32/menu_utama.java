package sistemvoting_kel32;

import java.util.Scanner;

public class menu_utama {
    public static String[] Design = {
            "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~",
            "*************************************************************************",
            "-------------------------------------------------------------------------"};
       public static void mainadmin() {
        String keyusername = "admin";
        int keyPIN = 123;
        String username = "";
        int PIN = 0;
        int pilihan;
        int pilihan2 = 1;
        boolean ceklogin = login(PIN, keyPIN, username, keyusername);

        while (true) {
            if (ceklogin && pilihan2 == 1) {
                System.out.println(Design[2] + "\nApa yang akan Anda lakukan");
                System.out.println("1. Ubah username");
                System.out.println("2. Ubah PIN");
                public static void mainadmin() {
                        Scanner newusrnm = new Scanner(System.in);
                        keyusername = newusrnm.nextLine();
                        System.out.println("Username diubah menjadi " + keyusername);
                        pilihan2 = pilakhir();
                        break;
                    case 2:
                        keyPIN = newpin();
                        System.out.println("PIN diubah menjadi " + keyPIN);
                        pilihan2 = pilakhir();
                        break;
                    case 3:
                        cekhasil();
                        pilihan2 = pilakhir();
                        break;
                    case 4:
                        System.out.println(Design[2] + "\nAnda akan dialihkan ke menu utama\n" + Design[2]);
                    public static void mainadmin() {
                        System.out.println("Pilihan Anda tidak valid, coba lagi");
                        break;
                }
            } else if (pilihan2 == 2) {
                System.exit(0);
            } else {
                System.out.println("Input yang anda masukkan salah, coba lagi");
                pilihan2 = pilakhir();
            }
        }
    }

    static int pilakhir() {
        int akhir;
        System.out.println(Design[2] + "\nApakah Anda Ingin Melanjutkan Aktivitas Sebagai Admin");
        System.out.println("1. Ya");
        System.out.println("2. Tidak (Keluar Program)");
        System.out.print("Input: ");
        Scanner pilakhir = new Scanner(System.in);
        while (!pilakhir.hasNextInt()) {
            System.out.println(Design[2] + "\nInput yang anda masukkan tidak valid, coba lagi");
            System.out.println(Design[2] + "\nApakah Anda Ingin Melanjutkan Aktivitas Sebagai Admin");
            System.out.println("1. Ya");
            System.out.println("2. Tidak (Keluar dari Program)");
            System.out.print("Input: ");
            pilakhir.next();
        }
        akhir = pilakhir.nextInt();
        return akhir;
    }
    static int[] count = new int[6];
    static int[] vote = new int[3];
    static String[] jabatan = {"Ketua", "Wakil Ketua"};
    static String[] posisi = new String[3];
    static String[][] kandidat = {
            {"Joe","John"},
            {"Mary","Jane"}};

    public static void Pemilihan(){
        System.out.print("\nKetik nomor calon pilihan anda\n");
        pilketua();
        pilwaket();
        System.out.print(Design[2]+"\nAnda berhasil memilih\n"+Design[2]+"\n");
    }

    public static void pilketua(){
        do{
            System.out.printf( Design[1] + "\n\t\tKandidat untuk %s\n1.%s\n2.%s\nNomor yang anda pilih ",jabatan[0], kandidat[0][0],kandidat[0][1]);
            Scanner pilih = new Scanner(System.in);
            vote[0] = pilih.nextInt();;
            switch(vote[0]){
                case 1: posisi[0] = kandidat[0][0];
                    count[0]++;
                    break;
                case 2: posisi[0] =   kandidat[0][1]  ;
                    count[1]++;
                    break;
                default: posisi[0]= "Nomor Tidak Valid";
                    System.out.println("Nomor Tidak Valid, Coba Lagi");
                    break;
            }
        } while(posisi[0].equals("Nomor Tidak Valid"));
        System.out.printf("Anda memilih %s untuk jabatan sebagai %s\n",posisi[0],jabatan[0]);
    }

    public static void pilwaket(){
        do{
            System.out.printf(Design[1] + "\n\t\tKandidat untuk %s\n1.%s\n2.%s\nNomor yang anda pilih ", jabatan[1],kandidat[1][0],kandidat[1][1]);
            Scanner pilih = new Scanner(System.in);
            vote[1] = pilih.nextInt();
            switch(vote[1]){
                case 1: posisi[1] = kandidat[1][0];
                    count[2]++;
                    break;
                case 2: posisi[1] = kandidat[1][1] ;
                    count[3]++;
                    break;
                default: posisi[1]= "Nomor Tidak Valid";
                    System.out.println("Nomor Tidak Valid, Coba Lagi");
                    break;
            }
        } while(posisi[1].equals("Nomor Tidak Valid"));
        System.out.printf("Anda memilih %s untuk jabatan sebagai %s\n",posisi[1],jabatan[1]);
    }

    public static int menu(){
        int pilihan;
        System.out.println(Design[1] + "\n\t\tSelamat Datang di Pemilihan Pengurus\n" + Design[1]);
        System.out.println("Silahkan pilih peran Anda");
        System.out.println("1. Pemilih");
        System.out.println("2. Admin");
        System.out.print("Pilihan menu: ");
        Scanner scan = new Scanner(System.in);
        pilihan = scan.nextInt();
        return pilihan;
    }

    public static void main(String[] args) {
        while (true) {
            int pilihan = menu();
            if (pilihan == 1) {
                System.out.printf(Design[0] + "\nSelamat Datang Pemilih\n" + Design[0]);
                Pemilihan();
            } else if (pilihan == 2) {
                admin utama = new admin();
                utama.mainadmin();
            } else {
                System.out.println(Design[0] + "\n\tInput yang anda masukkan salah\n" + Design[0]);
            }
        }
    }

    public static void hasil(){
        System.out.printf(Design[2]+"\nHasil Voting untuk %s \n%s = " + count[0] +"\n%s = "
                + count[1] + "\n"+Design[2] ,jabatan[0],kandidat[0][0],kandidat[0][1]);
        if(count[0] > count[1]) {
            System.out.printf("\n%s memenangkan hasil pemilihan dengan jabatan sebagai %s\n", kandidat[0][0], jabatan[0]);
        } else {
            System.out.printf("\n%s memenangkan hasil pemilihan dengan jabatan sebagai %s\n", kandidat[0][1], jabatan[0]);
        }

        System.out.printf(Design[2]+"\nHasil Voting untuk %s\n%s = " + count[2] +"\n%s = "
                + count[3] + "\n"+Design[2],jabatan[1],kandidat[1][0],kandidat[1][1]);
        if(count[2] > count[3]) {
            System.out.printf("\n%s memenangkan hasil pemilihan dengan jabatan sebagai %s\n", kandidat[1][0], jabatan[1]);
        } else {
            System.out.printf("\n%s memenangkan hasil pemilihan dengan jabatan sebagai %s\n", kandidat[1][1], jabatan[1]);
        }
    }
}

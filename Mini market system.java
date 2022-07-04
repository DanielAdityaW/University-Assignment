import java.util.Scanner;

/*ditambahkan 
kasir
*/

public class TBTokoSwalayan {
    //NPM : 4519210002
    //Nama : Daniel Aditya Warih
    //Program : Tugas Besar UTS - Toko Swalayan
    //Update : 12 April 2021

    //Input method menu_berulang
    static Scanner sc11 = new Scanner(System.in);
    //Deklarasi Variable
    public static int[] totalharga = new int[50];

    private static int pilian_menu = 3;
    private static int pilihan1 = 0;
    private static char pilihan11 = 'k';

    //Deklarasi variabel untuk Object
    private String nama;
    private String ID;

    private String namasaya;
    private String Npm;
    private String program;
    private String Update;

    //Deklarasi variabel bertipe static
    static int[] hargabaranelek = new int[5];
    static int[] hargasayur = new int[5];  

    //Method menu_berulang
    public static void menu_berulang(){
        while(pilihan11 != 'Y' || pilihan11 != 'N'){
            System.out.println("Apakah anda ingin melanjutkan? Y atau N");
            pilihan11 = sc11.next().charAt(0);
            if (pilihan11 == 'Y' || pilihan11 == 'y'){
                menuutama();
            } else if (pilihan11 == 'N' || pilihan11 == 'n'){
                System.out.println("Apakah Anda Yakin ? ");
                pilihan11 = sc11.next().charAt(0);
                if (pilihan11 == 'Y' || pilihan11 == 'y'){
                    System.exit(0);
                } else if (pilihan11 == 'N' || pilihan11 == 'n'){
                    menuutama();
                } else {
                    System.out.println("Pilihan yang anda masukkan salah");
                }
            } else {
                System.out.println("Pilihan yang anda masukkan salah");
            }
        }
    }

    //method menu_barang
    static void menu_barang(){
        System.out.println("Pilih Kategori Barang : ");
        System.out.println("1. Alat Elektroktik");
        System.out.println("2. Sayur, Buah, Beras");
        System.out.println("3. Kembali");
    }

    //method inisialisasi nilai harga
    public static void inisialisasi(){
        hargabaranelek[0] = 2000000;
        hargabaranelek[1] = 8000000;
        hargabaranelek[2] = 3000000;
        hargabaranelek[3] = 2000000;
        hargabaranelek[4] = 4000000;
        hargasayur[0] = 2000;
        hargasayur[1] = 1000;
        hargasayur[2] = 20000;
        hargasayur[3] = 10000;
        hargasayur[4] = 8000;
    }

    //method pilih_barang
    public void pilih_barang(int pilihan1){
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int jumlahbeli, uang, kembalian;
        inisialisasi();
        menu_barang();
        do{   
            System.out.print("Masukkan pilihan anda  : ");
            pilian_menu = sc.nextInt();
            switch (pilian_menu) {
                case 1 :
                    System.out.println("Pilih Alat Elektronik : ");
                    System.out.println("1. Komputer");
                    System.out.println("2. Smartphone ");
                    System.out.println("3. lemari pendingin");
                    System.out.println("4. AC");
                    System.out.println("5. Televisi");
                    System.out.println("6. Kembali");
                    System.out.print("Masukkan pilihan anda  : ");
                    pilihan1 = sc1.nextInt();
                        if(pilihan1 == 1){
                            hargabaranelek[0] = hargabaranelek[0];
                            System.out.println("Anda Membeli Komputer seharga : Rp." + hargabaranelek[0]);
                            System.out.println("Silakan Bayar Dikasir");
                            System.out.println("=============================KASIR==============================");
                            System.out.print("Masukkan Nominal Uang Anda : Rp."); 
                            uang = sc.nextInt();
                            if (uang == hargabaranelek[0]){
                                System.out.println("Uang Anda Pas");
                            } else if (uang < hargabaranelek[0]){
                                System.out.println("Uang Anda Kurang");
                            } else if (uang > hargabaranelek[0]){
                                kembalian = hargabaranelek[0] - uang;
                                System.out.println("Uang Anda Lebih, Kembaliannya adalah : Rp." + Math.abs(kembalian));
                            } 
                            menu_berulang();
                        } else if (pilihan1 == 2){
                            hargabaranelek[1] = hargabaranelek[1];
                            System.out.println("Anda Membeli Smartphone seharga : Rp." + hargabaranelek[1]);
                            System.out.println("Silakan Bayar Dikasir");
                            System.out.println("=============================KASIR==============================");
                            System.out.print("Masukkan Nominal Uang Anda : Rp."); 
                            uang = sc.nextInt();
                            if (uang == hargabaranelek[1]){
                                System.out.println("Uang Anda Pas");
                            } else if (uang < hargabaranelek[1]){
                                System.out.println("Uang Anda Kurang");
                            } else if (uang > hargabaranelek[1]){
                                kembalian = hargabaranelek[1] - uang;
                                System.out.println("Uang Anda Lebih, Kembaliannya adalah : Rp." + Math.abs(kembalian));
                            } 
                            menu_berulang();
                        } else if (pilihan1 == 3){
                            hargabaranelek[2] = hargabaranelek[2];
                            System.out.println("Anda Membeli lemari pendingin seharga : Rp." + hargabaranelek[2]);
                            System.out.println("Silakan Bayar Dikasir");
                            System.out.println("=============================KASIR==============================");
                            System.out.print("Masukkan Nominal Uang Anda : Rp."); 
                            uang = sc.nextInt();
                            if (uang == hargabaranelek[2]){
                                System.out.println("Uang Anda Pas");
                            } else if (uang < hargabaranelek[2]){
                                System.out.println("Uang Anda Kurang");
                            } else if (uang > hargabaranelek[2]){
                                kembalian = hargabaranelek[2] - uang;
                                System.out.println("Uang Anda Lebih, Kembaliannya adalah : Rp." + Math.abs(kembalian));
                            } 
                            menu_berulang();
                        } else if (pilihan1 == 4){
                            hargabaranelek[3] = hargabaranelek[3];
                            System.out.println("Anda Membeli AC seharga : Rp." + hargabaranelek[3]);
                            System.out.println("Silakan Bayar Dikasir");
                            System.out.println("=============================KASIR==============================");
                            System.out.print("Masukkan Nominal Uang Anda : Rp."); 
                            uang = sc.nextInt();
                            if (uang == hargabaranelek[3]){
                                System.out.println("Uang Anda Pas");
                            } else if (uang < hargabaranelek[3]){
                                System.out.println("Uang Anda Kurang");
                            } else if (uang > hargabaranelek[3]){
                                kembalian = hargabaranelek[3] - uang;
                                System.out.println("Uang Anda Lebih, Kembaliannya adalah : Rp." + Math.abs(kembalian));
                            } 
                            menu_berulang();
                        } else if (pilihan1 == 5){
                            hargabaranelek[4] = hargabaranelek[4];
                            System.out.println("Anda Membeli Televisi seharga : Rp." + hargabaranelek[4]);
                            System.out.println("Silakan Bayar Dikasir");
                            System.out.println("=============================KASIR==============================");
                            System.out.print("Masukkan Nominal Uang Anda : Rp."); 
                            uang = sc.nextInt();
                            if (uang == hargabaranelek[4]){
                                System.out.println("Uang Anda Pas");
                            } else if (uang < hargabaranelek[4]){
                                System.out.println("Uang Anda Kurang");
                            } else if (uang > hargabaranelek[4]){
                                kembalian = hargabaranelek[4] - uang;
                                System.out.println("Uang Anda Lebih, Kembaliannya adalah : Rp." + Math.abs(kembalian));
                            } 
                            menu_berulang();
                        } else if (pilihan1 == 6){
                            menu_barang();
                        } else {
                            System.out.println("Pilihan Yang Anda Masukkan Salah.");
                        }
                    break;
                case 2 :
                    System.out.println("Pilih Belanjaan Pokok Anda : ");
                    System.out.println("1. Bayam");
                    System.out.println("2. Wortel ");
                    System.out.println("3. Apel");
                    System.out.println("4. Jeruk");
                    System.out.println("5. Beras");
                    System.out.println("6. Kembali");
                    System.out.print("Masukkan pilihan anda  : ");
                    pilihan1 = sc1.nextInt();
                        if(pilihan1 == 1){
                            hargasayur[0] = hargasayur[0];
                            System.out.println("Anda Membeli bayam seharga : Rp." + hargasayur[0]);
                            System.out.println("Berapa Banyak Anda Ingin Membeli? ");
                            jumlahbeli = sc1.nextInt();
                            totalharga[0] = hargasayur[0] * jumlahbeli;
                            System.out.println("Totalnya adalah : Rp." + totalharga[0]);
                            if(totalharga[0] == 0){
                                System.out.println("Anda tidak membeli");
                                menu_berulang();
                            } else {
                                System.out.println("Silakan Bayar Dikasir");
                                System.out.println("=============================KASIR==============================");
                                System.out.print("Masukkan Nominal Uang Anda : Rp."); 
                                uang = sc.nextInt();
                                if (uang == totalharga[0]){
                                    System.out.println("Uang Anda Pas");
                                } else if (uang < totalharga[0]){
                                    System.out.println("Uang Anda Kurang");
                                } else if (uang > totalharga[0]){
                                    kembalian = totalharga[0] - uang;
                                    System.out.println("Uang Anda Lebih, Kembaliannya adalah : Rp." + Math.abs(kembalian));
                                } 
                            menu_berulang();
                            }
                        } else if (pilihan1 == 2){
                            hargasayur[1] = hargasayur[1];
                            System.out.println("Anda Membeli Wortel seharga : Rp." + hargasayur[1]);
                            System.out.println("Berapa Banyak Anda Ingin Membeli? ");
                            jumlahbeli = sc1.nextInt();
                            totalharga[1] = hargasayur[1] * jumlahbeli;
                            System.out.println("Totalnya adalah : Rp." + totalharga[1]);
                            if(totalharga[1] == 0){
                                System.out.println("Anda tidak membeli");
                                menu_berulang();
                            } else {
                            System.out.println("Silakan Bayar Dikasir");
                                System.out.println("=============================KASIR==============================");
                                System.out.print("Masukkan Nominal Uang Anda : Rp."); 
                                uang = sc.nextInt();
                                if (uang == totalharga[1]){
                                    System.out.println("Uang Anda Pas");
                                } else if (uang < totalharga[1]){
                                    System.out.println("Uang Anda Kurang");
                                } else if (uang > totalharga[1]){
                                    kembalian = totalharga[1] - uang;
                                    System.out.println("Uang Anda Lebih, Kembaliannya adalah : Rp." + Math.abs(kembalian));
                                } 
                            menu_berulang();
                            }
                        } else if (pilihan1 == 3){
                            hargasayur[2] = hargasayur[2];
                            System.out.println("Anda Membeli apel seharga : Rp." + hargasayur[2]);
                            System.out.println("Berapa Banyak Anda Ingin Membeli? ");
                            jumlahbeli = sc1.nextInt();
                            totalharga[2] = hargasayur[2] * jumlahbeli;
                            System.out.println("Totalnya adalah : Rp." + totalharga[2]);
                            if(totalharga[2] == 0){
                                System.out.println("Anda tidak membeli");
                                menu_berulang();
                            } else {
                            System.out.println("Silakan Bayar Dikasir");
                                System.out.println("=============================KASIR==============================");
                                System.out.print("Masukkan Nominal Uang Anda : Rp."); 
                                uang = sc.nextInt();
                                if (uang == totalharga[2]){
                                    System.out.println("Uang Anda Pas");
                                } else if (uang < totalharga[2]){
                                    System.out.println("Uang Anda Kurang");
                                } else if (uang > totalharga[2]){
                                    kembalian = totalharga[2] - uang;
                                    System.out.println("Uang Anda Lebih, Kembaliannya adalah : Rp." + Math.abs(kembalian));
                                } 
                            menu_berulang();
                            }
                        } else if (pilihan1 == 4){
                            hargasayur[3] = hargasayur[3];
                            System.out.println("Anda Membeli jeruk seharga : Rp." + hargasayur[3]);
                            System.out.println("Berapa Banyak Anda Ingin Membeli? ");
                            jumlahbeli = sc1.nextInt();
                            totalharga[3] = hargasayur[3] * jumlahbeli;
                            System.out.println("Totalnya adalah : Rp." + totalharga[3]);
                            if(totalharga[3] == 0){
                                System.out.println("Anda tidak membeli");
                                menu_berulang();
                            } else {
                            System.out.println("Silakan Bayar Dikasir");
                                System.out.println("=============================KASIR==============================");
                                System.out.print("Masukkan Nominal Uang Anda : Rp."); 
                                uang = sc.nextInt();
                                if (uang == totalharga[3]){
                                    System.out.println("Uang Anda Pas");
                                } else if (uang < totalharga[3]){
                                    System.out.println("Uang Anda Kurang");
                                } else if (uang > totalharga[3]){
                                    kembalian = totalharga[3] - uang;
                                    System.out.println("Uang Anda Lebih, Kembaliannya adalah : Rp." + Math.abs(kembalian));
                                } 
                            menu_berulang();
                            }
                        } else if (pilihan1 == 5){
                            hargasayur[4] = hargasayur[4];
                            System.out.println("Anda Membeli beras seharga : Rp." + hargasayur[4]);
                            System.out.println("Berapa Banyak Anda Ingin Membeli? ");
                            jumlahbeli = sc1.nextInt();
                            totalharga[4] = hargasayur[4] * jumlahbeli;
                            System.out.println("Totalnya adalah : Rp." + totalharga[4]);
                            if(totalharga[4] == 0){
                                System.out.println("Anda tidak membeli");
                                System.out.println("Silakan Bayar Dikasir");
                                System.out.println("=============================KASIR==============================");
                                System.out.print("Masukkan Nominal Uang Anda : Rp."); 
                                uang = sc.nextInt();
                                if (uang == totalharga[4]){
                                    System.out.println("Uang Anda Pas");
                                } else if (uang < totalharga[4]){
                                    System.out.println("Uang Anda Kurang");
                                } else if (uang > totalharga[4]){
                                    kembalian = totalharga[4] - uang;
                                    System.out.println("Uang Anda Lebih, Kembaliannya adalah : Rp." + Math.abs(kembalian));
                                } 
                                menu_berulang();
                            } else {
                            System.out.println("Silakan Bayar Dikasir");
                            menu_berulang();
                            }
                        } else if (pilihan1 == 6){
                            menu_barang();
                        } else {
                            System.out.println("Pilihan Yang Anda Masukkan Salah.");
                        }
                    break;
                case 3 :
                        menuutama();
                    break;
                default: System.out.println("Pilihan Yang Anda Masukkan Salah.");
                    break;
            }
        } while (pilian_menu != 3);
    }

    //method cek_barang
    public void cek_barang(){
        inisialisasi();
            System.out.println("Daftar Harga     : "); 
            System.out.println("Komputer         : Rp." + hargabaranelek[0]); 
            System.out.println("Smartphone       : Rp." + hargabaranelek[1]); 
            System.out.println("lemari pendingin : Rp." + hargabaranelek[2]);
            System.out.println("AC               : Rp." + hargabaranelek[3]); 
            System.out.println("Televisi         : Rp." + hargabaranelek[4]); 
            System.out.println("Bayam            : Rp." + hargasayur[0]);
            System.out.println("Wortel           : Rp." + hargasayur[1]);  
            System.out.println("Jeruk            : Rp." + hargasayur[2]);      
            System.out.println("Apel             : Rp." + hargasayur[3]);  
            System.out.println("Beras            : Rp." + hargasayur[4]); 
        menuutama();
    }

    //method set_nama(input)
    public void set_nama(String nama){
        this.nama = nama;
    }
    //method get_nama(input)
    public String get_nama(){
        return this.nama;
    }
    //method set_nomorID(input)
    public void set_noID(String ID){
        this.ID = ID;
    }
    //method get_nomorID(input)
    public String get_noID(){
        return this.ID;
    }

    //method menu utama
    static void menuutama(){
        //object pada method menuutama
        TBTokoSwalayan item = new TBTokoSwalayan();
        int pilihan_menu = 5;
        Scanner inputan = new Scanner(System.in);
        System.out.println("");
        System.out.println("MENU");
        System.out.println("");
        System.out.println("1. Belanja");
        System.out.println("2. Daftar Harga");
        System.out.println("3. Keluar");
        do{
            System.out.print("Masukkan pilihan anda : ");
            pilihan_menu = inputan.nextInt();
            switch(pilihan_menu){
                case 1:
                    item.pilih_barang(pilihan1);
                    break;
                case 2:
                    item.cek_barang();
                    break;
                case 3:
                        System.out.println("Terima Kasih Telah Menggunakan Sistem");
                        System.exit(0);
                    break;
                default: System.out.println("Pilihan Menu Salah"); break;
            }
        }while (pilihan_menu != 3);
    }

    //Setter getter untuk menampilkan nama
    public void set_namasaya(String namasaya){
        this.namasaya = namasaya;
    }
    public String get_namasaya(){
        return this.namasaya;
    }
    //Setter getter untuk menampilkan NPM
    public void set_NPM(String Npm){
        this.Npm = Npm;
    }
    public String get_NPM(){
        return this.Npm;
    }
    //Setter getter untuk menampilkan program
    public void set_prog(String program){
        this.program = program;
    }
    public String get_prog(){
        return this.program;
    }
    //Setter getter untuk menampilkan update
    public void set_update(String Update){
        this.Update = Update;
    }
    public String get_update(){
        return this.Update;
    }

    //main method
    public static void main(String []args){
        //nilai default dari do-while
        String masuk_nama;
        String masuk_ID;
        //membuat inputan
        Scanner input_nama = new Scanner(System.in);
        //object pada main method
        TBTokoSwalayan name = new TBTokoSwalayan();
        TBTokoSwalayan ID = new TBTokoSwalayan();

        TBTokoSwalayan namesaya = new TBTokoSwalayan();
        TBTokoSwalayan NIM = new TBTokoSwalayan();
        TBTokoSwalayan prgm= new TBTokoSwalayan();
        TBTokoSwalayan updte = new TBTokoSwalayan();
        //mengatur nilai setter
        NIM.set_NPM("NPM     : 4519210002");
        namesaya.set_namasaya("Nama    : Daniel Aditya Warih");
        prgm.set_prog("Program : Tugas Besar UTS - Toko Swalayan");
        updte.set_update("Update  : 12 April 2021");
        //memanggil nilai getter
        System.out.println(NIM.get_NPM());
        System.out.println(namesaya.get_namasaya());
        System.out.println(prgm.get_prog());
        System.out.println(updte.get_update());
        System.out.println("================================================================");
        System.out.print("Masukkan Nama Anda : "); 
        masuk_nama = input_nama.nextLine();
        name.set_nama(masuk_nama); //setter sebagai input
        System.out.print("Masukkan No ID Pelanggan Anda : ");
        masuk_ID = input_nama.nextLine(); 
        ID.set_noID(masuk_ID);

        System.out.println("================================================================");
        System.out.println("Selamat Datang di Sistem Swalayan " + name.get_nama()); //getter dari input
        System.out.println("Nomor ID Anda Adalah Pelanggan Anda Adalah : " + ID.get_noID());
        menuutama();
    }
}
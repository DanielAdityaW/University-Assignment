//NPM : 4519210002, 4517210037, 4517210049 
//Nama : Daniel Aditya Warih  , Risa Agustina Putri , Windi Wulandari 
//Update : 14-Juni-2021
//Subject : UAS PBO Sistem Bank Sederhana

package App;

import java.util.ArrayList;
import java.util.Scanner;

class Account{

    int 1nama = 5;

    public int inputPilihan;
    
    protected String inputNama;
    protected String inputFormatPin;
    protected int inputPin;
    protected int norek;
    protected int inputNoRek;
    protected double inputSaldo;
    protected double saldoTransfer;
    protected double totalSaldo;
    protected double bunga;

    private Double jumlahTransaksia;
    private Double jumlahBungaa;
    private Double sisaSaldoa;
    private double tambahSaldo;
    private String jenisTransaksia;
    private String namaNoRek;
    private int inputMenu;

    Account(){
    }

    Account(String jenisTransaksi, Double jumlahTransaksi, Double jumlahBunga, Double sisaSaldo){
        this.jenisTransaksia = jenisTransaksi;
        this.jumlahTransaksia = jumlahTransaksi;
        this.jumlahBungaa = jumlahBunga;
        this.sisaSaldoa = sisaSaldo;
    }

    ArrayList<String> nama = new ArrayList<String>();
    ArrayList<String> pin = new ArrayList<String>();
    ArrayList<Integer> nomorRek = new ArrayList<Integer>();
    ArrayList<Double> saldo = new ArrayList<Double>();
    ArrayList<Account> akun = new ArrayList<Account>();

    Scanner sc = new Scanner(System.in);

    public void setNama(String nama){
        this.inputNama = nama;
    }
    public String getNama(){
        return this.inputNama;
    }

    public void setPin(String pin){
        this.inputFormatPin = pin;
    }
    public String getPin(){
        return this.inputFormatPin;
    }

    public void setSaldo(Double saldo){
        this.inputSaldo = saldo;
    }
    public Double getSaldo(){
        return this.inputSaldo;
    }

    public void setNoRek(int norek){
        this.norek = norek;
    }
    public int getNoRek(){
        return this.norek;
    }

    public void lihatAkunBuatAkun(){
        System.out.println("------------------------------------");
        System.out.println("> No.Rek anda adalah    : " + getNoRek());
        System.out.println("> Username anda adalah  : " + getNama());
        System.out.print("> Nomor Pin anda adalah : " + getPin());
        System.out.println("> Saldo Anda adalah     : Rp." + String.format("%.0f", getSaldo())); 
        System.out.println();
    }

    public boolean cekPanjangPin(int pin, int panjang){
        return Math.log10(pin) < panjang;
    }

    public void menuPilihan(){
        do{
            System.out.println("========== MENU =========");
            System.out.println("Selamat Datang " + getNama());
            System.out.println("1. Setor Saldo");
            System.out.println("2. Tarik Saldo");
            System.out.println("3. Cek Saldo");
            System.out.println("4. Riwayat Transaksi");
            System.out.println("5. Transfer");
            System.out.println("0. Keluar");
            System.out.print("> Masukkan pilihan anda : ");
            inputMenu = sc.nextInt();
            switch(inputMenu){
                case 1: setorSaldo(); break;
                case 2: tarikSaldo(); break;
                case 3: informasi(); break;
                case 4: riwayatTransasksi(); break;
                case 5: Transfer(); break;
                case 0: keluar(); break;
                default: break;
            }
        } while (inputMenu != 0);
    }
    
    public void Transfer(){
        inputNama = nama.get(pin.indexOf(inputFormatPin));
        inputSaldo = saldo.get(nama.indexOf(inputNama));
        System.out.print("> Masukan Username Tujuan Transfer : ");
        try{
            sc.nextLine();
            namaNoRek = sc.nextLine();
            saldoTransfer= saldo.get(nama.indexOf(namaNoRek));
            System.out.print("> Masukan Nomor Rekening Tujuan Transfer : ");
            inputNoRek = sc.nextInt();
            if (nama.indexOf(inputNama) != nomorRek.indexOf(inputNoRek)){ 
                if (nama.indexOf(namaNoRek) == nomorRek.indexOf(inputNoRek)){
                    if (nama.contains(namaNoRek) && nomorRek.contains(inputNoRek)){
                        System.out.print("> Masukkan jumlah yang ingin anda Transfer : Rp.");
                        tambahSaldo = sc.nextDouble();
                        if (tambahSaldo <= inputSaldo){
                            inputSaldo -= tambahSaldo;
                            saldoTransfer += tambahSaldo;
                            akun.add(new Account("TRANSFER", tambahSaldo, 0.0, inputSaldo));
                            saldo.set(nama.indexOf(inputNama),inputSaldo);
                            saldo.set(nama.indexOf(namaNoRek),saldoTransfer);
                            System.out.println("> Sisa Saldo Anda : Rp." + String.format("%.0f",saldo.get(nama.indexOf(inputNama))));
                            System.out.println("=========================\n");
                        } else if (tambahSaldo > inputSaldo){
                            System.out.println("> Saldo anda tidak mencukupi\n");
                        } else if (tambahSaldo <= 0){
                            System.out.println("> Tidak dapat memasukkan nilai negative\n");
                        }
                    } else {
                        System.out.println("> AKUN TIDAK TERSEDIA(2)\n");
                    }
                } else if (nama.indexOf(inputNama) == nomorRek.indexOf(inputNoRek)){
                    if (nama.contains(inputNama) && nomorRek.contains(inputNoRek)){
                        System.out.println("> Tidak dapat Transfer ke akun sendiri");
                    } else {
                        System.out.println("> AKUN TIDAK TERSEDIA(3)\n");
                    }
                } else {
                    System.out.println("> AKUN TIDAK TERSEDIA\n");
                }
            }
        }catch (IndexOutOfBoundsException e){
            System.out.println("> AKUN TIDAK TERSEDIA\n");
        }
    }

    public void setorSaldo(){   
        inputSaldo = saldo.get(nama.indexOf(inputNama));
            System.out.println("======== SETORAN ========");
            System.out.print("> Masukan Jumlah Yang ingin anda setorkan : Rp.");
            tambahSaldo = sc.nextDouble();
            if (tambahSaldo > 0 && tambahSaldo < 500000){
                inputSaldo += tambahSaldo;
                akun.add(new Account("SETOR", tambahSaldo, 0.0, inputSaldo));
                saldo.set(nama.indexOf(inputNama), inputSaldo);
                System.out.println("> Sisa Saldo Anda : Rp." + String.format("%.0f",saldo.get(nama.indexOf(inputNama))));
                System.out.println("=========================\n");
            } else if (tambahSaldo >= 500000){
                inputSaldo = inputSaldo + tambahSaldo;
                bunga = inputSaldo * 0.02;
                inputSaldo = inputSaldo + bunga;
                akun.add(new Account("SETOR", tambahSaldo, bunga, inputSaldo));
                saldo.set(nama.indexOf(inputNama), inputSaldo);
                System.out.println("> Selamat anda mendapatkan bunga sebesar 2% yaitu Rp." + bunga);
                System.out.println("> Sisa Saldo Anda : Rp." + String.format("%.0f",saldo.get(nama.indexOf(inputNama))));
                System.out.println("=========================\n");
            } else if (tambahSaldo < 0){
                System.out.println("> Tidak dapat memasukkan nilai negative\n");
            }
            
    }

    public void tarikSaldo(){
        inputSaldo = saldo.get(nama.indexOf(inputNama));
        System.out.println("========= TARIK =========");
            System.out.print("> Masukan Jumlah Yang ingin anda tarik : Rp.");
            tambahSaldo = sc.nextDouble();
            if(tambahSaldo < inputSaldo){
                inputSaldo -= tambahSaldo;
                akun.add(new Account("TARIK", tambahSaldo, 0.0, inputSaldo));
                saldo.set(nama.indexOf(inputNama), inputSaldo);
                System.out.println("> Sisa Saldo Anda : Rp." + String.format("%.0f",saldo.get(nama.indexOf(inputNama))));
                System.out.println("=========================\n");
            } else if (tambahSaldo > inputSaldo){
                System.out.println("Saldo tidak mencukupi\n");
            } else if (tambahSaldo < 0){
                System.out.println("Tidak dapat memasukkan nilai negative\n");
            }
    }
    
    public void informasi(){
        System.out.println("======= INFO USER =======");
        System.out.println("> No.Rek    : " + nomorRek.get(nama.indexOf(inputNama)));
        System.out.println("> Nama      : " + getNama());
        System.out.print("> Nomor Pin : " + getPin());
        System.out.println("> Saldo     : Rp." + String.format("%.0f", saldo.get(nama.indexOf(inputNama))));
        System.out.println("=========================\n");
    }

    public void riwayatTransasksi(){
        System.out.println("=== RIWAYAT TRANSAKSI ===");
        if (!akun.isEmpty()){
            for (Account ac : akun){
                System.out.println("> Jenis Transaksi  : " + ac.jenisTransaksia);
                System.out.println("> Jumlah Transaksi : " + String.format("%.0f", ac.jumlahTransaksia));
                System.out.println("> Bunga            : " + String.format("%.0f", ac.jumlahBungaa));
                System.out.println("> Sisa Saldo       : " + String.format("%.0f", ac.sisaSaldoa));
                System.out.println("-------------------------");
            }
            System.out.println("> Setiap login riwayat akan kosong,\n> Riwayat transaksi hanya dapat tersedia selama pengguna login");
            System.out.println("=========================\n");
        } else {
            System.out.println("> Riwayat Transaksi Kosong\n> Setiap login riwayat akan kosong");
            System.out.println("> Riwayat transaksi hanya dapat tersedia selama pengguna login");
            System.out.println("=========================\n");
        }
    }

    public void keluar(){
        akun.clear();
    }
}

class buatAccount extends Account{ 

    private static int panjangCharacter = 20;
    private static final int adminPin= 444444;
    private static final String adminUser= "admin";

    public void buatAkun(){
        System.out.print("> Masukkan Username[20 Karakter]  : ");
        sc.nextLine();
        inputNama = sc.nextLine();
        if(inputNama.length() <= panjangCharacter){
            System.out.print("> Masukkan Nomor Pin[Max 6 Digit] : ");
            inputPin = sc.nextInt();
            inputFormatPin = String.format("%06d%n",inputPin);
            if(cekPanjangPin(inputPin, 6)){
                System.out.print("> Masukkan Saldo Awal[Minimal Rp.500000] : Rp.");
                inputSaldo = sc.nextDouble();
                int minDigit = 10000000;  
                int maxDigit = 99999999;  
                int norek = (int)(Math.random()*(maxDigit-minDigit+1)+minDigit);  
                if (inputSaldo >= 500000){
                    pin.add(inputFormatPin); 
                    nama.add(inputNama);
                    saldo.add(inputSaldo);
                    nomorRek.add(norek);
                    setNama(inputNama);
                    setPin(inputFormatPin);
                    setSaldo(inputSaldo);
                    setNoRek(norek);
                    lihatAkunBuatAkun();
                } else {
                    System.out.println("> Saldo dibawah Ketentuan\n");
                }
            } else if(inputPin < 0){
                System.out.println("> Nomor Pin Tidak dapat negative\n");
            } else if(inputPin == 0){    
                System.out.println("> Pin Tidak dapat bernilai kosong\n");
            } else {
                System.out.println("> Nomor Pin anda terlalu panjang\n");
            }
        } else {
            System.out.println("> Nama melebihi 8 Karakter, Tidak Dapat Memasukkan Username\n");
        }
    }

    public void masukAkun(){
        System.out.print("> Masukkan Username  : ");
        sc.nextLine();
        inputNama = sc.nextLine();
        System.out.print("> Masukkan Nomor Pin : ");
        inputPin = sc.nextInt();
        inputFormatPin = String.format("%06d%n", inputPin);
        if(nama.indexOf(inputNama) == pin.indexOf(inputFormatPin)){
            if (nama.contains(inputNama) && pin.contains(inputFormatPin)){
                menuPilihan();
            }else {
                System.out.println("> Akun Tidak Terdaftar\n");
            }
        } else if (nama.indexOf(inputNama) != pin.indexOf(inputFormatPin)){
            System.out.println("> Username / pin salah\n");
        } else {
            System.out.println("> Akun Tidak Terdaftar\n");
        }
    }

    public void daftarAkun(){
        System.out.print("> Masukkan Username  : ");
        inputNama = sc.next();
        System.out.print("> Masukkan Nomor Pin : ");
        inputPin = sc.nextInt();
        if (inputNama.equals(adminUser)){
            if(inputPin == adminPin){
                if (!nama.isEmpty() && !pin.isEmpty() && !saldo.isEmpty()){
                    System.out.println("======= INFO USER =======");
                    for (int i = 0; i < nama.size(); i++){
                        System.out.println("> Username : " + nama.get(i));
                        System.out.println("> No. Rek  : " + nomorRek.get(i));
                        System.out.print("> Pin      : " + pin.get(i));
                        System.out.println("> Saldo    : Rp." + String.format("%.0f", saldo.get(i)));
                        System.out.println("-------------------------");
                    }
                } else {
                    System.out.println("> Belum Ada Data\n");
                }
            } else {
                System.out.println("> Anda Bukan Admin\n");
            }
        } else {
            System.out.println("> Anda Bukan Admin\n");
        }
    }
}

public class App{
    public static void main(String[] args) throws Exception{

        buatAccount ba = new buatAccount();

        do{ 
            System.out.println("========== MENU =========");
            System.out.println("1. Buat Akun");
            System.out.println("2. Login");
            System.out.println("3. Keluar");
            System.out.print("> Masukkan pilihan : ");
            ba.inputPilihan = ba.sc.nextInt();
            switch (ba.inputPilihan) {
                case 1: ba.buatAkun(); break;
                case 2: ba.masukAkun(); break;
                case 3: System.out.println("Anda Keluar\n"); break;
                case 99: ba.daftarAkun(); break;
                default: System.out.println("Input Menu Salah\n"); break;
            }
        } while (ba.inputPilihan != 3);
    }
}
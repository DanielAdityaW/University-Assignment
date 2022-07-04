#include<iostream>
#include<string.h>
#include<stdio.h>
using namespace std;

int hargaADI[] = {0,1000000,2000000,500000,1300000, 750000, 1200000,1100000,600000,800000};
int kADI = sizeof(hargaADI)/sizeof(hargaADI[0]);

struct nodaADI {
    int nomorADI;
    char namapelangganADI[50];
    nodaADI *nextADI;
};
nodaADI *atasADI;

class stackADI {
    public :
    void belitiketADI(char namaADI[], int noADI);
    void hapusdataADI();
    void tampilkanADI();
    int pencarianADI();
};

void stackADI::belitiketADI(char namaADI[],int noADI){
    struct nodaADI *nodabaruADI = new nodaADI;
    strcpy(nodabaruADI->namapelangganADI, namaADI);
    nodabaruADI->nomorADI=noADI;
    nodabaruADI->nextADI=atasADI;
    atasADI=nodabaruADI;
}

void stackADI::hapusdataADI(){
    if (atasADI == NULL){
        cout<<"Tidak Ada Data"<<endl;
        return;
    }
    cout<<"Data Teratas Berhasil Dihapus"<<endl;
    atasADI=atasADI->nextADI;
}

void stackADI::tampilkanADI(){
    int iADI = 1;
    struct nodaADI *tempADI = atasADI;
    if (atasADI == NULL){
        cout<<"Tidak Ada Data"<<endl;
        return;
    }
    while (tempADI != NULL ){
    int pilihADI = tempADI->nomorADI;
        switch (pilihADI)
        {
        case 1 :cout<<"["<<iADI<<"]\n"; 
                cout<<"Nama                 : " <<tempADI->namapelangganADI<<endl;
                cout<<"Bandara Tujuan       : Halim Perdana Kusuma \n";
                cout<<"Maskapai Penerbangan : Garuda Indonesia \n";
                cout<<"Harga Tiket          : Rp.500000 \n"; 
                cout<<endl; break;
        case 2 :cout<<"["<<iADI<<"]\n"; 
                cout<<"Nama                 : " <<tempADI->namapelangganADI<<endl;
                cout<<"Bandara Tujuan       : I Gusti Ngurah Rai \n";
                cout<<"Maskapai Penerbangan : Lion Air \n";
                cout<<"Harga Tiket          : Rp.600000 \n"; 
                cout<<endl; break;
        case 3 :cout<<"["<<iADI<<"]\n"; 
                cout<<"Nama                 : " <<tempADI->namapelangganADI<<endl;
                cout<<"Bandara Tujuan       : I Gusti Ngurah Rai \n";
                cout<<"Maskapai Penerbangan : Citilink \n";
                cout<<"Harga Tiket          : Rp.750000 \n"; 
                cout<<endl; break;
        case 4 :cout<<"["<<iADI<<"]\n"; 
                cout<<"Nama                 : " <<tempADI->namapelangganADI<<endl;
                cout<<"Bandara Tujuan       : Halim Perdana Kusuma \n";
                cout<<"Maskapai Penerbangan : Lion Air \n";
                cout<<"Harga Tiket          : Rp.800000 \n"; 
                cout<<endl; break;
        case 5 :cout<<"["<<iADI<<"]\n"; 
                cout<<"Nama                 : " <<tempADI->namapelangganADI<<endl;
                cout<<"Bandara Tujuan       : Soekarno Hatta \n";
                cout<<"Maskapai Penerbangan : Garuda Indonesia \n";
                cout<<"Harga Tiket          : Rp.1000000 \n"; 
                cout<<endl; break;
        case 6 :cout<<"["<<iADI<<"]\n"; 
                cout<<"Nama                 : " <<tempADI->namapelangganADI<<endl;
                cout<<"Bandara Tujuan       : Soekarno Hatta \n";
                cout<<"Maskapai Penerbangan : Lion Air \n";
                cout<<"Harga Tiket          : Rp.1100000 \n"; 
                cout<<endl; break;
        case 7 :cout<<"["<<iADI<<"]\n"; 
                cout<<"Nama                 : " <<tempADI->namapelangganADI<<endl;
                cout<<"Bandara Tujuan       : Halim Perdana Kusuma \n";
                cout<<"Maskapai Penerbangan : Citilink \n";
                cout<<"Harga Tiket          : Rp.1200000 \n"; 
                cout<<endl; break;
        case 8 :cout<<"["<<iADI<<"]\n"; 
                cout<<"Nama                 : " <<tempADI->namapelangganADI<<endl;
                cout<<"Bandara Tujuan       : Soekarno Hatta \n";
                cout<<"Maskapai Penerbangan : Citilink \n";
                cout<<"Harga Tiket          : Rp.1300000 \n"; 
                cout<<endl; break;
        case 9 :cout<<"["<<iADI<<"]\n"; 
                cout<<"Nama                 : " <<tempADI->namapelangganADI<<endl;
                cout<<"Bandara Tujuan       : I Gusti Ngurah Rai \n";
                cout<<"Maskapai Penerbangan : Garuda Indonesia \n";
                cout<<"Harga Tiket          : Rp.2000000 \n"; 
                cout<<endl; break; 
        default:cout<<"Dikarenakan Tiket Tersedia, Maka Data Yang Gagal Akan Dihapus Otomatis " <<endl;
                cout<<"Masuk Kembali Ke Pilihan Tampilkan Maka Data Sudah Terhapus " <<endl;
                atasADI=atasADI->nextADI; ;break;
        }
        cout<<endl;
        tempADI = tempADI->nextADI;
        iADI++;
    }
}

int stackADI::pencarianADI(){
    char nameADI[50];
    struct nodaADI *tempADI = atasADI;
    cout<<endl;
    cout<<"Masukkan Nama Yang Anda Cari : ";
    cin.ignore(true);
    cin.getline(nameADI, 50);
    int iADI = 0;
    if (tempADI == NULL) {
        cout<<"Data Kosong"<<endl;
        return 0;
    }
    while (tempADI != NULL){
        ULANGADI:
        if (nameADI[iADI] == tempADI->namapelangganADI[iADI]){
            cout<<"Data Yang Anda Cari Ditemukan"<<endl;
            return iADI;
        }
        tempADI=tempADI->nextADI;
        if (tempADI!=NULL)
            goto ULANGADI;
        else 
            cout<<"Data Yang Dicari Tidak Ada"<<endl;
    }
    return 0;
}

void cetakanADI(int *hargaADI, int kADI){
    for (int iADI= 1; iADI<=kADI; iADI++){
        int PilihADI;
        PilihADI = hargaADI[iADI];
        switch (PilihADI)
        {
        case 1000000:cout<<iADI<<".Rp.1000000 - Soekarno Hatta       - Garuda Indonesia"<<endl; break;
        case 2000000:cout<<iADI<<".Rp.2000000 - I Gusti Ngurah Rai   - Garuda Indoensia"<<endl; break;
        case 500000: cout<<iADI<<".Rp.500000  - Halim perdana Kusuma - Garuda Indonesia"<<endl; break;
        case 1300000:cout<<iADI<<".Rp.1300000 - Soekarno Hatta       - Citilink "<<endl; break;
        case 750000 :cout<<iADI<<".Rp.750000  - I Gusti Ngurah Rai   - Citilink "<<endl; break;
        case 1200000:cout<<iADI<<".Rp.1200000 - Halim Perdana Kusuma - Citilink "<<endl; break;
        case 1100000:cout<<iADI<<".Rp.1100000 - Soekarno Hatta       - Lion Air "<<endl; break;
        case 600000 :cout<<iADI<<".Rp.600000  - I Gusti Ngurah Rai   - Lion Air "<<endl; break;
        case 800000 :cout<<iADI<<".Rp.800000  - Halim Perdana Kusuma - Lion Air "<<endl; break;
        default:
            break;
        }
    }
    cout<<endl;
}

void quicksortADI(int *hargaADI, int lowADI, int highADI)
{
    int iADI = lowADI;
    int jADI = highADI;
    int pivotADI = hargaADI[(iADI+jADI)/2];
    int tempADI;
    while(iADI<=jADI)
    {
        while (hargaADI[iADI]<pivotADI)
            iADI++;
        while (hargaADI[jADI]>pivotADI)
            jADI--;
        if(iADI<=jADI)
        {
            tempADI = hargaADI[iADI];
            hargaADI[iADI]=hargaADI[jADI];
            hargaADI[jADI]=tempADI;
            iADI++;
            jADI--;
        }
    }
    if (jADI>lowADI)
        quicksortADI(hargaADI, lowADI, jADI);
    if (iADI<highADI)
        quicksortADI(hargaADI, iADI, highADI);
}

void inisialisasiADI(){
    hargaADI[0] = 0;
    hargaADI[1] = 1000000;
    hargaADI[2] = 2000000;
    hargaADI[3] = 500000;
    hargaADI[4] = 1300000; 
    hargaADI[5] = 750000; 
    hargaADI[6] = 1200000;
    hargaADI[7] = 1100000;
    hargaADI[8] = 600000;
    hargaADI[9] = 800000;
}

int main(){
    stackADI bADI;
    char pilihanADI;
    do{
        int nADI;
        cout<<"================================="<<endl;
        cout<<" Program Pembelian Tiket Pesawat "<<endl;
        cout<<"================================="<<endl;
        cout<<"            Menu Utama           "<<endl;
        cout<<"Masukan Pilihan :\n"<<"1.Beli Tiket\n"<<"2.Hapus Data Teratas\n"<<"3.Tampilkan Data\n"<<"4.Pencarian Data\n"<<"5.Keluar\n";
        cout<<"Pilihan Anda    : "; cin>>nADI;
        switch(nADI){
            case 1:
            nodaADI nADI;
            cout<<"Masukkan Nama Anda : ";
            cin.ignore(true);
            cin.getline(nADI.namapelangganADI, 50);
            inisialisasiADI();
            cout<<"============================================================"<<endl;
            cout<<"  Daftar Harga -    Tujuan Bandara  -  Maskapai Penerbangan "<<endl;
            cout<<"============================================================"<<endl;
            cout<<"Pilih Tiket Anda : "<<endl;
            cout<<endl;
            cout<<"Harga Sebelum Disorting : "<<endl;
            cetakanADI(hargaADI,kADI);
            quicksortADI(hargaADI, 0, kADI-1);
            cout<<"Harga Setelah Disorting : "<<endl;
            cetakanADI(hargaADI,kADI);
            cout<<"Masukkan Pilihan : "; cin>>nADI.nomorADI;
            cout<<endl;
            switch (nADI.nomorADI)
            {
            case 1 :cout<<"Pembelian selesai"<<endl; break;
            case 2 :cout<<"Pembelian selesai"<<endl; break;
            case 3 :cout<<"Pembelian selesai"<<endl; break;
            case 4 :cout<<"Pembelian selesai"<<endl; break;
            case 5 :cout<<"Pembelian selesai"<<endl; break;
            case 6 :cout<<"Pembelian selesai"<<endl; break;
            case 7 :cout<<"Pembelian selesai"<<endl; break;
            case 8 :cout<<"Pembelian selesai"<<endl; break;
            case 9 :cout<<"Pembelian selesai"<<endl; break;
            default: cout<<"Tiket Tidak Tersedia"<<endl; break;
            }
            bADI.belitiketADI(nADI.namapelangganADI, nADI.nomorADI);
            break;
        case 2 : bADI.hapusdataADI(); break;
        case 3 : bADI.tampilkanADI(); break;
        case 4 : bADI.pencarianADI(); break;
        case 5 : exit(1); break;
        default : cout<<"Menu Tidak Tersedia"<<endl; break;
        }
        cout<<"Apakah Anda Ingin Melanjutkan Program dan Kembali Ke Menu Utama? (Y/N) : ";
        cin>>pilihanADI;
    } while(pilihanADI == 'Y'|| pilihanADI == 'y');
    return 0;
    cin.get();
}
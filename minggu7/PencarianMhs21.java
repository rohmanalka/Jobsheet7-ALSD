package minggu7;

public class PencarianMhs21 {
    Mahasiswa21 listMhs[] = new Mahasiswa21[5];
    int idx;
    
    void tambah(Mahasiswa21 m) {
        if(idx < listMhs.length) {
            listMhs[idx] = m;
            idx ++;
        } else {
            System.out.println("Data Sudah Penuh !!");
        }
    }

    void tampil() {
        for(Mahasiswa21 m : listMhs) {
            m.tampil();
            System.out.println("-----------------------");
        }
    }

    public int findSeqSearch(int cari) {
        int posisi = -1;
        for(int j=0; j < listMhs.length; j++) {
            if(listMhs[j].nim == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void tampilPosisi(int x, int pos) {
        if(pos != -1) {
            System.out.println("data: " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data" + x + " tidak ditemukan");
        }
    }

    public void tampilData(int x, int pos){
        if(pos!= -1) {
            System.out.println("Nim\t: " + x);
            System.out.println("Nama\t: " +listMhs[pos].nama);
            System.out.println("umur\t: " +listMhs[pos].umur);
            System.out.println("IPK\t: " +listMhs[pos].ipk);
        } else{
            System.out.println("Data "+ x +" Tidak ditemukan" );
        }
    }

    // public int findBinarySearch(int cari, int left, int right){
    //     int mid;
    //     if(right >= left){
    //         mid = (left + right)/2;
    //         if(cari == listMhs[mid].nim){
    //             return(mid);
    //         }else if(listMhs[mid].nim > cari){
    //             return findBinarySearch(cari, left, mid -1);
    //         }else{
    //             return findBinarySearch(cari, mid +1, right);
    //         }
    //     }
    //     return -1;
    // }
}
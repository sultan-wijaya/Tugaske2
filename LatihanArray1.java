package Tugas2;

public class LatihanArray1 {
        public static void main(String[] args) {
        
            // 1. Membuat array dengan 10 bilangan bulat
        int[] bilanganGenap = new int[10];    
        
            int jumlah = 0;
    
            // 2. Mengisi array dengan bilangan genap mulai dari 2
            for (int i = 0; i < bilanganGenap.length; i++) {
                bilanganGenap[i] = (i + 1) * 2;
            }
    
            // 3. Menampilkan isi array
            System.out.print("Isi array: ");
            for (int bilangan : bilanganGenap) {
                System.out.print(bilangan + " ");
            }
            System.out.println();
    
            // 4. Menghitung jumlah semua elemen array
            for (int bilangan : bilanganGenap) {
                jumlah += bilangan;
            }
    
            System.out.println("Jumlah semua elemen array: " + jumlah);
        }
    }

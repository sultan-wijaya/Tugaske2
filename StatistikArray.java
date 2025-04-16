package Tugas2;

public class StatistikArray {
    public static void main(String[] args) {
        // Program menghitung statistik nilai siswa
        int[] nilai = {75, 80, 65, 90, 85, 70, 95, 88};

        // Validasi jika array kosong
        if (nilai.length == 0) {
            System.out.println("Array nilai kosong");
            return;
        }

        // Mencari nilai tertinggi dan terendah
        int tertinggi = nilai[0];
        int terendah = nilai[0];
        int total = 0;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] > tertinggi) tertinggi = nilai[i];
            if (nilai[i] < terendah) terendah = nilai[i];
            total += nilai[i];
        }

        double rataRata = (double) total / nilai.length;

        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Rata-rata: " + String.format("%.2f", rataRata));
    }
}

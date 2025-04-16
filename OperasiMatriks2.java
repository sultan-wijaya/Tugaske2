
public class OperasiMatriks2 {
        public static void main(String[] args) {
            int[][] matriksA = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
    
            int[][] matriksB = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
            };
    
            System.out.println("Perkalian Matriks:");
            int[][] hasilKali = perkalianMatriks(matriksA, matriksB);
            tampilkanMatriks(hasilKali);
    
            System.out.println("\nTranspose Matriks A:");
            int[][] transposeA = transposeMatriks(matriksA);
            tampilkanMatriks(transposeA);
    
            System.out.println("\nDiagonal Utama dan Diagonal Samping Matriks A:");
            tampilkanDiagonal(matriksA);
        }
    
        public static int[][] perkalianMatriks(int[][] A, int[][] B) {
            int baris = A.length;
            int kolom = B[0].length;
            int[][] hasil = new int[baris][kolom];
    
            for (int i = 0; i < baris; i++) {
                for (int j = 0; j < kolom; j++) {
                    for (int k = 0; k < A[0].length; k++) {
                        hasil[i][j] += A[i][k] * B[k][j];
                    }
                }
            }
            return hasil;
        }
    
        public static int[][] transposeMatriks(int[][] matriks) {
            int baris = matriks.length;
            int kolom = matriks[0].length;
            int[][] transpose = new int[kolom][baris];
    
            for (int i = 0; i < baris; i++) {
                for (int j = 0; j < kolom; j++) {
                    transpose[j][i] = matriks[i][j];
                }
            }
            return transpose;
        }
    
        public static void tampilkanDiagonal(int[][] matriks) {
            int n = matriks.length;
            System.out.print("Diagonal Utama: ");
            for (int i = 0; i < n; i++) {
                System.out.print(matriks[i][i] + " ");
            }
            System.out.println();
    
            System.out.print("Diagonal Samping: ");
            for (int i = 0; i < n; i++) {
                System.out.print(matriks[i][n - 1 - i] + " ");
            }
            System.out.println();
        }
    
        public static void tampilkanMatriks(int[][] matriks) {
            for (int[] baris : matriks) {
                for (int nilai : baris) {
                    System.out.print(nilai + " ");
                }
                System.out.println();
            }
        }
    }
    


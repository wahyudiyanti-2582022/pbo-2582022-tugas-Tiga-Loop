import java.util.Scanner;

public class TigaLoop {
    /*
     * HASIL PERCOBAAN 1 (n = 5)
     *
     * Batas deret (n) : 5
     *
     * ===== SATU DERET, TIGA LOOP =====
     * for      : 1 2 3 4 5
     * while    : 1 2 3 4 5
     * do-while : 1 2 3 4 5
     *
     * i <  n berputar : 4 kali
     * i <= n berputar : 5 kali
     * Disaring : 1 3 5 7
     * Sampai println  : 4 kali
     *
     * HASIL PERCOBAAN 2 (n = 0)
     *
     * Batas deret (n) : 0
     *
     * ===== SATU DERET, TIGA LOOP =====
     * for      :
     * while    :
     * do-while : 1
     *
     * i <  n berputar : 0 kali
     * i <= n berputar : 0 kali
     * Disaring : 1 3 5 7
     * Sampai println  : 4 kali
     *
     * KENAPA do-while BEDA PADA n = 0?
     * for dan while mengecek kondisi SEBELUM badan loop dijalankan. Saat n = 0,
     * kondisi 1 <= 0 langsung false, jadi badan loop tidak pernah jalan dan
     * barisnya kosong. do-while mengecek kondisi SESUDAH badan loop dijalankan,
     * jadi angka 1 sempat tercetak sekali sebelum kondisi 2 <= 0 dicek dan
     * ternyata false.
     *
     * KESIMPULAN: do-while mengecek kondisinya sesudah badan loop dijalankan,
     * jadi badannya pasti jalan minimal sekali.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Batas deret (n) : ");
        int n = input.nextInt();

        System.out.println();
        System.out.println("===== SATU DERET, TIGA LOOP =====");
        // Versi 1: for. Pencacahnya i, hidup hanya di dalam for.
        System.out.print("for      :");
        for (int i = 1; i <= n; i++) {
            System.out.print(" " + i);
        }
        System.out.println();

        // Versi 2: while. Pencacahnya j, dideklarasikan dan dinaikkan manual.
        System.out.print("while    :");
        int j = 1;
        while (j <= n) {
            System.out.print(" " + j);
            j++;
        }
        System.out.println();

        // Versi 3: do-while. Pencacahnya k. Badan jalan dulu, baru kondisi dicek.
        System.out.print("do-while :");
        int k = 1;
        do {
            System.out.print(" " + k);
            k++;
        } while (k <= n);
        System.out.println();

        System.out.println();
    }
}

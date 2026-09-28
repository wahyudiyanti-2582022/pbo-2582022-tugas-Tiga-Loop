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
    }

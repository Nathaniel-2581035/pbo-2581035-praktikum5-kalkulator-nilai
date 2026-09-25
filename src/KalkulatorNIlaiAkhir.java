import java.util.Scanner;

public class KalkulatorNIlaiAkhir {
    static final double BOBOT_PRAKTIKUM = 0.30; //untuk membuat kosntanta menjadi angka desimal
    static final double BOBOT_TUGAS = 0.20; //pakai static final double untuk membuat konstanta menjadi desimal
    static final double BOBOT_MID = 0.20;
    static final double BOBOT_FINAL = 0.30;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nilai Praktikum: ");
        double nilaiPraktikum = input.nextDouble();

        System.out.print("Nilai Tugas: ");
        double nilaiTugas = input.nextDouble();

        System.out.print("Nilai Mid: ");
        double nilaiMid = input.nextDouble();

        System.out.print("Nilai Final: ");
        double nilaiFinal = input.nextDouble();

        int akhirInt = (int) nilaiPraktikum * 30/100 + (int) nilaiTugas * 20/100 + (int) nilaiMid * 20/100 + (int) nilaiFinal * 30/100;
        double akhir = nilaiPraktikum * 30/100 + nilaiTugas * 20/100 + nilaiMid * 20/100;
        akhir += nilaiFinal * BOBOT_FINAL;
        System.out.println("Versi int: " + akhirInt);
        System.out.println("Versi double: " + akhir);

        int dipotong = (int) akhir; // kadang beda kadang sama, tergantung desimalnya lewat 0.5 apa engga
        long dibulatkan = Math.round(akhir);
        double selisih = dibulatkan - dipotong;
        boolean lulus = akhir >= 60; // boolean langsung dari perbandingan, tanpa if

        System.out.println();
        System.out.println("akhir   : " + akhir);
        System.out.println("dipotong    : " + dipotong);
        System.out.println("dibulatkan  : " + dibulatkan);
        System.out.println();
        System.out.println("==== NILAI AKHIR ====");
        System.out.println("Praktikum   : " + nilaiPraktikum);
        System.out.println("Tugas       : " + nilaiTugas);
        System.out.println("Mid         : " + nilaiMid);
        System.out.println("Final       : " + nilaiFinal);
        System.out.println("Nilai akhir : " + akhir);
        System.out.println("Dipotong(int): " + dipotong);
        System.out.println("dibulatkan(round) : " + dibulatkan);
        System.out.println("selisih     : " + selisih);
        System.out.println("Lulus (>=60) : " + lulus);

    }
}

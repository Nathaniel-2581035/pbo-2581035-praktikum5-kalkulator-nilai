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


    }
}

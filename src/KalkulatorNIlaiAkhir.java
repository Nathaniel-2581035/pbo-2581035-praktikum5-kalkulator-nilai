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


        int dipotong = (int) akhir;
        long dibulatkan = Math.round(akhir);
        double selisih = dibulatkan - dipotong;


    }
}

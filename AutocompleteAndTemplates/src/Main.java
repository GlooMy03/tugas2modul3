/**
 * Program sederhana untuk menghitung jumlah atom dalam sebuah senyawa kimia.
 */
public class Main {

    /**
     * Metode untuk menghitung jumlah atom dalam sebuah senyawa kimia.
     *
     * @param  rumusKimia Rumus kimia dari senyawa (contoh: H2O untuk air).
     * @return  Jumlah atom dalam senyawa kimia.
     *
     *
     *
     */
    public static int hitungJumlahAtom(String rumusKimia) {
        int jumlahAtom = 0;

        for (char karakter : rumusKimia.toCharArray()) {
            if (Character.isLetter(karakter)) {
                jumlahAtom++;
            }
        }


        return jumlahAtom;
    }

    /**
     * Metode utama untuk menguji program.
     *
     * @param args Argumen baris perintah (tidak digunakan dalam contoh ini).
     */
    public static void main(String[] args) {
        String rumusAir = "H2O";
        int jumlahAtomAir = hitungJumlahAtom(rumusAir);
        System.out.println("Jumlah atom dalam " + rumusAir + " adalah: " + jumlahAtomAir);
    }
}

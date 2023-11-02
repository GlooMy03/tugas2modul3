import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Program sederhana untuk menghitung jumlah atom dalam sebuah senyawa kimia.
 */
public class tgs2 {
    /**
     *
     * @param args rumus kimia H2O
     */

    public static void main(String[] args) {
        String rumusKimia = "H2O";
        int jumlahAtom = hitungJumlahAtom(rumusKimia);
        System.out.println("Jumlah atom dalam " + rumusKimia + " adalah: " + jumlahAtom);
    }

    public static int hitungJumlahAtom(String rumusKimia) {
        Map<String, Integer> atomCount = new HashMap<>();
        Pattern pattern = Pattern.compile("([A-Z][a-z]*)(\\d*)");
        Matcher matcher = pattern.matcher(rumusKimia);

        while (matcher.find()) {
            String elemen = matcher.group(1);
            String countStr = matcher.group(2);
            int count = 1;
            if (!countStr.isEmpty()) {
                count = Integer.parseInt(countStr);
            }
            atomCount.put(elemen, atomCount.getOrDefault(elemen, 0) + count);
        }

        int jumlahAtom = 0;
        for (int count : atomCount.values()) {
            jumlahAtom += count;
        }

        return jumlahAtom;
    }
}

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        String[] kelimeDizisi = {"timsah", "kuğu", "kedi", "kelebek"};

        KelimeAnaliz kelimeAnaliz = new KelimeAnaliz();
        List<String> bulunanKelimeler = kelimeAnaliz.kelimeKontrolu(kelimeDizisi);

        if (bulunanKelimeler.size() == 2) {
            Set<Character> harfSeti = new HashSet<>();
            for (String kelime : bulunanKelimeler) {
                for (char harf : kelime.toCharArray()) {
                    harfSeti.add(harf);
                }
            }

            RastgeleMetin metinUretici = new RastgeleMetin();
            String rastgeleMetin = metinUretici.rastgeleMetinOlustur(harfSeti, 5); // 5 harfli bir metin
            System.out.println("Tekrar eden harf içeren kelimeler: " + bulunanKelimeler);
            System.out.println("Oluşturulan metin: " + rastgeleMetin);
        } else {
            System.out.println("Yeterli kelime bulunamadı.");
        }
    }
}

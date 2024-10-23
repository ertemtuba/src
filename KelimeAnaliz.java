import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KelimeAnaliz {

    public List<String> kelimeKontrolu(String[] kelimeDizisi) {
        List<String> bulunanKelimeler = new ArrayList<>();

        for (String kelime : kelimeDizisi) {
            if (tekrarlıHarfKontrolu(kelime)) {
                bulunanKelimeler.add(kelime);
            }
            if (bulunanKelimeler.size() == 2) {
                break;
            }
        }

        return bulunanKelimeler;
    }

    private boolean tekrarlıHarfKontrolu(String kelime) {
        Set<Character> harfSeti = new HashSet<>();
        for (char harf : kelime.toCharArray()) {
            if (harfSeti.contains(harf)) {
                return true; // Tekrar eden harf bulundu
            }
            harfSeti.add(harf);
        }
        return false; // Tekrar eden harf yok
    }
}

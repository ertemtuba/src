import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class RastgeleMetin {

    public String rastgeleMetinOlustur(Set<Character> harfSeti, int uzunluk) {
        Random random = new Random();
        StringBuilder rastgeleMetin = new StringBuilder();

        List<Character> harfListesi = new ArrayList<>(harfSeti);
        for (int i = 0; i < uzunluk; i++) {
            char rastgeleHarf = harfListesi.get(random.nextInt(harfListesi.size()));
            rastgeleMetin.append(rastgeleHarf);
        }

        return rastgeleMetin.toString();
    }
}

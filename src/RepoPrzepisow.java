public class RepoPrzepisow {
    Przepis[] zbiorPrzepisow;
    int i = 0;

    RepoPrzepisow(int rozmiar) {
        zbiorPrzepisow = new Przepis[rozmiar];
    }

    void add(Przepis przepis) {
        if (i < zbiorPrzepisow.length) {
            zbiorPrzepisow[i] = przepis;
            i++;
        }
    }

    void wyswietlPrzepisy() {
        System.out.println("***************Zbiór Przepisów***************");
        for (int i = 0; i < zbiorPrzepisow.length & zbiorPrzepisow[i] != null; i++) {
            System.out.println("----------------------------------------------");
            zbiorPrzepisow[i].wyswietlPrzepis();
        }
    }
}

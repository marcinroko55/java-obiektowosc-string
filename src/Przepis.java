public class Przepis {
    String nazwa;
    String składniki;
    int czasPrzygotowania;
    String opis;

    public Przepis(String nazwa, String składniki, int czasPrzygotowania, String opis) {
        this.nazwa = nazwa;
        this.składniki = składniki;
        this.czasPrzygotowania = czasPrzygotowania;
        this.opis = opis;
    }

    void wyswietlPrzepis() {
        System.out.println(nazwa + "\nSkładniki: " + składniki + "\nCzas przygotowania: " + czasPrzygotowania + "\nSposób przygotowania: " + opis);
    }

    void formatujOpis() {
        String[] zdania = opis.split("\\.");
        String rezultat = "";

        for (int j = 0; j < zdania.length; j++) {
            rezultat += zdania[j].strip() + ". ";
            if (j % 2 == 1) {
                rezultat += "\n";
            }
        }
        opis = rezultat + "Zachęcam do zapoznania się z innymi przepisami";
    }
}

public class Main {
    public static void main(String[] args) {
        int i = 5;
        RepoPrzepisow zbiorPrzepisow = new RepoPrzepisow(i);

        Przepis przepis1 = new Przepis("Jajecznica z bekonem", "Jajka, bekon, masło, sól, pieprz", 5, "Jajka (w całości) i oba cukry umieścić w misie miksera i ubić (końcówkami miksera do ubijania piany z białek) na najwyższych obrotach miksera do momentu uzyskania jasnej, puszystej masy, która nawet potroi swoją objętość. Mikserem planetarnym masa jajeczna powinna być ubijana od 7 – 10 minut, mikserem ręcznym od 10 – 15 minut. Masa podnoszona na mieszadle miksera powinna opadać lekko w postaci wstążki na resztę ciasta i pozostawać na jej powierzchni przez kilka dobrych sekund. Wlewać strużką olej, dalej ubijając. Następnie wlewać strużką mleko, dalej ubijając. Bezpośrednio do piany przesiać mąkę pszenną z proszkiem do pieczenia i delikatnie wymieszać z ciastem przy pomocy szpatułki.  Bla. Bla1. Bla2.");
        Przepis przepis2 = new Przepis("Herbata z cukrem i cytryną", "HErbata, cukier, cytryna, wrzątek", 2, "Zalać szklankę wrzątkiem. Bla. Bla. Bla.");

        zbiorPrzepisow.add(przepis1);
        zbiorPrzepisow.add(przepis2);

        zbiorPrzepisow.wyswietlPrzepisy();

        przepis1.formatujOpis();
        przepis2.formatujOpis();

        przepis1.wyswietlPrzepis();
        przepis2.wyswietlPrzepis();
    }
}

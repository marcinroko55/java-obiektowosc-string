public class RepoKodyPocztowe {
    KodPocztowy[] kodyPocztowe = new KodPocztowy[6];
    int i = 0;

    void add(KodPocztowy kodPocztowy) {
        if (i < kodyPocztowe.length) {
            kodyPocztowe[i] = kodPocztowy;
            i++;
        }
    }

    void isValid(KodPocztowy kodPocztowy) {
        if (kodPocztowy == null || kodPocztowy.kodPocztowy.length() != 6 || kodPocztowy.kodPocztowy.charAt(2) != '-')
            System.out.println("Kod pocztowy jest nieprawidłowy: " + kodPocztowy.kodPocztowy);
    }

    void isValidString(String kod) {
        if (kod.length() == 6 && kod.charAt(2) == '-')
            return;

        System.out.println("Kod pocztowy jest nieprawidłowy: " + kod);
    }

    void isValidTableKodPocztowy() {
        for (KodPocztowy kod : kodyPocztowe) {
            isValid(kod);
        }
    }
}




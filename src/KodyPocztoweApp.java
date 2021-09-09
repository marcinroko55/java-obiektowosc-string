public class KodyPocztoweApp {
    public static void main(String[] args) {
        RepoKodyPocztowe repoKodyPocztowe = new RepoKodyPocztowe();

        KodPocztowy kodPocztowy1 = new KodPocztowy("93-482");
        KodPocztowy kodPocztowy2 = new KodPocztowy("92-442");
        KodPocztowy kodPocztowy3 = new KodPocztowy("934-82");
        KodPocztowy kodPocztowy4 = new KodPocztowy("93-822");
        KodPocztowy kodPocztowy5 = new KodPocztowy("930-82");

        repoKodyPocztowe.add(kodPocztowy1);
        repoKodyPocztowe.add(kodPocztowy2);
        repoKodyPocztowe.add(kodPocztowy3);
        repoKodyPocztowe.add(kodPocztowy4);
        repoKodyPocztowe.add(kodPocztowy5);

        repoKodyPocztowe.isValidTableKodPocztowy();

        repoKodyPocztowe.isValid(kodPocztowy1);
        repoKodyPocztowe.isValid(kodPocztowy2);
        repoKodyPocztowe.isValid(kodPocztowy3);
        repoKodyPocztowe.isValid(kodPocztowy5);
        repoKodyPocztowe.isValid(kodPocztowy4);

        repoKodyPocztowe.isValidString("93-755");
        repoKodyPocztowe.isValidString("93-755");
        repoKodyPocztowe.isValidString("93-755");
        repoKodyPocztowe.isValidString("93-755");
        repoKodyPocztowe.isValidString("935-55");
        repoKodyPocztowe.isValidString("93-755");
        repoKodyPocztowe.isValidString("935-55");
        repoKodyPocztowe.isValidString("93-755");
        repoKodyPocztowe.isValidString("93-755");
        repoKodyPocztowe.isValidString("93-755");
        repoKodyPocztowe.isValidString("93-755");
        repoKodyPocztowe.isValidString("93-755");
    }
}

package ds2021;



public class Main {
    public static void main(String[] args) {
        Jcc jcc2021 = new Jcc(2021);

        Film film1 = new Film("Le dernier refuge", "Ousman Mali", "Mali", 86);
        film1.setNb(30);

        Film film2 = new Film("Insurrection", "Jilani Saadi", "Tunisie", 105);
        film2.setNb(45);

        jcc2021.ajoutFilm(film1);
        jcc2021.ajoutFilm(film2);

        jcc2021.listeFilmsJCC();

        
        double montantVentes = jcc2021.totalVenteBilletsJCC();

        System.out.println("Montant des ventes de billets pour les JCC " + jcc2021.annee + ": " + montantVentes + " dollars");
    }
}

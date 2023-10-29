package ds2021;



public class Jcc {
    Film[] competition;
    int annee;
    private final int NBFMAX = 30;
    int nbF;

    public Jcc(int NBFMAX) {
        competition = new Film[NBFMAX];
        this.annee = annee;
        nbF = 0;
    }

    public void ajoutFilm(Film f) {
        if (nbF < NBFMAX) {
            competition[nbF] = f;
            nbF++;
        } else {
            System.out.println("La compétition est au complet.");
        }
    }

    public void listeFilmsJCC() {
        System.out.println("Films en compétition pour les JCC " + annee + ":");
        for (int i = 0; i < nbF; i++) {
            System.out.println(competition[i].titre);
        }
    }

    public double totalVenteBilletsJCC() {
        double montantTotal = 0;
        for (int i = 0; i < nbF; i++) {
            montantTotal += competition[i].totalVenteBillets();
        }
        return montantTotal;
    }
}

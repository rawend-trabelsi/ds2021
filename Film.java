package ds2021;

import java.util.Scanner;

public class Film {
	protected String titre;
	protected String r;
	protected String Pays;
	protected int d;
	private int nb ;
	Film (String titre,String r,String Pays,int d)
	{
		this.titre=titre;
		this.r=r;
		this.Pays=Pays;
	}
	public int getNb() {
		return nb;
	}
	public void setNb(int nb) {
		this.nb = nb;
	}
	@Override
	public String toString() {
		return "Film [titre=" + titre + ", de" + r +  Pays +"( Pays_orig=)" + "-" + d
				+ "]";
	}
	public float totalVenteBillets ()
	{ 
	float tarifEtudiant = 2.0f;
    float tarifPublic = 3.0f;                                                                                                
    

    int nbPlacesEtudiant = 0;
    while (true) {
        System.out.print("Nombre de places pour étudiants : ");
        Scanner scanner = new Scanner(System.in);
        nbPlacesEtudiant = scanner.nextInt();
        if (nbPlacesEtudiant <= nb) {
            break;
        } else {
            System.out.println("Le nombre de places pour étudiants doit être inférieur ou égal au nombre de places réservées.");
        }
    }

    int nbPlacesPublic = nb - nbPlacesEtudiant;

    float montantEtudiant = nbPlacesEtudiant * tarifEtudiant;
    float montantPublic = nbPlacesPublic * tarifPublic;

    return montantEtudiant + montantPublic;
}
		
	}

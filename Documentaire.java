package ds2021;

public class Documentaire extends Film{
	String sujet;
	float tarif ;
	Documentaire(String titre, String r, String Pays, int d,String sujet ,float tarif ) {
		super(titre, r, Pays, d);
		this.sujet=sujet;
		this.tarif=tarif;
		
	}
	@Override
	public String toString() {
		return super.toString()+"Documentaire [sujet=" + sujet + ", tarif=" + tarif + "]";
	}
	
	@Override
	public float totalVenteBillets ()
	{
		super.totalVenteBillets();
		int nb=getNb();
		return nb*tarif;
		
	}
	

}

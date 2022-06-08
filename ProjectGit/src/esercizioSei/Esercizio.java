package esercizioSei;

public class Esercizio {
	
	public static final String NOME1 = "Francesco";
	public static final String COGNOME1 = "Albergo";
	public static final int ETA1 = 22;		
	public static final String NOME2 = "Mario";
	public static final String COGNOME2 = "Rossi";
	public static final int ETA2 = 21;

	public static void main(String[] args) {
		Stagista stagista1 = new Stagista(NOME1, COGNOME1, ETA1);
		Stagista stagista2 = new Stagista(NOME2, COGNOME2, ETA2);
		
		if(stagista1.minoreDi(stagista2.getEta())) {
			System.out.println("Lo stagista 1 ha eta minore");
			System.out.println(stagista1.toString());
		}else {
			System.out.println("Lo stagista 2 ha eta minore");
			System.out.println(stagista2.toString());
		}
	}

}

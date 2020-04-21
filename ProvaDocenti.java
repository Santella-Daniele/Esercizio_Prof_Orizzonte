public class ProvaDocenti
{
	public static void main(String[] args) {
		
		Professore Orizzonte = new Professore("Pasquale","Orizzonte","Informatica","C.A Dalla Chiesa","Docente di laboratorio informatica");
		Professore Tessitore = new Professore("Fabio","Tessitore","Informatica","C.A Dalla Chiesa","Docente di teoria informatica");
		
		Orizzonte.stampa();
		Tessitore.stampa();
		
	}
}
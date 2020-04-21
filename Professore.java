class Professore extends Persona {
    private String materia;
    private String scuola;
    private String ruolo;
    
    public Professore(String nome, String cognome, String materia, String scuola, String ruolo){
        super(nome,cognome);
        this.materia = materia;
        this.scuola = scuola;
        this.ruolo = ruolo;
    }
    
    public void stampa(){
        super.stampa();
        System.out.printf("Materia = %s\n", this.materia);
        System.out.printf("scuola = %s\n", this.scuola);
        System.out.printf("ruolo = %s\n", this.ruolo);
         System.out.printf("----------------------------------\n");
       
}
}
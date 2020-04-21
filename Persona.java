class Persona {
    private String cognome;
    private String nome;

    
    public Persona (String nome, String cognome){
        this.cognome = nome;
        this.nome = cognome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
   public void setCognome(String cognome){
        this.cognome = cognome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getCognome(){
        return this.cognome;
    }
    

    public void stampa(){
        System.out.printf("Nome = %s, cognome = %s\n",this.nome, this.cognome);
    
    
}

}


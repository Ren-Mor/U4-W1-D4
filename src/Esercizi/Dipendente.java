package Esercizi;

public abstract class Dipendente {

    // Dichiaro attributi del Dipendente
    private final String matricola;
    private double stipendio;
    private Dipartimento dipartimento;

    // Scrivo il costruttore del Dipendente
    public Dipendente(String matricola, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    // Creazione dei getter

    public String getMatricola() {
        return matricola;
    }


    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    // Creazione setter

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    // Metodo abstract da implementare per ogni "miniclasse"
    public abstract int calcoloStipendio();

    // Implementazione metodo CheckIn
    @Override
    public void checkin(){
        System.out.println("Dipendente matricola: " + matricola + "inizia turno");
    }
}

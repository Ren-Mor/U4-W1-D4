package Esercizi;

public class Dirigente extends Dipendente{
    public int stipendio;

    public Dirigente(String matricola, Dipartimento dipartimento, int stipendio){
        super(matricola, dipartimento);
        this.stipendio = stipendio;
    }

    @Override
    public int calcoloStipendio(){
        return stipendio;
    }
}

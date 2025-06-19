package Esercizi;

public class DipendentePartTime extends Dipendente {
    private int pagaOre;
    private int oreLavoro;


    public DipendentePartTime(String matricola, Dipartimento dipartimento, int pagaOre, int oreLavoro){
        super(matricola, dipartimento );
        this.pagaOre = pagaOre;
        this.oreLavoro = oreLavoro;

    }

    @Override
    public int calcoloStipendio(){
        return pagaOre * oreLavoro;
    }
}

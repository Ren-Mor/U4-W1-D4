package Esercizi;

public class Main {
    public static void main(String[] args) {

        // Creo tre dipendenti con i loro attributi
        Dipendente Alessia = new Dirigente("01 Dirigente", Dipartimento.Amministrazione, 2500);
        Dipendente Gianni = new DipendenteFullTime("02 Full Time", Dipartimento.Produzione, 2000);
        Dipendente Sara = new DipendentePartTime("03 Tirocinante", Dipartimento.Vendite, 8, 70);

        // Inserisco i dipendenti in un array
        Dipendente[] dipendenti = {Alessia, Gianni, Sara};

        int totStipendi = 0;

        for (Dipendente schiavo : dipendenti){
            int paga = schiavo.calcoloStipendio();
            totStipendi += paga;
            System.out.println("Matricola: " + schiavo.getMatricola() + " - Stipendio: " + paga);
        }

        System.out.println("Totale stipendi: " + totStipendi);

        }
    }

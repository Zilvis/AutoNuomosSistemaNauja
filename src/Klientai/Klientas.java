package Klientai;

import AutoParkas.Automobilis;

import java.util.ArrayList;

public class Klientas {
    private String vardas;
    private String pavarde;
    private int id = 0;
    private static int idSkaiciuokle;
    private ArrayList<Automobilis> isnuomuotiAutomobiliai = new ArrayList<>();

    public Klientas(String vardas, String pavarde) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        id = idSkaiciuokle++;
        KlientuSarasas.klientuSarasas.add(this);
    }

    public int getId() {
        return id;
    }

    public ArrayList<Automobilis> getIsnuomuotiAutomobiliai() {
        return isnuomuotiAutomobiliai;
    }

    @Override
    public String toString() {
        return "Klientas{" +
                "vardas='" + vardas + '\'' +
                ", pavarde='" + pavarde + '\'' +
                ", id=" + id +
                ", isnuomuotiAutomobiliai=" + isnuomuotiAutomobiliai +
                '}';
    }
}

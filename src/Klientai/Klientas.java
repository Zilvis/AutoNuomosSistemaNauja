package Klientai;

import AutoParkas.Automobilis;

import java.util.*;

public class Klientas {
    private String vardas;
    private String pavarde;
    private int id = 0;
    private int nuomosLaikas;
    private static int idSkaiciuokle;
    private ArrayList<Automobilis> isnuomuotiAutomobiliai = new ArrayList<>();
    private ArrayList<Automobilis> paskutinisNuomuotas = new ArrayList<>();

    public Klientas(String vardas, String pavarde) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        id = idSkaiciuokle++;
        KlientuSarasas.klientuSarasas.add(this);
    }

    public void setPaskutinisNuomuotasAutomobilis(Automobilis auto){
        paskutinisNuomuotas.clear();
        paskutinisNuomuotas.add(auto);
        nuomosLaikas = new Random().nextInt(1,10);
    }
    public int getId() {
        return id;
    }

    public ArrayList<Automobilis> getIsnuomuotiAutomobiliai() {
        return isnuomuotiAutomobiliai;
    }

    @Override
    public String toString() {
        return "Klientas: "+ id
                + " " +vardas
                + " " +pavarde
                + " Isnuomuoti auto: " +isnuomuotiAutomobiliai
                + " | Paskutinis isnuomuotas: " +paskutinisNuomuotas
                + "Laikas: "+nuomosLaikas;
    }
}

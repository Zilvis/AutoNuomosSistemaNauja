package Klientai;

import java.util.ArrayList;

public class KlientuSarasas {
    public static ArrayList<Klientas> klientuSarasas;

    public KlientuSarasas() {
        klientuSarasas = new ArrayList<>();
    }

    public void istrintiKlienta(int id) {
        for (int i = 0; i < klientuSarasas.size(); i++){
            if (klientuSarasas.get(i).getId() == id){
                klientuSarasas.remove(i);
            }
        }
    }

    /**
     * Spauzdina sarasa pries tai patikrines ar jis netuscias
     */
    public void spauzdintiKlientuSarasa() {
        if (klientuSarasas.isEmpty()) {
            System.out.println("Sarasas tuscias !");
        } else {
            for (Klientas klientas : klientuSarasas) {
                System.out.println(klientas);
            }
        }
    }

    public static ArrayList<Klientas> getKlientuSarasas() {
        return klientuSarasas;
    }
}

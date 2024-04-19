package AutoParkas;

import Klientai.Klientas;
import Klientai.KlientuSarasas;

import java.util.ArrayList;

public class AutoParkas {
    public static ArrayList<Automobilis> autoParkas;

    public AutoParkas() {
        autoParkas = new ArrayList<>();
    }

    public void isnuomuotiAutomobili(int klientoId, int masinosId){
        for (int i = 0; i < autoParkas.size(); i++) {
            if (autoParkas.get(i).getId() == masinosId){
                KlientuSarasas.klientuSarasas.get(klientoId).getIsnuomuotiAutomobiliai().add(autoParkas.get(i));
                autoParkas.remove(i);
            }
        }
    }

    /**
     * Pradzioj tikrinu klienta pagal id
     * Tada einu per jo isnuomuotus auto ir tikrinu juos pagal masinos id
     * Radus masina pagal id ikeliu objekta i auto parka
     * Pridedame masina i paskutiu naudotu sarasa
     * Galiausiai istrinu is kliento isnuomuotu automobiliu!
     * @param klientoId
     * @param masinosId
     */
    public void grazintiAutomobili(int klientoId, int masinosId){
        for (int i = 0; i < KlientuSarasas.klientuSarasas.size(); i++) {
            if (KlientuSarasas.klientuSarasas.get(i).getId() == klientoId){
                for (int b = 0; b < KlientuSarasas.klientuSarasas.get(i).getIsnuomuotiAutomobiliai().size(); b++){
                    if (KlientuSarasas.klientuSarasas.get(i).getIsnuomuotiAutomobiliai().get(b).getId() == masinosId){
                        KlientuSarasas.klientuSarasas.get(klientoId).setPaskutinisNuomuotasAutomobilis(
                                KlientuSarasas.klientuSarasas.get(i).getIsnuomuotiAutomobiliai().get(b));
                        autoParkas.add(KlientuSarasas.klientuSarasas.get(i).getIsnuomuotiAutomobiliai().get(b));
                        KlientuSarasas.klientuSarasas.get(klientoId).getIsnuomuotiAutomobiliai().remove(b);


                    }
                }
            }
        }
    }

    public void atsuktiRida (int masinosId, int naujaRida){
        for (int i = 0; i < autoParkas.size(); i++){
            if (autoParkas.get(i).getId() == masinosId){
                autoParkas.get(i).setRida(naujaRida);
            }
        }
    }

    public void istrintiAuto(int id) {

        for (int i = 0; i < autoParkas.size(); i++){
            if (autoParkas.get(i).getId() == id){
                autoParkas.remove(i);
            }
        }
    }

    public ArrayList<Automobilis> getAutoParkas() {
        return autoParkas;
    }

    /**
     * Spauzdina sarasa pries tai patikrines ar jis netuscias
     */
    public void spauzdintiAutoParkoSarasa() {
        if (autoParkas.isEmpty()) {
            System.out.println("Sarasas tuscias !");
        } else {
            for (Automobilis auto : autoParkas) {
                System.out.println(auto);
            }
        }
    }
}

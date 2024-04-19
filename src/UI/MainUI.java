package UI;

import AutoParkas.AutoParkas;
import AutoParkas.Automobilis;
import Klientai.Klientas;
import Klientai.KlientuSarasas;

import java.util.Scanner;

public class MainUI {
    private boolean aktyvus = true;
    private String pasirinkimas;
    private AutoParkas autoParkas;
    private KlientuSarasas klientuSarasas;
    private final Scanner scanner = new Scanner(System.in);

    public MainUI() {
        autoParkas = new AutoParkas();
        klientuSarasas = new KlientuSarasas();

        // DUMMY DATA
        new Automobilis("Tesla","90",2005);
        new Automobilis("Volkswagen","Golf",1990);
        new Automobilis("Toyota","prius",2019);
        new Automobilis("Tesla","90",2005);
        new Automobilis("Volkswagen","Golf",1990);
        new Automobilis("Toyota","prius",2019);
        new Automobilis("Tesla","90",2005);
        new Automobilis("Volkswagen","Golf",1990);
        new Automobilis("Toyota","prius",2019);
        new Automobilis("Tesla","90",2005);
        new Automobilis("Volkswagen","Golf",1990);
        new Automobilis("Toyota","prius",2019);
        new Automobilis("Tesla","90",2005);
        new Automobilis("Volkswagen","Golf",1990);
        new Automobilis("Toyota","prius",2019);


        new Klientas("Jonas","Jonas1");
        new Klientas("Tomas","Jonas2");
        new Klientas("Domas","Jonas3");
        //
    }

    public void menu (){
        aktyvus = true;

        while (aktyvus){
            System.out.println("1. Klientu valdymas");
            System.out.println("2. Autoparko valdymas");
            System.out.println("3. Iseiti");
            pasirinkimas = scanner.nextLine();

            switch (pasirinkimas){
                case "1":
                    klientuValdymas();
                    aktyvus = false;
                    break;
                case "2":
                    autoValdymas();
                    aktyvus = false;
                    break;
                case "3":
                    aktyvus = false;
                    break;
                default:
                    System.out.println("Nepavyko pasirinkti");
                    break;
            }
        }
    }

    private void klientuValdymas(){

        while (aktyvus){
            System.out.println("\n1. Sukurti nauja klienta");
            System.out.println("2. Istrinti esama");
            System.out.println("3. Klientu sarasas");
            System.out.println("4. Isnuomuoti automobili");
            System.out.println("5. Grazinti automobili");
            System.out.println("6. Gryzti atgal");
            System.out.println("7. Iseiti");
            pasirinkimas = scanner.nextLine();

            switch (pasirinkimas){
                case "1":
                    System.out.println("Iveskite varda:");
                    String vardas = scanner.nextLine();
                    System.out.println("Iveskite pavarde:");
                    String pavarde = scanner.nextLine();
                    new Klientas(vardas,pavarde);

                    aktyvus = true;
                    break;
                case "2":
                    klientuSarasas.spauzdintiKlientuSarasa();
                    System.out.println("\nIveskite kliento ID kuri norite istrinti: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    klientuSarasas.istrintiKlienta(id);
                    aktyvus = true;
                    break;
                case "3":
                    klientuSarasas.spauzdintiKlientuSarasa();
                    aktyvus = true;
                    break;
                case "4":
                    klientuSarasas.spauzdintiKlientuSarasa();
                    System.out.println("\nIveskite kliento ID:");
                    int kid = Integer.parseInt(scanner.nextLine());

                    autoParkas.spauzdintiAutoParkoSarasa();
                    System.out.println("\nIveskite masinos ID:");
                    int mid = Integer.parseInt(scanner.nextLine());

                    autoParkas.isnuomuotiAutomobili(kid, mid);
                    aktyvus = true;
                    break;
                case "5":
                    klientuSarasas.spauzdintiKlientuSarasa();
                    System.out.println("\nIveskite kliento ID:");
                    int k1id = Integer.parseInt(scanner.nextLine());

                    System.out.println(KlientuSarasas.klientuSarasas.get(k1id).getIsnuomuotiAutomobiliai());
                    System.out.println("\nIveskite masinos ID:");
                    int m1id = Integer.parseInt(scanner.nextLine());

                    autoParkas.grazintiAutomobili(k1id,m1id);
                    break;
                case "6":
                    menu();
                    aktyvus = false;
                    break;
                case "7":
                    aktyvus = false;
                    break;
                default:
                    System.out.println("Klaida!");
                    break;
            }
        }
    }

    private void autoValdymas(){

        while (aktyvus){
            System.out.println("\n1. Sukurti nauja auto");
            System.out.println("2. Istrinti esama");
            System.out.println("3. AutoParko sarasas");
            System.out.println("4. Gryzti atgal");
            System.out.println("5. Iseiti");
            pasirinkimas = scanner.nextLine();

            switch (pasirinkimas){
                case "1":
                    // TODO Patikra del ivesties !
                    System.out.println("Iveskite gamintoja:");
                    String gamintojas = scanner.nextLine();
                    System.out.println("Iveskite modeli:");
                    String modelis = scanner.nextLine();
                    System.out.println("Iveskite metus:");
                    int metai = Integer.parseInt(scanner.nextLine());
                    new Automobilis(gamintojas,modelis,metai);

                    autoParkas.spauzdintiAutoParkoSarasa();
                    aktyvus = true;
                    break;
                case "2":
                    autoParkas.spauzdintiAutoParkoSarasa();
                    System.out.println("\nIveskite masinos ID kuria norite pasalinti is auto parko: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    autoParkas.istrintiAuto(id);
                    aktyvus = true;
                case "3":
                    autoParkas.spauzdintiAutoParkoSarasa();
                    aktyvus = true;
                    break;
                case "4":
                    aktyvus = false;
                    menu();
                    break;
                case "5":
                    aktyvus = false;
                    break;
                default:
                    System.out.println("Klaida");
                    break;
            }
        }
    }
}


























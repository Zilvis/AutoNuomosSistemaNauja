package AutoParkas;

import java.util.Random;

public class Automobilis {
    private String modelis;
    private String marke;
    private int metai;
    private int id = 0;
    private int rida;
    private static int idSkaiciuokle;

    public Automobilis(String modelis, String marke, int metai) {
        this.modelis = modelis;
        this.marke = marke;
        this.metai = metai;
        id = idSkaiciuokle++;
        AutoParkas.autoParkas.add(this);
        rida = new Random().nextInt(1,150000);
    }

    public int getId() {
        return id;
    }

    public void setRida(int rida) {
        this.rida = rida;
    }

    @Override
    public String toString() {
        return "ID: "+id+" | "+modelis+ " | " +marke+ " | metai " + metai+ " | rida " +rida;
    }
}

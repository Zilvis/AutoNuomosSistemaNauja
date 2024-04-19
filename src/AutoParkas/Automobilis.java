package AutoParkas;

public class Automobilis {
    private String modelis;
    private String marke;
    private int metai;
    private int id = 0;
    private static int idSkaiciuokle;

    public Automobilis(String modelis, String marke, int metai) {
        this.modelis = modelis;
        this.marke = marke;
        this.metai = metai;
        id = idSkaiciuokle++;
        AutoParkas.autoParkas.add(this);
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Automobilis{" +
                "modelis='" + modelis + '\'' +
                ", marke='" + marke + '\'' +
                ", metai=" + metai +
                ", id=" + id +
                '}';
    }
}

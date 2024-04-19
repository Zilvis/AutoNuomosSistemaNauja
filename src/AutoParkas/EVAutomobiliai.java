package AutoParkas;

public class EVAutomobiliai extends Automobilis{
    private int krovimosiLaikas;

    public EVAutomobiliai(String modelis, String marke, int metai, int krovimosiLaikas) {
        super(modelis, marke, metai);
        this.krovimosiLaikas = krovimosiLaikas;
    }

    public int getKrovimosiLaikas() {
        return krovimosiLaikas;
    }

    @Override
    public String toString() {
        return super.toString()+ " | krovimosi laikas: " + krovimosiLaikas;
    }
}

package AutoParkas;

public class NaftosAutomobiliai extends Automobilis{
    private int kuroSanaudos;

    public NaftosAutomobiliai(String modelis, String marke, int metai, int kuroSanaudos) {
        super(modelis, marke, metai);
        this.kuroSanaudos = kuroSanaudos;
    }

    public int getKuroSanaudos() {
        return kuroSanaudos;
    }

    @Override
    public String toString() {
        return super.toString()+ " | kuro sanaudos: " +kuroSanaudos+ " 100km";
    }
}

public class Gasto {
    private String concepto;
    private float importe;

    public Gasto(String concepto, float importe) {
        this.concepto = concepto;
        this.importe = importe;
    }

    public float getImporte() {
        return importe;
    }

    @Override
    public String toString() {
        return "Gasto{" +
                "concepto='" + concepto + '\'' +
                ", importe=" + importe +
                '}';
    }
}

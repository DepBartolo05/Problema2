import java.util.ArrayList;

public class LibroCuentas {
    private ArrayList<Gasto> gastos = new ArrayList<>();

    public void anadirGasto(Gasto gasto) {
        gastos.add(gasto);
    }

    public Gasto eliminarGasto() {
        return gastos.remove(0);
    }

    public int size() {
        return gastos.size();
    }
    @Override
    public String toString() {
        return "LibroCuentas{" +
                "gastos=" + gastos +
                '}';
    }
}

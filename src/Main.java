import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        int opcion = 0;
        Gasto gasto = null;
        LibroCuentas libroDeCuentas = new LibroCuentas();
        String concepto = "";
        float importe = 0;
        float sumaGastos = 0;


        while (!salir) {

            System.out.println("Seleccione una opción: \n");
            System.out.println("\t1. \t Añadir un gasto.");
            System.out.println("\t2. \t Ver lista de gastos.");
            System.out.println("\t3. \t Calcular gasto total.");
            System.out.println("\t4. \t Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.print("Concepto del gasto: ");
                    concepto = scanner.nextLine();
                    System.out.print("Importe del gasto: ");
                    importe = scanner.nextFloat();
                    scanner.nextLine();

                    gasto = new Gasto(concepto, importe);
                    libroDeCuentas.anadirGasto(gasto);

                    System.out.println("Gasto: " + concepto + " " + importe + " añadido a la lista");
                    break;
                case 2:
                    System.out.println(libroDeCuentas);
                    break;
                case 3:
                    int tamanoLibroCuentas = libroDeCuentas.size();
                    for (int i = 0; i < tamanoLibroCuentas; i++) {
                        sumaGastos += libroDeCuentas.eliminarGasto().getImporte();
                    }
                    System.out.println("Gasto total= " + sumaGastos);
                    break;
                case 4:
                    salir = true;
                    break;

            }
        }
    }
}

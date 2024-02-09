package cuentas;

/**
 * Clase principal que contiene el método main para probar la funcionalidad de
 * la clase CCuenta.
 *
 * @author Jesús Manuel Penas García
 */
public class Main {

    /**
     * Método principal que crea una instancia de la clase CCuenta, realiza
     * operaciones sobre ella y muestra el saldo resultante.
     *
     * @param args Argumentos de línea de comandos (no utilizado en este caso).
     */
    public static void main(String[] args) {
        // Crear una instancia de la clase CCuenta
        CCuenta cuenta1;

        // Llamar al método operativa_cuenta para realizar operaciones en la cuenta
        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        operativa_cuenta(cuenta1, null);
    }

    /**
     * Realiza operaciones de prueba en una cuenta y muestra el saldo
     * resultante.
     *
     * @param cuenta1 Instancia de la clase CCuenta en la que se realizarán las
     * operaciones.
     * @param cantidad Cantidad a retirar o ingresar en la cuenta (puede ser
     * null si no se especifica).
     */
    private static void operativa_cuenta(CCuenta cuenta1, java.lang.Float cantidad) {
        double saldoActual;

        // Obtener el saldo actual de la cuenta
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es" + saldoActual);

        try {
            // Intentar retirar una cantidad de la cuenta
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            // Intentar ingresar una cantidad en la cuenta
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}

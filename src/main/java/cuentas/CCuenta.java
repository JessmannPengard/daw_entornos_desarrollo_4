package cuentas;

/**
 * Clase que representa una cuenta bancaria básica.
 *
 * @author Jesús Manuel Penas García
 */
public class CCuenta {

    /** Nombre del titular de la cuenta. */
    private String nombre;

    /** Número de cuenta. */
    private String cuenta;

    /** Saldo actual de la cuenta. */
    private double saldo;

    /** Tipo de interés de la cuenta. */
    private double tipoInterés;

    /**
     * Constructor por defecto. No inicializa ningún atributo.
     */
    public CCuenta() {
    }

    /**
     * Constructor que inicializa los atributos de la cuenta con los valores
     * proporcionados.
     *
     * @param nom Nombre del titular de la cuenta.
     * @param cue Número de cuenta.
     * @param sal Saldo inicial de la cuenta.
     * @param tipo Tipo de interés de la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * Obtiene el estado actual de la cuenta, es decir, el saldo actual.
     *
     * @return Saldo actual de la cuenta.
     */
    public double estado() {
        return getSaldo();
    }

    /**
     * Realiza un ingreso en la cuenta. La cantidad debe ser positiva; de lo
     * contrario, lanza una excepción.
     *
     * @param cantidad Cantidad a ingresar en la cuenta.
     * @throws Exception Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Realiza una retirada de dinero de la cuenta. La cantidad debe ser
     * positiva y no puede superar el saldo actual; de lo contrario, lanza una
     * excepción.
     *
     * @param cantidad Cantidad a retirar de la cuenta.
     * @throws Exception Si la cantidad es negativa o supera el saldo actual.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Obtiene el nombre del titular de la cuenta.
     *
     * @return Nombre del titular de la cuenta.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del titular de la cuenta.
     *
     * @param nombre Nuevo nombre del titular de la cuenta.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de cuenta.
     *
     * @return Número de cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el número de cuenta.
     *
     * @param cuenta Nuevo número de cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     *
     * @return Saldo actual de la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo actual de la cuenta.
     *
     * @param saldo Nuevo saldo de la cuenta.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene el tipo de interés de la cuenta.
     *
     * @return Tipo de interés de la cuenta.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Establece el tipo de interés de la cuenta.
     *
     * @param tipoInterés Nuevo tipo de interés de la cuenta.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}

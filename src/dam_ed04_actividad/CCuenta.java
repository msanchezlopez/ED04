/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dam_ed04_actividad;

/**
 *
 * @author miguel
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor sin parámetros
     */
    public CCuenta()
    {
    }

    /**
     * Constructor con todos los parámetros
     * 
     * @param nom Nombre del cliente de la cuenta
     * @param cue Número de cuenta del cliente
     * @param sal Saldo actual del cliente
     * @param tipo Tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Método para asignar el nombre del cliente
     * 
     * @param nom Nombre del cliente
     */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }

    /**
     * Método para obtener el nombre del cliente
     *
     * @return String Nombre del cliente
     */
    public String obtenerNombre()
    {
        return getNombre();
    }

    /**
     * Método para obtener el saldo disponible
     *
     * @return Double Saldo actual
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Método para realizar ingresos
     *
     * @param cantidad Cantidad a ingresar
     * @throws Exception Controlamos que no se introduzcan cantidades negativas
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método para retirar dinero de la cuenta
     *
     * @param cantidad Cantidad a retirar
     * @throws Exception Comprobamos que la cantida no sea igual o inferior a cero
     * ni sean superiores al saldo actual
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Método para obtener el número de cuenta
     *
     * @return String Número de cuenta
     */
    public String obtenerCuenta()
    {
        return getCuenta();
    }

    /**
     * Método para obtener el nombre del cliente
     *
     * @return String Nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para establecer el nombre del cliente
     *
     * @param nombre Nombre del cliente
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener el tipo de interés
     *
     * @return Double Tipo de interés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Método para establecer el tipo de interés
     *
     * @param tipoInterés Tipo de interés
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Método para obtener el número de cuenta
     * 
     * @return String Número de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Método para establecer el número de cuenta
     * 
     * @param cuenta Número de cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Método para obtener el saldo actual
     * 
     * @return Double Saldo actual
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método para establecer el saldo
     * 
     * @param saldo Saldo a establecer
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

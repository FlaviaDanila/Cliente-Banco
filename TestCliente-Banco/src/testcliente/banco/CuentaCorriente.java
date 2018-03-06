
package testcliente.banco;

/**
 *
 * @author Yaki's
 */

public class CuentaCorriente {

    private Cliente titular;
    private int nroCuenta;
    private double saldo;
    
    public void CuentaCorriente(Cliente titular, int nroCuenta, double saldo) {
        
    }

    
    
    public Cliente getTitular() {
        return this.titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public int getNroCuenta() {
        return this.nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    
}

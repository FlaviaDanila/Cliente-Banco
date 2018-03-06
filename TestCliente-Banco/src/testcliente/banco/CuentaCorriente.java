
package testcliente.banco;

//import java.util.List;

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

    public void CuentaCorriente(Cliente titular, int nroCuenta) {
        
    }
        
    public double depositar (double monto) {
        saldo = saldo + monto;
        return saldo;
    }
    
    public double extraer (double monto) {
        saldo = saldo - monto;
        return saldo;
    }
    
        @Override
    public String toString() {
        return "Titular: "+ this.titular.toString() + "Cuenta Nro: " + this.nroCuenta + "Saldo: " + this.saldo;
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


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

    public void CuentaCorriente(Cliente titular, int nroCuenta) {
        
    }
        
    public double depositar (double monto) {
        saldo = saldo + monto;
        System.out.println("Su Saldo Actual es: ");
        return this.saldo;
    }
    
    public double extraer (double monto) {
        if (saldo < monto) {
            saldo = 0;
            System.out.println("Saldo Insuficiente para Extracción");
            return this.saldo;
        } else {
            System.out.println("Su Saldo Actual es: ");
            return this.saldo - monto;
        }
    }
    
        @Override
    public String toString() {
        return "Titular: "+ this.titular.toString() + "Cuenta Nro: " + this.nroCuenta + "Saldo: " + this.saldo;
    }
    
        @Override
    public boolean equals(Object cuenta) {
        if (cuenta == null || (cuenta instanceof CuentaCorriente)) {
            return false;
        }
        CuentaCorriente otraCuenta = (CuentaCorriente) cuenta;
        if (otraCuenta.getNroCuenta() == this.nroCuenta) {
            return true;
        }
        else{
            return false;
        }
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

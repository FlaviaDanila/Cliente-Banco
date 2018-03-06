
package testcliente.banco;

/**
 *
 * @author Yaki's
 */

public class CuentaAhorro extends CuentaCorriente {
    
    private double interes = 2.5;
    
    public CuentaAhorro(Cliente titular, int nroCuenta, double saldo, double interes) {
        super(titular, nroCuenta, saldo);
        this.interes = interes;
    }
    
    public CuentaAhorro() {
        
    }
    
    public CuentaAhorro() {
        
    }
    
    public void calcularInteres() {
        
    }
    
    public void calcularInteres(double intere) {
        
    }
    
    public double getInteres() {
        return this.interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }
    
}

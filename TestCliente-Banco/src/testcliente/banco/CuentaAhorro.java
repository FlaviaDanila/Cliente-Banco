
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
    
    public CuentaAhorro(Cliente titular, int nroCuenta, double interes) {
        super(titular, nroCuenta);
        this.interes = interes;
    }
    
    public CuentaAhorro(Cliente titular, int nroCuenta) {
        super(titular, nroCuenta);
    }
    
    public void calcularInteres() {
        
    }
    
    public void calcularInteres(double interes) {
        
    }
    
    public double getInteres() {
        return this.interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }
    
}

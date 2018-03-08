
package testcliente.banco;

/**
 *
 * @author Yaki's
 */

public class TestClienteBanco {

    
    public static void main(String[] args) {
                
        //Crear Clientes
        Cliente c1 = new Cliente();
        c1.setApellido("Yakimiuk");
        c1.setNombre("Flavia");
        c1.setEdad(34);
        Cliente c2 = new Cliente();
        c2.setApellido("Gosparini");
        c2.setNombre("Celeste");
        c2.setEdad(26);
        
        //Crear Cuentas Corrientes
        CuentaCorriente cc1 = new CuentaCorriente(c1, 508715);
        CuentaCorriente cc2 = new CuentaCorriente(c2, 504912, 5637.96);
        
        //Crear Cajas de Ahorro
        CuentaAhorro ca1 = new CuentaAhorro(c1, 5578);
        CuentaAhorro ca2 = new CuentaAhorro(c2, 5543, 0.7);
        CuentaAhorro ca3 = new CuentaAhorro(c1, 5543, 345.24, 1.2);
        
        
        //Imprimir datos
        System.out.println("DATOS CUENTAS CORRIENTES");
        System.out.println(cc1.toString());
        System.out.println(cc2.toString());
        System.out.println("-----------------------");
        System.out.println("DATOS CAJAS DE AHORRO");
        System.out.println(ca1.toString());
        System.out.println(ca2.toString());
        System.out.println(ca3.toString());
        
        //Comparar Cuentas
        System.out.println("Comparación de Nros de Cuenta");
        System.out.println("CC1 vs. CC2");
        if (cc1.equals(cc2)) {
            System.out.println("Nros de Cuenta IGUALES");
        } else {
            System.out.println("Nros de Cuenta DISTINTOS");

        }

        System.out.println("CA1 vs. CA2");
        if (ca1.equals(ca2)) {
            System.out.println("Nros de Cuenta IGUALES");
        } else {
            System.out.println("Nros de Cuenta DISTINTOS");
        }

        System.out.println("CA2 vs. CA3");
        if (ca2.equals(ca3)) {
            System.out.println("Nros de Cuenta IGUALES");

        } else {
            System.out.println("Nros de Cuenta DISTINTOS");

        }

        System.out.println("CA1 vs. CA3");
        if (ca1.equals(ca3)) { 
            System.out.println("Nros de Cuenta IGUALES");

        } else {
            System.out.println("Nros de Cuenta DISTINTOS");
        }
        
        //Crear Caja de Ahorro con los mismos valores que una anterior y compararlas
        CuentaAhorro ca4 = new CuentaAhorro(c1, 5578);
 
        System.out.println("CA1 vs. CA4");
        if (ca1.equals(ca4)) { 
            System.out.println("Nros de Cuenta IGUALES");

        } else {
            System.out.println("Nros de Cuenta DISTINTOS");
        }
        
        
        //Calcular nuevo saldo en una Caja de Ahorro y aplicar 15.5 de interes
        
        
        
    } 
    
}

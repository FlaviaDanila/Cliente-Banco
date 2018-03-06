
package testcliente.banco;

import java.util.Scanner;

/**
 *
 * @author Yaki's
 */

public class TestClienteBanco {

    
    public static void main(String[] args) {
        
        Scanner data = new Scanner(System.in);
        
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
        CuentaCorriente cc1 = new CuentaCorriente(c1, 6000-5087);
        CuentaCorriente cc2 = new CuentaCorriente(c2, 6003-5549, 5637.96);
        
        //Crear Cajas de Ahorro
        CuentaAhorro ca1 = new CuentaAhorro()
        
        
        //Imprimir datos
        System.out.println("DATOS CUENTAS CORRIENTES");
        System.out.println(cc1.toString());
        System.out.println(cc2.toString());
        
        
        
    } 
    
}

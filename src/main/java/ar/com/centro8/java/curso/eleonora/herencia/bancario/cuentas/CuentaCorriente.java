package ar.com.centro8.java.curso.eleonora.herencia.bancario.cuentas;

import ar.com.centro8.java.curso.eleonora.herencia.bancario.clientes.Cliente;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter 
@Setter 
@ToString(callSuper = true)
public class CuentaCorriente extends Cuenta {
    private float montoGiroDescubierto;

    public CuentaCorriente(String numeroCuenta, Cliente clienteAsociado, float saldo, float montoGiroDescubierto) {
        super(numeroCuenta, clienteAsociado, saldo);
        this.montoGiroDescubierto = montoGiroDescubierto;
    }

    public void depositarCheque(Cheque cheque){
        float montoCheque = cheque.getMonto();
        if (montoCheque >0)
        setSaldo(getSaldo() + montoCheque);
        else System.out.println("No se pueden depositar cheques en negativo");
       
    }
    
    @Override 
    public void extraerEfectivo(float monto){ 
    if (monto <= getSaldo()) setSaldo(getSaldo() - monto);  
    else if (monto <= getSaldo() + montoGiroDescubierto) {
        setSaldo(getSaldo() - monto);
        System.out.println("Usted esta usando su giro al descubierto");
    }
    else System.out.println("No se puede extraer mas del saldo y el descubierto existente"); 
}


}

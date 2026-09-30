package ar.com.centro8.java.curso.eleonora.herencia.bancario.cuentas;

import ar.com.centro8.java.curso.eleonora.herencia.bancario.clientes.Cliente;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter 
@Setter 
@ToString(callSuper = true)
public class CajaAhorro extends Cuenta{
    private float tasaInteres;

    public CajaAhorro(String numeroCuenta, Cliente clienteAsociado, float saldo, float tasaInteres) {
        super(numeroCuenta, clienteAsociado, saldo);
        this.tasaInteres = tasaInteres;
    }

    @Override 
    public void extraerEfectivo(float monto){
        if (monto <= getSaldo()){   
            setSaldo(getSaldo() - monto);
            System.out.println("Puede extraer el monto solicitado");
        }
        else System.out.println("No puede extraer mas del monto existente"); 
    }

    public void cobrarInteres(){
        float interes = getSaldo() * tasaInteres / 100;
        setSaldo(getSaldo() + interes);
    }

}

package ar.com.centro8.java.curso.eleonora.herencia.bancario;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter 
@Setter 
@ToString 
@AllArgsConstructor 
public abstract class Cuenta {
    private String numeroCuenta;
    private Cliente clienteAsociado;
    private float saldo;

    public void  depositarEfectivo(float monto){
        if (monto >0) this.saldo +=monto;
        else System.out.println("No se púede depositar montos en negativo");

    }

    public abstract void extraerEfectivo(float monto);
    


}

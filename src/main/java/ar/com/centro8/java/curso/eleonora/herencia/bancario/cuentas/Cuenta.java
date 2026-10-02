package ar.com.centro8.java.curso.eleonora.herencia.bancario.cuentas;

import ar.com.centro8.java.curso.eleonora.herencia.bancario.clientes.Cliente;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public abstract class Cuenta {
    private final String numeroCuenta;
    private final Cliente clienteAsociado;

    @Setter(AccessLevel.PROTECTED)
    private float saldo;

    public void depositarEfectivo(float monto) {
        if (monto > 0)
            this.saldo += monto;
        else
            System.out.println("No se puede depositar montos en negativo");

    }

    public abstract void extraerEfectivo(float monto);

}

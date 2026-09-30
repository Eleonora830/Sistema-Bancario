package ar.com.centro8.java.curso.eleonora.herencia.bancario.cuentas;


import ar.com.centro8.java.curso.eleonora.herencia.bancario.clientes.Cliente;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter 
@Setter 
@ToString(callSuper = true)
public class CuentaConvertibilidad extends CuentaCorriente {
    private float saldoDolares;


    public CuentaConvertibilidad(String numeroCuenta, Cliente clienteAsociado, float saldo, float montoGiroDescubierto,
            float saldoDolares) {
        super(numeroCuenta, clienteAsociado, saldo, montoGiroDescubierto);
        this.saldoDolares = saldoDolares;
    }

    public void depositarDolares(float monto){
        if (monto >0) saldoDolares += monto;
        else System.out.println("No se puede depositar montos en negativo"); 
            
    }

    public void extraerDolares(float monto){
        if (monto <= saldoDolares) saldoDolares -= monto;
        else System.out.println("No se puede extraer mas del saldo existente ni usar griro descubierto");
    }  

    public void convertirPesoADolar(float monto, float tasa) {
    if (monto > 0 && monto <= getSaldo() && tasa > 0) {
        setSaldo(getSaldo() - monto);
        saldoDolares = saldoDolares + (monto / tasa);
    } else
        System.out.println("No se puede realizar esta operacion");
}

    public void convertirDolarAPeso(float monto, float tasa) {
    if (monto > 0 && monto <= saldoDolares && tasa > 0) {
        saldoDolares -= monto;
        setSaldo(getSaldo() + monto * tasa);
    } else
        System.out.println("No se puede realizar esta opercion");
}
  
    
}


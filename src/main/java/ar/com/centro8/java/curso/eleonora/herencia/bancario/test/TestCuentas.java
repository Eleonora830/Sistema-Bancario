package ar.com.centro8.java.curso.eleonora.herencia.bancario.test;

import java.time.LocalDate;

import ar.com.centro8.java.curso.eleonora.herencia.bancario.clientes.ClienteEmpresa;
import ar.com.centro8.java.curso.eleonora.herencia.bancario.clientes.ClienteIndividual;
import ar.com.centro8.java.curso.eleonora.herencia.bancario.cuentas.CajaAhorro;
import ar.com.centro8.java.curso.eleonora.herencia.bancario.cuentas.Cheque;
import ar.com.centro8.java.curso.eleonora.herencia.bancario.cuentas.CuentaConvertibilidad;
import ar.com.centro8.java.curso.eleonora.herencia.bancario.cuentas.CuentaCorriente;

public class TestCuentas {
    public static void main(String[] args) {
    ClienteIndividual ClienteI1 = new ClienteIndividual("1", "Pedro", "Lopez", "32564879");
    ClienteEmpresa ClienteE1 = new ClienteEmpresa("2", "Casa de computadoras", "30-71234567-8");

        //Este es el test de la cuenta Caja de Ahorro
        System.out.println("**Test de la clase Caja de Ahorro**");
        CajaAhorro caja1 = new CajaAhorro("45654578", ClienteI1, 10000, 5);
        System.out.println(caja1);

        caja1.depositarEfectivo(2000);
        System.out.println(caja1.getSaldo());
        caja1.depositarEfectivo(-2000);
        System.out.println(caja1.getSaldo());

        caja1.extraerEfectivo(1000);
        System.out.println(caja1.getSaldo());
        caja1.extraerEfectivo(12000);
        System.out.println(caja1.getSaldo());

        caja1.cobrarInteres();
        System.out.println("al cobrar interes su nuevo saldo:  " + caja1.getSaldo());

        //este es el test de la clase Cheque
        System.out.println("**Test de la clase Cheque**");
        Cheque cheque1 = new Cheque(5000, "Galicia", LocalDate.of(2026, 12, 20));
        System.out.println(cheque1);

        //Este es el test de la cuenta Cuenta Corriente
        System.out.println("**Test de la cuenta Cuenta Corriente**");
        CuentaCorriente Corriente1 = new CuentaCorriente("556586655", ClienteE1, 5000, 2500);
        System.out.println(Corriente1);

        Corriente1.depositarEfectivo(20000);
        System.out.println(Corriente1.getSaldo());
        Corriente1.depositarEfectivo(-1000);
        System.out.println(Corriente1.getSaldo());

        Corriente1.depositarCheque(cheque1);
        System.out.println(Corriente1.getSaldo());
        Corriente1.depositarCheque(cheque1);
        System.out.println(Corriente1.getSaldo());

        cheque1.setMonto(-5000);
        Corriente1.depositarCheque(cheque1);
        System.out.println(Corriente1.getSaldo());

        Corriente1.extraerEfectivo(7000);
        System.out.println(Corriente1.getSaldo());
        Corriente1.extraerEfectivo(24000);
        System.out.println(Corriente1.getSaldo());
        Corriente1.extraerEfectivo(5000);
        System.out.println(Corriente1.getSaldo());

        //Este es el test de cuenta convertibilidad
        System.out.println("**Test Cuenta Convertibilidad**"); 
        CuentaConvertibilidad convertir1 = new CuentaConvertibilidad("12", ClienteE1, 0, 1000, 0, 0);
        System.out.println(convertir1);

        convertir1.depositarDolares(200);
        System.out.println("Saldo en dolares:  " + convertir1.getSaldoDolares());

        convertir1.depositarDolares(-200);
        System.out.println("Saldo en dolares:  " + convertir1.getSaldoDolares());

        convertir1.extraerDolares(50);
        System.out.println("Saldo en dolares:  " + convertir1.getSaldoDolares());

        convertir1.extraerDolares(250);
        System.out.println("Saldo en dolares:  " + convertir1.getSaldoDolares());

        convertir1.setSaldoPesos(50000);
        System.out.println("Su saldo en pesos:  " + convertir1.getSaldoPesos());

        convertir1.convertirPesoADolar(15000, 1500);
        System.out.println("Saldo en pesos:  " + convertir1.getSaldoPesos());
        System.out.println("Saldo en dolares:  " + convertir1.getSaldoDolares());

        convertir1.convertirDolarAPeso(50, 1500);
        System.out.println("Saldo en dolares:  " + convertir1.getSaldoDolares());
        System.out.println("Saldo en pesos:  " + convertir1.getSaldoPesos());

    }
    
}

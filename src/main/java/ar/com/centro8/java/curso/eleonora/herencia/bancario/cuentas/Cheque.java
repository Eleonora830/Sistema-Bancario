package ar.com.centro8.java.curso.eleonora.herencia.bancario.cuentas;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Cheque {
    private float monto;
    private String bancoEmisor;
    private LocalDate fechaPago;

}

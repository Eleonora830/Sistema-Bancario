package ar.com.centro8.java.curso.eleonora.herencia.bancario.clientes;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class ClienteIndividual extends Cliente {
    private String nombre;
    private String apellido;
    private String dni;

    public ClienteIndividual(String numero, String nombre, String apellido, String dni) {
        super(numero);
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

}

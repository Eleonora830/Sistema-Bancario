package ar.com.centro8.java.curso.eleonora.herencia.bancario.clientes;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class ClienteEmpresa extends Cliente {
    private String nombreFantasia;
    private String cuit;

    public ClienteEmpresa(String numero, String nombreFantasia, String cuit) {
        super(numero);
        this.nombreFantasia = nombreFantasia;
        this.cuit = cuit;
    }

}

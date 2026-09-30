package ar.com.centro8.java.curso.eleonora.herencia.bancario.test;

import ar.com.centro8.java.curso.eleonora.herencia.bancario.clientes.ClienteEmpresa;
import ar.com.centro8.java.curso.eleonora.herencia.bancario.clientes.ClienteIndividual;

public class TestClientes { 
    public static void main(String[] args) {
        //Este es el test de Cliente Individual 
        System.out.println("**Test de la clase Cliente Individual**");
        ClienteIndividual ClienteI1 = new ClienteIndividual("1", "Pedro", "Lopez", "32564879"); 
        System.out.println(ClienteI1);

        //Este es el test de Cliente Empresa
        System.out.println("**Test de la clase Cliente Empresa**");
        ClienteEmpresa ClienteE1 = new ClienteEmpresa("2", "Casa de computadoras", "30-71234567-8"); 
        System.out.println(ClienteE1);
        
    } 

}
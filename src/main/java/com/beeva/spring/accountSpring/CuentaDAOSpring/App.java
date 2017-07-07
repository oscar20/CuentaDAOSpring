package com.beeva.spring.accountSpring.CuentaDAOSpring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beeva.spring.accountSpring.Banco;
import com.beeva.spring.accountSpring.Cliente;
import com.beeva.spring.accountSpring.Cuenta;
import com.beeva.spring.accountSpring.CuentaDAO;
import com.beeva.spring.accountSpring.CuentaDAOFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Ejecutando main...." );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("CuentaDAOXML.xml");
        /*Cuenta account = (Cuenta) context.getBean("cuenta_id");
        System.out.println(account.getbalance());*/
        Banco bank = (Banco)context.getBean("banco");
        List<Cliente> lista_cliente = bank.getLista_clientes();
        for (Cliente c : lista_cliente){
        	
        	System.out.println(c.getNombre() + " " + c.getApellido() + " " + c.getCuenta().getbalance());
        }
        //CuentaDAOFactory accountDAO = (CuentaDAOFactory)context.getBean("cuenta_dao_factory");
        
        //Cliente client = (Cliente) context.getBean("cliente");
        //client.getCuenta().setTipo("ahorro");
        //accountDAO.getImplementacion(client.getCuenta()).retiro(client, 20.0);;
        
        //System.out.println(bank.getNCliente());
        //System.out.println("El numero de clientes es de: " + result);
        /*System.out.println("Nombre: " + client.getNombre());
        System.out.println("Apellido: " + client.getApellido());
        System.out.println("Cuenta de cliente: " + client.getCuenta().getbalance());*/
    }
}

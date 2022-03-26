package Desarrollo;

import java.util.Scanner; //Clase Scanner para el ingreso de datos desde teclado 

public class TransaccionesBancarias {
    public static void main(String[] args) {
        // Crear el objeto propietario
        CuentaBancaria cuenta = new CuentaBancaria(); //Crear instancia(objeto) de la clase CuentaBancaria
        Scanner leer = new Scanner(System.in); //objeto leer de la clase Scanner para ingreso de datos desde teclado
        
        String duiCliente, nombreCliente;
        long telefonoCliente;
    
        double abono, retiro;
        
        System.out.println("Ingresar los datos que se solicitan a continuacion: ");
        System.out.println("Nombre del propietario: ");
        //propietario.nombreCliente = leer.nextLine(); //Asignar valores a los atibutos de la clase 
        nombreCliente = leer.nextLine(); //Asignar valor a la variable nombreCliente
        
        System.out.println("Numero de DUI: ");
        //propietario.duiCliente = leer.nextLine();// Asignar valores a los atributos de la clase
        duiCliente = leer.nextLine(); //Asignar valor a la variable duiCliente
        
        System.out.println("Telefono: ");
        //propietario.telefonoCliente = leer.nextLong(); //Asignar valores a los atributos de la clase
        telefonoCliente = leer.nextLong(); //Asignar valor a la variable telefonoCliente
        
        
        Cliente propietario = new Cliente(duiCliente, nombreCliente, telefonoCliente); //Envio de parametros
        cuenta.propietarioCuenta = propietario; //Asignamos el objeto propietario al objeto cuenta
        
        System.out.println("Ingrese la cantidad a abonar: ");
        cuenta.abonar(abono=leer.nextDouble()); //Envio de para metro al metodo abonar de la clase CuentaBancaria
        
        System.out.println("Ingresar cantidad a retirar: ");
        cuenta.retirar(retiro=leer.nextDouble());
        
        System.out.println("************************************");
        System.out.println("Su saldo de la cuenta es: " + cuenta.saldoCuenta); //Obtiene saldo de cuenta
        //Obtener informacion del propietario
        System.out.println("Datos del propietario :\n" + cuenta.datosPropietarioCuenta());
    } 
}

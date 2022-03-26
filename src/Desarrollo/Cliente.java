package Desarrollo;

public class Cliente {
    String duiCliente, nombreCliente;
    long telefonoCliente; // solamente ingresar numeros

    public Cliente(String duiCliente, String nombreCliente, long telefonoCliente) {
        this.duiCliente = duiCliente;
        this.nombreCliente = nombreCliente;
        this.telefonoCliente = telefonoCliente;
    }

    Cliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}



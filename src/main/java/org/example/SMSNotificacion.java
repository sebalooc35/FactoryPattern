package org.example;

public class SMSNotificacion implements Notificacion{
    private Integer telefono;
    private Importancia importancia;

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public Importancia getImportancia() {
        return importancia;
    }

    public void setImportancia(Importancia importancia) {
        this.importancia = importancia;
    }

    public SMSNotificacion() {
    }

    public SMSNotificacion(Integer telefono, Importancia importancia) {
        this.telefono = telefono;
        this.importancia = importancia;
    }

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Telefono: "+mensaje);
    }
}

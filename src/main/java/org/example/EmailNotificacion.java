package org.example;

public class EmailNotificacion implements Notificacion{
    private String email;
    private Importancia importancia;
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Email: "+mensaje);
    }

    public EmailNotificacion() {
    }

    public EmailNotificacion(String email, Importancia importancia) {
        this.email = email;
        this.importancia = importancia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Importancia getImportancia() {
        return importancia;
    }

    public void setImportancia(Importancia importancia) {
        this.importancia = importancia;
    }
}

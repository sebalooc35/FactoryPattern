package org.example;

public class AppNotificacion implements Notificacion{
    private String app;
    private Importancia importancia;
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("app: "+mensaje);
    }

    public AppNotificacion(String app, Importancia importancia) {
        this.app = app;
        this.importancia = importancia;
    }

    public AppNotificacion() {
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public Importancia getImportancia() {
        return importancia;
    }

    public void setImportancia(Importancia importancia) {
        this.importancia = importancia;
    }
}

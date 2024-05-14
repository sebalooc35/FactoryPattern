package org.example.AbstractFactory;

import org.example.AppNotificacion;
import org.example.EmailNotificacion;
import org.example.Importancia;
import org.example.SMSNotificacion;

public class BajaNotificacionFactory implements NotificacionFactory{
    @Override
    public EmailNotificacion crearEmailNotificacion() {
        return new EmailNotificacion(null, Importancia.BAJA);
    }

    @Override
    public SMSNotificacion crearSMSNotificacion() {
        return new SMSNotificacion(null, Importancia.BAJA);
    }

    @Override
    public AppNotificacion crearAppNotificacion() {
        return new AppNotificacion(null, Importancia.REGULAR);
    }
}

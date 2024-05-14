package org.example.AbstractFactory;

import org.example.AppNotificacion;
import org.example.EmailNotificacion;
import org.example.Importancia;
import org.example.SMSNotificacion;

public class RegularNotificacionFactory implements NotificacionFactory{
    @Override
    public EmailNotificacion crearEmailNotificacion() {
        return new EmailNotificacion(null, Importancia.REGULAR);
    }

    @Override
    public SMSNotificacion crearSMSNotificacion() {
        return new SMSNotificacion(null, Importancia.REGULAR);
    }

    @Override
    public AppNotificacion crearAppNotificacion() {
        return new AppNotificacion(null, Importancia.REGULAR);
    }
}

package org.example.AbstractFactory;

import org.example.AppNotificacion;
import org.example.EmailNotificacion;
import org.example.Importancia;
import org.example.SMSNotificacion;

public class UrgentNotificacionFactory implements NotificacionFactory{
    @Override
    public EmailNotificacion crearEmailNotificacion() {
        return new EmailNotificacion(null, Importancia.URGENTE);
    }

    @Override
    public SMSNotificacion crearSMSNotificacion() {
        return new SMSNotificacion(null, Importancia.URGENTE);
    }

    @Override
    public AppNotificacion crearAppNotificacion() {
        return new AppNotificacion(null, Importancia.URGENTE);
    }
}

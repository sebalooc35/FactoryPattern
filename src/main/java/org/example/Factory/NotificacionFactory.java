package org.example.Factory;

import org.example.AppNotificacion;
import org.example.EmailNotificacion;
import org.example.Notificacion;
import org.example.SMSNotificacion;

public class NotificacionFactory {
    public Notificacion crearNotificacion(String tipo){
        if(tipo.equals("email"))return new EmailNotificacion();
        if(tipo.equals("sms"))return new SMSNotificacion();
        if(tipo.equals("app"))return new AppNotificacion();
        return null;
    }
}

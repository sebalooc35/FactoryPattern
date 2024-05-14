package org.example.AbstractFactory;

import org.example.AppNotificacion;
import org.example.EmailNotificacion;
import org.example.Notificacion;
import org.example.SMSNotificacion;

public interface NotificacionFactory {
    EmailNotificacion crearEmailNotificacion();
    SMSNotificacion crearSMSNotificacion();
    AppNotificacion crearAppNotificacion();

}

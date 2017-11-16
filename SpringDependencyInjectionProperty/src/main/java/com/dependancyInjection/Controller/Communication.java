package com.dependancyInjection.Controller;
import com.dependancyInjection.model.Messaging;
public class Communication {
    private Messaging messaging;
    public void setMessaging(Messaging messaging){
        this.messaging = messaging;
    }
    public void communicate(){
        messaging.sendMessage();
    }
}

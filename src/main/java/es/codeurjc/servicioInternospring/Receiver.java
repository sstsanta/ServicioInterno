package es.codeurjc.servicioInternospring;

import java.util.HashMap;

public class Receiver {
 
    public static final String RECEIVE_METHOD_NAME = "receiveMessage";
 
    public void receiveMessage(HashMap<String,String> message) {
        System.out.println("[Receiver] ha recibido el mensaje \"" + message.get("Nombre") + '"');
    }
}
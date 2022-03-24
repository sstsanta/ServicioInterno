package es.codeurjc.servicioInternospring;

import java.io.PrintWriter;
import java.util.HashMap;

public class Receiver {
 
    public static final String RECEIVE_METHOD_NAME = "receiveMessage";
    private int i = 0;
    public void receiveMessage(HashMap<String,String> message) {
        System.out.println("[Receiver] ha recibido el mensaje \"" + message.get("Usuario") + '"');
        try {
        	String nombre = "/factura"+i+".txt";
            PrintWriter writer = new PrintWriter(nombre, "UTF-8");
            writer.println("Factura a nombre de : " + message.get("Usuario"));
            writer.println("-------------------------------------------------");
            writer.println("Precio : " + message.get("Precio"));
            writer.println("-------------------------------------------------");
            writer.println("Del Autor : " + message.get("Autor"));
            writer.println("Con Hash : " + message.get("Hash"));
            writer.println("-------------------------------------------------");
            writer.println("-------------------------------------------------");
            writer.println("Muchas Gracias Por Su Pedido");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
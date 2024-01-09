package ws;

import jakarta.xml.ws.Endpoint;

public class ServerJWS {
        public static void main(String[] args) {
            // Demare requet HTTP
            String url ="http://0.0.0.0:8888/";
            Endpoint.publish(url,new BanqueService());
            System.out.println("Web Service déployé sur"+ url);
        }
}

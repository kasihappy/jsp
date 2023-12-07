package org.kasihappy.Tutorial.websocket.echo;

import javax.websocket.OnMessage;
import javax.websocket.PongMessage;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;

@ServerEndpoint("/websocket/echoAnnotation")
public class EchoAnnotation {
    @OnMessage
    public void echoTextMessage(Session session, String s, boolean b)
    {
        System.out.println("EchoAnnotation::echoTextMessage:: message="+s);
        try {
            if (session.isOpen()) {
                session.getBasicRemote().sendText(s, b);
            }
        } catch (IOException e) {
            try {
                session.close();
            } catch (IOException e1) {}
        }
    }

    @OnMessage
    public void echoPongMessage(PongMessage pm)
    {

    }
}

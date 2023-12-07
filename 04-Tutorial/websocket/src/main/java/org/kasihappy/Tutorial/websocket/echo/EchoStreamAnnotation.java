package org.kasihappy.Tutorial.websocket.echo;

import javax.websocket.OnMessage;
import javax.websocket.PongMessage;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

@ServerEndpoint("/websocket/echoStreamAnnotation")
public class EchoStreamAnnotation {
    Writer writer;
    OutputStream stream;

    @OnMessage
    public void echoTextMessage(Session session, String s, boolean b) throws IOException
    {
        System.out.println("EchoStreamAnnotation::echoTextMessage:: message="+s);
        if (writer == null)
        {
            writer = session.getBasicRemote().getSendWriter();
        }
        writer.write(s);
        if (b)
        {
            writer.close();
            writer = null;
        }
    }

    @OnMessage
    public void echoPongMessage(PongMessage pm)
    {

    }
}

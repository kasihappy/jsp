package org.kasihappy.Tutorial.websocket.echo;

import org.w3c.dom.Element;

import javax.websocket.EndpointConfig;
import javax.websocket.MessageHandler;
import javax.websocket.RemoteEndpoint;
import javax.websocket.Session;
import javax.xml.transform.Source;
import javax.xml.ws.Binding;
import javax.xml.ws.Endpoint;
import javax.xml.ws.EndpointReference;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

public class EchoEndpoint extends Endpoint {
    public void onOpen(Session session, EndpointConfig endpointConfig)
    {
        /*远程端点基本接口*/
        RemoteEndpoint.Basic remoteEndpointBasic = session.getBasicRemote();
        /*注册远程处理句柄*/
        session.addMessageHandler(new EchoMessageHandlerText(remoteEndpointBasic));
    }
    private static class EchoMessageHandlerText implements MessageHandler.Partial<String>
    {
        private final RemoteEndpoint.Basic remoteEndpointBasic;

        private EchoMessageHandlerText(RemoteEndpoint.Basic remoteEndpointBasic) {
            this.remoteEndpointBasic = remoteEndpointBasic;
        }
        @Override
        public void onMessage(String s, boolean b) {
            System.out.println("EchoEndpoint::OnMessage:: message="+s);
            try {
                if (remoteEndpointBasic != null) {
                    remoteEndpointBasic.sendText(s, b);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Override
    public Binding getBinding() {
        return null;
    }

    @Override
    public Object getImplementor() {
        return null;
    }

    @Override
    public void publish(String address) {

    }

    @Override
    public void publish(Object serverContext) {

    }

    @Override
    public void stop() {

    }

    @Override
    public boolean isPublished() {
        return false;
    }

    @Override
    public List<Source> getMetadata() {
        return null;
    }

    @Override
    public void setMetadata(List<Source> metadata) {

    }

    @Override
    public Executor getExecutor() {
        return null;
    }

    @Override
    public void setExecutor(Executor executor) {

    }

    @Override
    public Map<String, Object> getProperties() {
        return null;
    }

    @Override
    public void setProperties(Map<String, Object> properties) {

    }

    @Override
    public EndpointReference getEndpointReference(Element... referenceParameters) {
        return null;
    }

    @Override
    public <T extends EndpointReference> T getEndpointReference(Class<T> clazz, Element... referenceParameters) {
        return null;
    }
}

package org.kasihappy.Tutorial.websocket;

import org.kasihappy.Tutorial.websocket.echo.EchoEndpoint;

import javax.websocket.Endpoint;
import javax.websocket.server.ServerApplicationConfig;
import javax.websocket.server.ServerEndpointConfig;
import java.util.HashSet;
import java.util.Set;

public class TutorialConfig implements ServerApplicationConfig {

    @Override
    public Set<ServerEndpointConfig> getEndpointConfigs(Set<Class<? extends Endpoint>> set) {
        Set<ServerEndpointConfig> result = new HashSet<>();

        if (set.contains(EchoEndpoint.class)) {
            result.add(ServerEndpointConfig.Builder.create(
                    EchoEndpoint.class,
                    "/websocket/echoProgrammatic"
            ).build());

/*            result.add(ServerEndpointConfig.Builder.create(
                    DrawboardEndpoint.class,
                    "/websocket/drawboard"
            ).build());*/
        }
        return result;
    }

    @Override
    public Set<Class<?>> getAnnotatedEndpointClasses(Set<Class<?>> set) {
        Set<Class<?>> results = new HashSet<>();

        for (Class<?> clazz : set) {
            if (clazz.getPackage().getName().startsWith("org.kasihappy.Tutorial.websocket.")) {
                results.add(clazz);
            }
        }
        return results;
    }
}

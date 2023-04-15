package org.acme;

import org.eclipse.microprofile.reactive.messaging.Incoming;

import javax.enterprise.context.ApplicationScoped;
import javax.json.JsonObject;

@ApplicationScoped
public class UsersConsumer {

    @Incoming("users")
    public void incoming(String object) {

        System.out.println(object);


    }
}

package io.streamzi.cloudevents.beans;

import io.streamzi.cloudevents.CloudEvent;
import io.streamzi.cloudevents.cdi.EventType;

import javax.enterprise.event.Observes;
import javax.inject.Inject;

public class Observer {

    @Inject
    private Receiver receiver;

    public void receiveCloudEvent(@Observes @EventType(name = "Cloud.Storage.Item.Created") CloudEvent cloudEvent) {

        receiver.ack();

    }

}

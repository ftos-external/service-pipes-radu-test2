package com.fintechos.servicepipes.radu.test2.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ExampleRoutes extends RouteBuilder {

    @Override
    public void configure() {

        from("rest:post:outbound/test")
                .routeId("postOutTest")
                .log("Sent response with body=${body}");

        from("rest:post:inbound/test")
                .routeId("postInTest")
                .setProperty("actionName", constant("TestPlatformCommunication"))
                .to("direct:callFTOSWithDefaultAccount");
    }

}
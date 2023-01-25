package rest;

import javax.ws.rs.*;

@Path("/hello-world")
public class DeveloperResource {
    @GET
    @Produces("text/plain")
    public String hello() {
        return "Hello, World!";
    }
}
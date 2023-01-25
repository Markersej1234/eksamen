package rest;

import javax.ws.rs.*;

@Path("/hello-world")
public class ProjectHoursResource {
    @GET
    @Produces("text/plain")
    public String hello() {
        return "Hello, World!";
    }
}
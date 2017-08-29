package contracts.service;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by chandrashekarj on 8/28/2017.
 */
@Path("/ptest")
public interface AllOperationsService {
    @GET
    @Path("/sayhi2")
    @Produces(MediaType.APPLICATION_JSON)
    String sayHiTo(@QueryParam("name") String name);

    @GET
    @Path("/sayhiagain")
    @Produces(MediaType.APPLICATION_JSON)
    String hitMeAgainToday(@QueryParam("name") String name);

    @GET
    @Path("/saybye2")
    @Produces(MediaType.APPLICATION_JSON)
    String sayByeTo(@QueryParam("name") String name);
}
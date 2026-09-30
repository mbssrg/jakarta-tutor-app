package com.example.api;

import com.example.ejb.TutorService;
import com.example.entity.Tutor;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;

@Path("/tutors")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TutorResource {

    @Inject
    private TutorService tutorService;

    @GET
    public List<Tutor> getAll() {
        return tutorService.findAll();
    }

    @POST
    public Response create(Tutor tutor) {
        tutorService.create(tutor);
        return Response.status(Response.Status.CREATED).build();
    }

    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam("id") Long id) {
        tutorService.delete(id);
        return Response.noContent().build();
    }
}
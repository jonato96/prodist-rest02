package com.programacion.rest;

import com.programacion.db.Persona;
import com.programacion.services.ServicioPersona;
import com.programacion.services.ServicioPersonaImpl;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/personas")
public class PersonaRest {

    /**
     * GET /personas
     * GET /personas/{id}
     * DELETE /personas{id}
     * PUT /personas{id}
     * POST /personas
     */

    static ServicioPersona servicio = new ServicioPersonaImpl();

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(Persona p){
        servicio.create(p);
        return Response.status(Response.Status.CREATED).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public Persona findById(@PathParam("id") Integer id){
        return servicio.findById(id);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Persona> findAll(){
        return servicio.findAll();
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public Response update(@PathParam("id") Integer id, Persona p){
        servicio.update(id, p);
        return Response.status(Response.Status.OK).build();
    }

    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam("id") Integer id){
        servicio.delete(id);
        return Response.status(Response.Status.NO_CONTENT).build();
    }


}

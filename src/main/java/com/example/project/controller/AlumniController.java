package com.example.project.controller;

import com.example.project.service.AlumniService;
import com.example.project.bean.Alumni;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URISyntaxException;

@Path("Alumni")
public class AlumniController {
    @POST
    @Path("/login")
    @Produces(MediaType.TEXT_PLAIN) //return type
    @Consumes(MediaType.APPLICATION_JSON) //parameter
    public Response login(Alumni alumni) throws URISyntaxException{
        int val = new AlumniService().login(alumni);
        if (val != -1)
            return Response.ok().entity(val).build();
        else
            return Response.status(404).entity("Invalid Username or password").build();
    }

}

package org.acme;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/users")
public class UserResource {

    @Inject
    UserService service;

    @GET
    public List<User> hello() {
        return service.findAll();
    }

    @GET
    @Path("/{id}")
    public User findById(int id) {
        return service.findById(id);
    }

    @POST
    public User save(User user) {
        return service.save(user);
    }

    @DELETE
    @Path("/{id}")
    public void delete(int id) {
        service.delete(id);
    }

    @PUT
    @Path("/update/{id}/{pw}")
    public User updatePw(Integer id, String pw) {
        return service.changePw(id, pw);
    }


}
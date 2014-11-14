package co.edu.eafit.nocomasolo.servicios;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.sun.jersey.multipart.FormDataParam;

@Path("/restservicecrearusuario")
public class RestServiceCrearUsuario {
	@POST
	@Path("/crearUsuario")
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	@Produces(MediaType.APPLICATION_JSON)
	public Response createUser
		   (@FormDataParam("reg_nombre") String nombre,
			@FormDataParam("reg_codigo") int codigo,
			@FormDataParam("reg_correo") String correo,
			@FormDataParam("reg_idiomas") String idiomas,
			@FormDataParam("reg_pregado") String pregrado) 
	{
		String output = "";
		return Response.status(200).entity(output)
				.header("Access-Control-Allow-Origin", "*").build();
	}
}
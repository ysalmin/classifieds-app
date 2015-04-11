package com.classifieds.app.resource;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.xml.bind.annotation.XmlRootElement;


import com.classifieds.app.model.User;
import com.classifieds.app.service.StudentService;
import org.glassfish.jersey.server.mvc.Viewable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Developer: YSalmin
 * Date: 11.04.2015
 */
@Component
@Path("/")
@XmlRootElement
public class UserResource {

	@Autowired
	private StudentService studentService;
/*
	@GET
	@Path("signup")
	@Produces(MediaType.TEXT_HTML)
	public Response signup() {
		return Response.ok(new Viewable("/signup")).build();
	}

	@POST
	@Path("signup")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.TEXT_HTML)
	public Response signup(@FormParam("userName") String userName,
			@FormParam("password") String password,
			@FormParam("firstName") String firstName,
			@FormParam("lastName") String lastName,
			@FormParam("dateOfBirth") String dateOfBirth,
			@FormParam("emailAddress") String emailAddress)
			throws ParseException {

		if (userName == null || password == null || firstName == null
				|| lastName == null || dateOfBirth == null
				|| emailAddress == null) {
			return Response.status(Status.PRECONDITION_FAILED).build();
		}

		User user = new User();
		user.setUserName(userName);
		user.setPassword(password);
		user.setFirstName(firstName);
		user.setLastName(lastName);

		user.setDateOfBirth(new java.sql.Date(new SimpleDateFormat(
				"MM/dd/yyyy").parse(dateOfBirth.substring(0, 10)).getTime()));

		user.setEmailAddress(emailAddress);

		if (studentService.findByUserName(userName)) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("message", "User Name exists. Try another user name");
			map.put("student", user);
			return Response.status(Status.BAD_REQUEST)
					.entity(new Viewable("/signup", map)).build();
		} else {
			studentService.save(user);
			return Response.ok().entity(new Viewable("/login")).build();
		}
	}

	@GET
	@Path("login")
	@Produces(MediaType.TEXT_HTML)
	public Response login() {
		return Response.ok(new Viewable("/login")).build();
	}

	@POST
	@Path("login")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.TEXT_HTML)
	public Response login(@FormParam("userName") String userName,
			@FormParam("password") String password) {

		if (userName == null || password == null) {
			return Response.status(Status.PRECONDITION_FAILED).build();
		}

		boolean found = studentService.findByLogin(userName, password);
		if (found) {
			return Response.ok().entity(new Viewable("/success")).build();
		} else {
			return Response.status(Status.BAD_REQUEST)
					.entity(new Viewable("/failure")).build();
		}
	}*/

	@GET
	@Path("user")
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> student() {
		List<User> users = studentService.getAllUsers();
		return users;
	}
}

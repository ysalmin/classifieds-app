package com.classifieds.app.client;

import static org.junit.Assert.assertEquals;

/**
 * Developer: YSalmin
 * Date: 11.04.2015
 */
public class UserResourceUnitTest {
	/*private Mockery context;
	private StudentService studentService;
	private UserResource userResourceInterface;

	@Before
	public void beforeEachTest() throws Exception {
		context = new Mockery();
		studentService = context.mock(StudentService.class);
		userResourceInterface = new UserResource();

		Field field = userResourceInterface.getClass().getDeclaredField(
				"studentService");
		field.setAccessible(true);
		field.set(userResourceInterface, studentService);
	}

	@Test
	public void postSignupResourceTest() throws ParseException {
		final String userName = "jersey";
		String password = "jersey";
		String firstName = "jersey";
		String lastName = "jersey";
		String dateOfBirth = "12/21/2013";
		String emailAddress = "jersey@gmail.com";
		final User user = context.mock(User.class);

		context.checking(new Expectations() {
			{
				oneOf(studentService).findByUserName(userName);
				will(returnValue(false));
				oneOf(studentService).save(with(any(User.class)));
				will(returnValue(user));
			}
		});
		userResourceInterface.signup(userName, password, firstName,
				lastName, dateOfBirth, emailAddress);

		context.assertIsSatisfied();
	}

	@Test
	public void postSignupResourceForExistingUserTest() throws ParseException {
		final String userName = "jersey";
		String password = "jersey";
		String firstName = "jersey";
		String lastName = "jersey";
		String dateOfBirth = "12/21/2013";
		String emailAddress = "jersey@gmail.com";

		context.checking(new Expectations() {
			{
				oneOf(studentService).findByUserName(userName);
				will(returnValue(true));
			}
		});
		userResourceInterface.signup(userName, password, firstName,
				lastName, dateOfBirth, emailAddress);

		context.assertIsSatisfied();
	}

	@Test
	public void postSignupResourceForBadRequestTest() throws ParseException {
		String userName = null;
		String password = null;
		String firstName = null;
		String lastName = null;
		String dateOfBirth = null;
		String emailAddress = null;
		final UserResource userResourceInterface = context
				.mock(UserResource.class);
		final Response response = Response.status(Status.PRECONDITION_FAILED)
				.build();
		final Response response1 = Response.ok().entity(new Viewable("/login"))
				.build();

		context.checking(new Expectations() {
			{
				oneOf(userResourceInterface).signup(
						with(aNull(String.class)), with(aNull(String.class)),
						with(aNull(String.class)), with(aNull(String.class)),
						with(aNull(String.class)), with(aNull(String.class)));
				will(returnValue(response));
			}
		});
		userResourceInterface.signup(userName, password, firstName,
				lastName, dateOfBirth, emailAddress);
		assertEquals(response.getStatus(),
				Status.PRECONDITION_FAILED.getStatusCode());

		userName = "jersey";
		context.checking(new Expectations() {
			{
				oneOf(userResourceInterface).signup(
						with(aNonNull(String.class)),
						with(aNull(String.class)), with(aNull(String.class)),
						with(aNull(String.class)), with(aNull(String.class)),
						with(aNull(String.class)));
				will(returnValue(response));
			}
		});
		userResourceInterface.signup(userName, password, firstName,
				lastName, dateOfBirth, emailAddress);
		assertEquals(response.getStatus(),
				Status.PRECONDITION_FAILED.getStatusCode());

		password = "jersey";
		context.checking(new Expectations() {
			{
				oneOf(userResourceInterface).signup(
						with(aNonNull(String.class)),
						with(aNonNull(String.class)),
						with(aNull(String.class)), with(aNull(String.class)),
						with(aNull(String.class)), with(aNull(String.class)));
				will(returnValue(response));
			}
		});
		userResourceInterface.signup(userName, password, firstName,
				lastName, dateOfBirth, emailAddress);
		assertEquals(response.getStatus(),
				Status.PRECONDITION_FAILED.getStatusCode());

		firstName = "jersey";
		context.checking(new Expectations() {
			{
				oneOf(userResourceInterface).signup(
						with(aNonNull(String.class)),
						with(aNonNull(String.class)),
						with(aNonNull(String.class)),
						with(aNull(String.class)), with(aNull(String.class)),
						with(aNull(String.class)));
				will(returnValue(response));
			}
		});
		userResourceInterface.signup(userName, password, firstName,
				lastName, dateOfBirth, emailAddress);

		lastName = "jersey";
		context.checking(new Expectations() {
			{
				oneOf(userResourceInterface).signup(
						with(aNonNull(String.class)),
						with(aNonNull(String.class)),
						with(aNonNull(String.class)),
						with(aNonNull(String.class)),
						with(aNull(String.class)), with(aNull(String.class)));
				will(returnValue(response));
			}
		});
		userResourceInterface.signup(userName, password, firstName,
				lastName, dateOfBirth, emailAddress);
		assertEquals(response.getStatus(),
				Status.PRECONDITION_FAILED.getStatusCode());

		dateOfBirth = "12/20/2013";
		context.checking(new Expectations() {
			{
				oneOf(userResourceInterface)
						.signup(with(aNonNull(String.class)),
								with(aNonNull(String.class)),
								with(aNonNull(String.class)),
								with(aNonNull(String.class)),
								with(aNonNull(String.class)),
								with(aNull(String.class)));
				will(returnValue(response));
			}
		});
		userResourceInterface.signup(userName, password, firstName,
				lastName, dateOfBirth, emailAddress);
		assertEquals(response.getStatus(),
				Status.PRECONDITION_FAILED.getStatusCode());

		emailAddress = "jersey@gmail.com";
		context.checking(new Expectations() {
			{
				oneOf(userResourceInterface).signup(
						with(aNonNull(String.class)),
						with(aNonNull(String.class)),
						with(aNonNull(String.class)),
						with(aNonNull(String.class)),
						with(aNonNull(String.class)),
						with(aNonNull(String.class)));
				will(returnValue(response1));
			}
		});
		userResourceInterface.signup(userName, password, firstName,
				lastName, dateOfBirth, emailAddress);
		assertEquals(response1.getStatus(), Status.OK.getStatusCode());

		context.assertIsSatisfied();
	}

	@Test
	public void postLoginResourceTest() throws ParseException {
		final String userName = "jersey";
		final String password = "jersey";

		context.checking(new Expectations() {
			{
				oneOf(studentService).findByLogin(userName, password);
				will(returnValue(true));
			}
		});
		userResourceInterface.login(userName, password);

		final String password1 = "jersey123";
		context.checking(new Expectations() {
			{
				oneOf(studentService).findByLogin(userName, password1);
				will(returnValue(false));
			}
		});
		userResourceInterface.login(userName, password1);

		context.assertIsSatisfied();
	}

	@Test
	public void postLoginResourceForBadRequestTest() throws ParseException {
		final String userName = null;
		final String password = null;
		final UserResource userResourceInterface = context
				.mock(UserResource.class);
		final Response response = Response.status(Status.PRECONDITION_FAILED)
				.build();
		final Response response1 = Response.ok().entity(new Viewable("/login"))
				.build();

		context.checking(new Expectations() {
			{
				oneOf(userResourceInterface).login(
						with(aNull(String.class)), with(aNull(String.class)));
				will(returnValue(response));
			}
		});
		userResourceInterface.login(userName, password);
		assertEquals(response.getStatus(),
				Status.PRECONDITION_FAILED.getStatusCode());

		final String userName1 = "jersey";

		context.checking(new Expectations() {
			{
				oneOf(userResourceInterface)
						.login(with(aNonNull(String.class)),
								with(aNull(String.class)));
				will(returnValue(response));
			}
		});
		userResourceInterface.login(userName1, password);
		assertEquals(response.getStatus(),
				Status.PRECONDITION_FAILED.getStatusCode());

		final String password1 = "jersey";
		context.checking(new Expectations() {
			{
				oneOf(userResourceInterface)
						.login(with(aNull(String.class)),
								with(aNonNull(String.class)));
				will(returnValue(response));
			}
		});
		userResourceInterface.login(userName, password1);
		assertEquals(response.getStatus(),
				Status.PRECONDITION_FAILED.getStatusCode());

		context.checking(new Expectations() {
			{
				oneOf(userResourceInterface).login(
						with(aNonNull(String.class)),
						with(aNonNull(String.class)));
				will(returnValue(response1));
			}
		});
		userResourceInterface.login(userName1, password1);
		assertEquals(response1.getStatus(), Status.OK.getStatusCode());

		context.assertIsSatisfied();
	}*/
}

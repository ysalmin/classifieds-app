package com.classifieds.app.client;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.lang.reflect.Field;

import com.classifieds.app.model.User;
import com.classifieds.app.repository.UserRepository;
import com.classifieds.app.service.impl.ClassifiedServiceImpl;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Before;
import org.junit.Test;

import com.classifieds.app.service.ClassifiedService;

/**
 * Developer: YSalmin
 * Date: 11.04.2015
 */
public class UserServiceUnitTest {
	private Mockery context;
	private UserRepository userRepository;
	private ClassifiedService classifiedService;

	@Before
	public void beforeEachTest() throws Exception {
		context = new Mockery();
		userRepository = context.mock(UserRepository.class);
		classifiedService = new ClassifiedServiceImpl();

		Field field = classifiedService.getClass().getDeclaredField(
				"studentRepository");
		field.setAccessible(true);
		field.set(classifiedService, userRepository);
	}

	@Test
	public void findByLoginTest() {
		final String userName = "j2eee";
		final String password = "j2ee";
		final User userInterface = null;

		context.checking(new Expectations() {
			{
				oneOf(userRepository).findByUserName(userName);
				will(returnValue(userInterface));
			}
		});
		classifiedService.findByLogin(userName, password);
		assertNull(userInterface);

		final String userName1 = "j2ee";
		final User user1 = context
				.mock(User.class);

		context.checking(new Expectations() {
			{
				oneOf(userRepository).findByUserName(userName1);
				will(returnValue(user1));
				oneOf(user1).getPassword();
				will(returnValue(password));
			}
		});
		classifiedService.findByLogin(userName1, password);
		assertNotNull(user1);
		assertEquals("j2ee", password);

		final String password1 = "j2eee";

		context.checking(new Expectations() {
			{
				oneOf(userRepository).findByUserName(userName1);
				will(returnValue(user1));
				oneOf(user1).getPassword();
				will(returnValue(password1));
			}
		});
		classifiedService.findByLogin(userName1, password1);
		assertNotNull(user1);
		assertNotEquals("j2ee", password1);

		context.assertIsSatisfied();
	}

	@Test
	public void findByLoginWithNullParametersTest() {
		final String userName = null;
		final String password = null;
		classifiedService = context.mock(ClassifiedService.class);

		context.checking(new Expectations() {
			{
				oneOf(classifiedService).findByLogin(with(aNull(String.class)),
						with(aNull(String.class)));
				will(returnValue(false));
			}
		});
		classifiedService.findByLogin(userName, password);

		final String userName1 = "j2ee";

		context.checking(new Expectations() {
			{
				oneOf(classifiedService).findByLogin(with(aNonNull(String.class)),
						with(aNull(String.class)));
				will(returnValue(false));
			}
		});
		classifiedService.findByLogin(userName1, password);

		final String password1 = "j2eee";

		context.checking(new Expectations() {
			{
				oneOf(classifiedService).findByLogin(with(aNull(String.class)),
						with(aNonNull(String.class)));
				will(returnValue(false));
			}
		});
		classifiedService.findByLogin(userName, password1);

		context.checking(new Expectations() {
			{
				oneOf(classifiedService).findByLogin(with(aNonNull(String.class)),
						with(aNonNull(String.class)));
				will(returnValue(false));
			}
		});
		classifiedService.findByLogin(userName1, password1);

		context.assertIsSatisfied();
	}

	@Test
	public void findByEmptyLoginTest() {
		final String userName = "";
		final String password = "";
		final User user = null;

		context.checking(new Expectations() {
			{
				oneOf(userRepository).findByUserName(userName);
				will(returnValue(user));
			}
		});
		classifiedService.findByLogin(userName, password);
		assertNull(user);

		context.assertIsSatisfied();
	}

	@Test
	public void findByUserNameTest() {
		final String userName = "j2ee";

		context.checking(new Expectations() {
			{
				oneOf(userRepository)
						.findByUserName(with(any(String.class)));
				will(returnValue(with(any(User.class))));
			}
		});
		classifiedService.findByUserName(userName);

		context.assertIsSatisfied();
	}

	@Test
	public void findByBadUserNameTest() {
		final String userName = "j2eee";
		final User user = null;

		context.checking(new Expectations() {
			{
				oneOf(userRepository)
						.findByUserName(with(any(String.class)));
				will(returnValue(user));
			}
		});
		classifiedService.findByUserName(userName);
		assertNull(user);

		final String userName1 = "j2ee";
		final User userInterface1 = context
				.mock(User.class);

		context.checking(new Expectations() {
			{
				oneOf(userRepository).findByUserName(userName1);
				will(returnValue(userInterface1));
			}
		});
		classifiedService.findByUserName(userName1);
		assertNotNull(userInterface1);

		context.assertIsSatisfied();
	}
}

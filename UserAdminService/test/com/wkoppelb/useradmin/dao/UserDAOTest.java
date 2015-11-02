package com.wkoppelb.useradmin.dao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.legacy.PowerMockRunner;

import com.wkoppelb.useradmin.dto.User;
import com.wkoppelb.useradmin.util.IDGenerator;

@RunWith(PowerMockRunner.class)
@PrepareForTest(IDGenerator.class)
public class UserDAOTest {

	@Test
	public void createUser_returnUserID_test() {
		UserDAO dao = new UserDAO();
		
		PowerMockito.mockStatic(IDGenerator.class);
		PowerMockito.when(IDGenerator.generateID()).thenReturn(1);
		
		int result = dao.create(new User());
		assertEquals(1, result);
		PowerMockito.verifyStatic();
	}

}

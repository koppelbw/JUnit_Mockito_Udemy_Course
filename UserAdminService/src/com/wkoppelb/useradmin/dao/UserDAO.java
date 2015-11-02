package com.wkoppelb.useradmin.dao;

import com.wkoppelb.useradmin.dto.User;
import com.wkoppelb.useradmin.util.IDGenerator;

public class UserDAO {

	public int create(User user) {
		
		int id = IDGenerator.generateID();
		
		//
		// Save the user object to the db here
		//
		
		return id;
	}
}

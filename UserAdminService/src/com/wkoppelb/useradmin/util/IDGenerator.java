package com.wkoppelb.useradmin.util;

public final class IDGenerator {

	static int id;
	
	public static final int generateID() {
		return id++;
	}
}

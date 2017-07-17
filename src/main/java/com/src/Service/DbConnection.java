package com.src.Service;
import java.sql.Connection;
/**
 * @author Praveen Suresh
 *
 */
public interface DbConnection {

	public void registerConnection();
	public Connection makeConnection();
	
}

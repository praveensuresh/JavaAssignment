package com.src;
import java.sql.Connection;
import java.sql.SQLException;
import com.src.Service.impl.DBlibraryImpl;
import com.src.Service.impl.DbConnectionImpl;
/**
 * @author Samith.Jagannath
 *
 */
public class MainClass {
	public static void main(String args[]) throws SQLException{
		DbConnectionImpl connection= new DbConnectionImpl();
		DBlibraryImpl dBlibraryImpl = new DBlibraryImpl();
		Connection connection;
		String createQuery= "Create table SamithJ("+
							"emp_id integer not null,"+
							"name varchar(30));";
		String insertQuery= "insert into SamithJ values"+
							"(1,'Samith');";
		String deleteQuery= "Delete from SamithJ where emp_id = 1";
		String dropTable = 	"drop table SamithJ";
		
		connection.registerConnection();
		connection = connectionImpl.makeConnection();
		dBlibrary.dropTable(dropTable, connection);
		connection = connectionImpl.makeConnection();
		dBlibrary.createQuery(createQuery, connection);
		connection = connectionImpl.makeConnection();
		dBlibrary.insertQuery(insertQuery, connection);
		connection = connectionImpl.makeConnection();
		dBlibrary.deleteQuery(deleteQuery, connection);
		
		
	}
}

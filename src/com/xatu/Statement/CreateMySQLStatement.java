/**
 * 
 */
package com.xatu.Statement;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Administrator
 *
 */
public class CreateMySQLStatement implements CreateStatement{

	@Override
	public Statement createStatement(Connection con) {
		try {
			Statement createStatement = con.createStatement();
			System.out.println("��ȡ���ݿ����");
			return createStatement;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
     
}

/**
 * 
 */
package com.xatu.Connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author Administrator
 *
 */
public class CreateMySqlConnection implements CreateConnection{
	private String driver = "com.mysql.jdbc.Driver";
	private String dbName = "test";//���ݿ�����
	private String url = "jdbc:mysql://localhost/";//���ݿ��ַ�Լ�����
	private String user = "root";//���ݿ��û���
	private String password = "123456";//���ݿ��û�����
	private Connection conn;
	@Override
	public Connection createConnecton() {
		try {
			Class.forName(driver);//������������
			conn = DriverManager.getConnection(url+dbName, user, password);
			System.out.println("����MySql���ݿ�ɹ�");
			return conn;
		} 
        catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("�������ݿ�ʧ��");
			return null;
		}
	}
}

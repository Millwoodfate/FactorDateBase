/**
 * 
 */
package com.xatu.DBFactor;

import java.sql.Connection;
import java.sql.Statement;

import com.xatu.SQLFactory.creatrSqlMySQL.SqlType;

/**
 * @author Administrator
 *
 */
public abstract class DBFactory {
      //��ȡ���ݿ������
	  public abstract Connection getCon();
	  //��ȡ����
	  public abstract Statement  getSts(Connection con);
	  //��ȡsql
	  public abstract String getSql(SqlType sqlType,String tableName,Object target);
}

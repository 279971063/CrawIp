package csust.crawip.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 * 数据库连接工厂，用于获取数据库连接以及释放连接
 * @author U-ANLA
 *
 */
public class ConnectionFactory {

	private static final String driver = "com.mysql.jdbc.Driver";
	private static final String url = "jdbc:mysql:///cbir";
	private static final String username = "root";
	private static final String password = "123456";
	
	public static Connection getConnection(){
		try {
			Class.forName(driver);
			return DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("##获取数据库连接失败！##");
			return null;
		}
	}
	public static void close(Connection conn,ResultSet rs,Statement stam){
		try {
			if(conn != null){
				conn.close();
			}
			if(rs != null){
				rs.close();
			}
			if(stam != null){
				stam.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("##数据库操作变量操作变量操作失败！##");
		}
	}
	
	
	
}

import java.math.BigDecimal;
import java.sql.*;

public class deletefunction {

// JDBC 驱动名及数据库 URL
static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
static final String DB_URL = "jdbc:mysql://139.59.226.141:3306/gg";

// 数据库的用户名与密码，需要根据自己的设置
static final String USER = "root";
static final String PASS = "1996741352";

public deletefunction(){
}
public void deletecha(String code){

        Connection conn = null;
        Statement stmt = null;

        try{
                Class.forName("com.mysql.jdbc.Driver");


                System.out.println("Connecting Database...");
                conn = DriverManager.getConnection(DB_URL,USER,PASS);
                stmt = conn.createStatement();

                String sql;

                sql = "DELETE FROM GAME_CHARACTER WHERE GAME_CHARACTER_CODE = "+code;
                System.out.println("DELETE FROM GAME_CHARACTER WHERE GAME_CHARACTER_CODE = "+code);

                System.out.println("PROCESSING...");

                stmt.executeUpdate(sql);


                stmt.close();
                conn.close();
        }catch(SQLException se) {
                // 处理 JDBC 错误
                se.printStackTrace();
        }catch(Exception e) {
                // 处理 Class.forName 错误
                e.printStackTrace();
        }finally{
                // 关闭资源
                try{
                        if(stmt!=null) stmt.close();
                }catch(SQLException se2) {
                } // 什么都不做
                try{
                        if(conn!=null) conn.close();
                }catch(SQLException se) {
                        se.printStackTrace();
                }
        }
        System.out.println("DONE!");
}
public void deleteequip(String code){

        Connection conn = null;
        Statement stmt = null;

        try{
                Class.forName("com.mysql.jdbc.Driver");


                System.out.println("Connecting Database...");
                conn = DriverManager.getConnection(DB_URL,USER,PASS);
                stmt = conn.createStatement();

                String sql;

                sql = "DELETE FROM EQUIPMENT_DETAIL WHERE EQUIPMENT_NUM = "+code;
                System.out.println("DELETE FROM EQUIPMENT_DETAIL WHERE EQUIPMENT_NUM = "+code);

                System.out.println("PROCESSING...");

                stmt.executeUpdate(sql);


                stmt.close();
                conn.close();
        }catch(SQLException se) {
                // 处理 JDBC 错误
                se.printStackTrace();
        }catch(Exception e) {
                // 处理 Class.forName 错误
                e.printStackTrace();
        }finally{
                // 关闭资源
                try{
                        if(stmt!=null) stmt.close();
                }catch(SQLException se2) {
                } // 什么都不做
                try{
                        if(conn!=null) conn.close();
                }catch(SQLException se) {
                        se.printStackTrace();
                }
        }
        System.out.println("DONE!");
}
public void deletegun(String code){

        Connection conn = null;
        Statement stmt = null;

        try{
                Class.forName("com.mysql.jdbc.Driver");


                System.out.println("Connecting Database...");
                conn = DriverManager.getConnection(DB_URL,USER,PASS);
                stmt = conn.createStatement();

                String sql;

                sql = "DELETE FROM GUN_DETAIL WHERE GUN_NUM = "+code;
                System.out.println("DELETE FROM GUN_DETAIL WHERE GUN_NUM = "+code);

                System.out.println("PROCESSING...");

                stmt.executeUpdate(sql);


                stmt.close();
                conn.close();
        }catch(SQLException se) {
                // 处理 JDBC 错误
                se.printStackTrace();
        }catch(Exception e) {
                // 处理 Class.forName 错误
                e.printStackTrace();
        }finally{
                // 关闭资源
                try{
                        if(stmt!=null) stmt.close();
                }catch(SQLException se2) {
                } // 什么都不做
                try{
                        if(conn!=null) conn.close();
                }catch(SQLException se) {
                        se.printStackTrace();
                }
        }
        System.out.println("DONE!");
}
}

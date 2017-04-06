import java.math.BigDecimal;
import java.sql.*;

public class modifyfunction {

// JDBC 驱动名及数据库 URL
static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
static final String DB_URL = "jdbc:mysql://139.59.226.141:3306/gg";

// 数据库的用户名与密码，需要根据自己的设置
static final String USER = "root";
static final String PASS = "1996741352";

public modifyfunction(){
}
public void modifygun(String guncode,String name,String dmg,String attack,String mot,String mag,String gunnum){
        int dect =0;
        if(name.trim().isEmpty())
                name="";
        else{
                StringBuilder sb = new StringBuilder();
                sb.append(name+" ' , ");
                sb.insert(0," GUN_NAME = '");
                name=sb.toString();
        }
        if(dmg.trim().isEmpty())
                dmg="";
        else{
                StringBuilder sb = new StringBuilder();
                sb.append(dmg+"  , ");
                sb.insert(0," GUN_DMG = ");
                dmg=sb.toString();
        }
        if(attack.trim().isEmpty())
                attack="";
        else{
                StringBuilder sb = new StringBuilder();
                sb.append(attack+" , ");
                sb.insert(0," GUN_ATTACK_SPEED = ");
                attack=sb.toString();
        }

        if(mot.trim().isEmpty())
                mot="";
        else{
                StringBuilder sb = new StringBuilder();
                sb.append(mot+" , ");
                sb.insert(0," GUN_MOTILITY = ");
                mot=sb.toString();
        }
        if(mag.trim().isEmpty())
                mag="";
        else{
                StringBuilder sb = new StringBuilder();
                sb.append(mag+" , ");
                sb.insert(0," GUN_MAGAZINE_SIZE = ");
                mag=sb.toString();
        }

        if(guncode.trim().isEmpty())
                guncode="";
        else{
                StringBuilder sb = new StringBuilder();
                sb.append(guncode);
                sb.insert(0," GUN_CODE = ");
                guncode=sb.toString();
        }

        String res=guncode+name+dmg+attack+mot+mag;




        Connection conn = null;
        Statement stmt = null;

        try{
                Class.forName("com.mysql.jdbc.Driver");


                System.out.println("Connecting Database...");
                conn = DriverManager.getConnection(DB_URL,USER,PASS);
                stmt = conn.createStatement();

                String sql;

                sql = "UPDATE GUN_DETAIL SET "+res+"WHERE GUN_NUM = "+gunnum;
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
        System.out.println("Goodbye!");




}
public void modifyequip(String equnuma,String equnam,String code,String infor){
        int dect =0;
        if(equnam.trim().isEmpty())
                equnam="";
        else{
                StringBuilder sb = new StringBuilder();
                sb.append(equnam+" ' , ");
                sb.insert(0," EQUIPMENT_NAME = '");
                equnam=sb.toString();
        }
        if(infor.trim().isEmpty())
                infor="";
        else{
                StringBuilder sb = new StringBuilder();
                sb.append(infor+"'  ");
                sb.insert(0,"EQUIPMENT_INFORMATION = '");
                infor=sb.toString();
        }
        if(code.trim().isEmpty())
                code="";
        else{
                StringBuilder sb = new StringBuilder();
                sb.append(code+" , ");
                sb.insert(0," GUN_CODE = ");
                code=sb.toString();
        }


        String res=equnam+code+infor;




        Connection conn = null;
        Statement stmt = null;

        try{
                Class.forName("com.mysql.jdbc.Driver");


                System.out.println("Connecting Database...");
                conn = DriverManager.getConnection(DB_URL,USER,PASS);
                stmt = conn.createStatement();

                String sql;

                sql = "UPDATE EQUIPMENT_DETAIL SET "+res+"WHERE EQUIPMENT_NUM = "+equnuma;
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
        System.out.println("Goodbye!");


}
public void modifycha(String code,String cl,String cf,String cj,String cd,String cc,String ch,String cw,String ct){
        int dect =0;

        if(cl.trim().isEmpty())
                cl="";
        else{
                StringBuilder sb = new StringBuilder();
                sb.append(cl+" ' , ");
                sb.insert(0," GAME_CHARACTER_LNAME = '");
                cl=sb.toString();
        }
        if(cf.trim().isEmpty())
                cf="";
        else{
                StringBuilder sb = new StringBuilder();
                sb.append(cf+"'  , ");
                sb.insert(0," GAME_CHARACTER_FNAME ='");
                cf=sb.toString();
        }
        if(cj.trim().isEmpty())
                cj="";
        else{
                StringBuilder sb = new StringBuilder();
                sb.append(cj+"', ");
                sb.insert(0," GAME_CHARACTER_JOB = '");
                cj=sb.toString();
        }


        if(cd.trim().isEmpty())
                cd="";
        else{
                StringBuilder sb = new StringBuilder();
                sb.append(cd+"' , ");
                sb.insert(0," GAME_CHARACTER_DOB = '");
                cd=sb.toString();
        }

        if(cc.trim().isEmpty())
                cc="";
        else{
                StringBuilder sb = new StringBuilder();
                sb.append(cc +"' , ");
                sb.insert(0," GAME_CHARACTER_COUNTRY = '");
                cc =sb.toString();
        }    if(ch.trim().isEmpty())
                ch ="";
        else{
                StringBuilder sb = new StringBuilder();
                sb.append(ch +"' , ");
                sb.insert(0," GAME_CHARACTER_HEIGHT = '");
                ch=sb.toString();
        }    if(cw.trim().isEmpty())
                cw="";
        else{
                StringBuilder sb = new StringBuilder();
                sb.append(cw+"' , ");
                sb.insert(0," GAME_CHARACTER_WEIGHT = '");
                cw=sb.toString();
        }    if(ct.trim().isEmpty())
                ct ="";
        else{
                StringBuilder sb = new StringBuilder();
                sb.append(ct +"' ");
                sb.insert(0," GAME_CHARACTER_TEAM = '");
                ct =sb.toString();
        }

        String res=cl+cf+ cj+ cd+ cc+ ch+ cw+ ct;


        Connection conn = null;
        Statement stmt = null;

        try{
                Class.forName("com.mysql.jdbc.Driver");


                System.out.println("Connecting Database...");
                conn = DriverManager.getConnection(DB_URL,USER,PASS);
                stmt = conn.createStatement();

                String sql;

                sql = "UPDATE GAME_CHARACTER SET "+res+"WHERE GAME_CHARACTER_CODE = "+code;
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
        System.out.println("Goodbye!");

}
}

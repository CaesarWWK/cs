import java.math.BigDecimal;
import java.sql.*;

public class addfunction {

// JDBC 驱动名及数据库 URL
static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
static final String DB_URL = "jdbc:mysql://139.59.226.141:3306/gg";

// 数据库的用户名与密码，需要根据自己的设置
static final String USER = "root";
static final String PASS = "1996741352";

public addfunction(){
}
public void addgun(String code,String name,String dmg,String attack,String mot,String mag,String num){

        int dect =0;
        if(name.trim().isEmpty())
                name="";
        else{
                StringBuilder sb = new StringBuilder();
                sb.append(name+" ' , ");
                sb.insert(0," '");
                name=sb.toString();
        }
        if(dmg.trim().isEmpty())
                dmg="";
        else{
                StringBuilder sb = new StringBuilder();
                sb.append(dmg+"  , ");
                sb.insert(0," ");
                dmg=sb.toString();
        }
        if(attack.trim().isEmpty())
                attack="";
        else{
                StringBuilder sb = new StringBuilder();
                sb.append(attack+" , ");
                sb.insert(0," ");
                attack=sb.toString();
        }

        if(mot.trim().isEmpty())
                mot="";
        else{
                StringBuilder sb = new StringBuilder();
                sb.append(mot+" , ");
                sb.insert(0," ");
                mot=sb.toString();
        }
        if(mag.trim().isEmpty())
                mag="";
        else{
                StringBuilder sb = new StringBuilder();
                sb.append(mag+" , ");
                sb.insert(0," ");
                mag=sb.toString();
        }
        if(num.trim().isEmpty())
                num="";
        else{
                StringBuilder sb = new StringBuilder();
                sb.append(num+"  ");
                sb.insert(0," ");
                num=sb.toString();
        }
        if(code.trim().isEmpty())
                code="";
        else{
                StringBuilder sb = new StringBuilder();
                sb.append(code+" , ");
                sb.insert(0," ");
                code=sb.toString();
        }

        String res=code+name+dmg+attack+mot+mag+num;
        StringBuilder sb = new StringBuilder();
        sb.append(res+" )");

        res=sb.toString();

        Connection conn = null;
        Statement stmt = null;

        try{
                Class.forName("com.mysql.jdbc.Driver");


                System.out.println("Connecting Database...");
                conn = DriverManager.getConnection(DB_URL,USER,PASS);
                stmt = conn.createStatement();

                String sql;

                sql = "INSERT INTO GUN_DETAIL(GUN_CODE,GUN_NAME,GUN_DMG,GUN_ATTACK_SPEED,GUN_MOTILITY,GUN_MAGAZINE_SIZE,GUN_NUM) VALUES ("+res;

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



public void addequip(String num,String name,String code,String infor){

        int dect =0;
        if(name.trim().isEmpty())
                name="";
        else{
                StringBuilder sb = new StringBuilder();
                sb.append(name+" ' , ");
                sb.insert(0," '");
                name=sb.toString();
        }
        if(num.trim().isEmpty())
                num="";
        else{
                StringBuilder sb = new StringBuilder();
                sb.append(num+"  , ");
                sb.insert(0," ");
                num=sb.toString();
        }
        if(code.trim().isEmpty())
                code="";
        else{
                StringBuilder sb = new StringBuilder();
                sb.append(code+" , ");
                sb.insert(0," ");
                code=sb.toString();
        }


        if(infor.trim().isEmpty())
                num="";
        else{
                StringBuilder sb = new StringBuilder();
                sb.append(infor+"'  ");
                sb.insert(0," '");
                infor=sb.toString();
        }


        String res=num+name+code+infor;
        StringBuilder sb = new StringBuilder();
        sb.append(res+" )");

        res=sb.toString();

        Connection conn = null;
        Statement stmt = null;

        try{
                Class.forName("com.mysql.jdbc.Driver");


                System.out.println("Connecting Database...");
                conn = DriverManager.getConnection(DB_URL,USER,PASS);
                stmt = conn.createStatement();

                String sql;

                sql = "INSERT INTO EQUIPMENT_DETAIL(EQUIPMENT_NUM,EQUIPMENT_NAME,GUN_CODE,EQUIPMENT_INFORMATION) VALUES ("+res;

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
public void addchara(String code,String cl,String cf,String cj,String cd,String cc,String ch,String cw,String ct){
        int dect =0;
        if(code.trim().isEmpty())
                cl="";
        else{
                StringBuilder sb = new StringBuilder();
                sb.append(code+" ' , ");
                sb.insert(0," '");
                code=sb.toString();
        }
        if(cl.trim().isEmpty())
                cl="";
        else{
                StringBuilder sb = new StringBuilder();
                sb.append(cl+" ' , ");
                sb.insert(0," '");
                cl=sb.toString();
        }
        if(cf.trim().isEmpty())
                cf="";
        else{
                StringBuilder sb = new StringBuilder();
                sb.append(cf+"'  , ");
                sb.insert(0," '");
                cf=sb.toString();
        }
        if(cj.trim().isEmpty())
                cj="";
        else{
                StringBuilder sb = new StringBuilder();
                sb.append(cj+"', ");
                sb.insert(0," '");
                cj=sb.toString();
        }


        if(cd.trim().isEmpty())
                cd="";
        else{
                StringBuilder sb = new StringBuilder();
                sb.append(cd+"' , ");
                sb.insert(0," '");
                cd=sb.toString();
        }

        if(cc.trim().isEmpty())
                cc="";
        else{
                StringBuilder sb = new StringBuilder();
                sb.append(cc +"' , ");
                sb.insert(0," '");
                cc =sb.toString();
        }    if(ch.trim().isEmpty())
                ch ="";
        else{
                StringBuilder sb = new StringBuilder();
                sb.append(ch +"' , ");
                sb.insert(0," '");
                ch=sb.toString();
        }    if(cw.trim().isEmpty())
                cw="";
        else{
                StringBuilder sb = new StringBuilder();
                sb.append(cw+"' , ");
                sb.insert(0," '");
                cw=sb.toString();
        }    if(ct.trim().isEmpty())
                ct ="";
        else{
                StringBuilder sb = new StringBuilder();
                sb.append(ct +"' ");
                sb.insert(0," '");
                ct =sb.toString();
        }

        String res=code+cl+cf+ cj+ cd+ cc+ ch+ cw+ ct;
        StringBuilder sb = new StringBuilder();
        sb.append(res+" )");

        res=sb.toString();

        Connection conn = null;
        Statement stmt = null;

        try{
                Class.forName("com.mysql.jdbc.Driver");


                System.out.println("Connecting Database...");
                conn = DriverManager.getConnection(DB_URL,USER,PASS);
                stmt = conn.createStatement();

                String sql;

                sql = "INSERT INTO GAME_CHARACTER(GAME_CHARACTER_CODE,GAME_CHARACTER_LNAME,GAME_CHARACTER_FNAME,GAME_CHARACTER_JOB,GAME_CHARACTER_DOB,GAME_CHARACTER_COUNTRY,GAME_CHARACTER_HEIGHT,GAME_CHARACTER_WEIGHT,GAME_CHARACTER_TEAM) VALUES ("+res;

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

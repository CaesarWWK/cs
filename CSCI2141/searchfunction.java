
import java.math.BigDecimal;
import java.sql.*;

public class searchfunction {


static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
static final String DB_URL = "jdbc:mysql://139.59.226.141:3306/gg";
static final String USER = "root";
static final String PASS = "1996741352";


public void output(ResultSet r){

        try{
                while(r.next()) {
                        // 通过字段检索
                        ResultSetMetaData rMD = r.getMetaData();
                        int count = rMD.getColumnCount();
                        int i=0;

                        while(i<count) {

                                int type=rMD.getColumnType(i+1);
                                String name;
                                name = rMD.getColumnName(i+1);
                                if(type==12) {
                                        String value=r.getString(name);

                                        System.out.print(name +" "+value+"   ");
                                } else if(type==3) {
                                        BigDecimal value = new BigDecimal(0);
                                        value=  r.getBigDecimal(name);
                                        System.out.print(name+" "+value+"   ");

                                }else if (type==4) {
                                        int value = r.getInt(name);
                                        System.out.print(name+ " "+value+ "   ");
                                }

                                i++;

                                // 输出数据

                        }

                        i=0;
                        System.out.print("\n");

                }
        }catch(SQLException se) {
                // 处理 JDBC 错误
                se.printStackTrace();
        }
}
public void searchEquip(String a, String b){
        Connection conn = null;
        Statement stmt = null;

        str example = new str();
        try{
                Class.forName("com.mysql.jdbc.Driver");


                System.out.println("Connecting Database...");
                conn = DriverManager.getConnection(DB_URL,USER,PASS);


                stmt = conn.createStatement();
                String sql;
                if(a.trim().isEmpty()&&b.trim().isEmpty()) {
                        sql="SELECT * FROM EQUIPMENT_DETAIL";
                        System.out.println("Searching ALL From EQUIPMENT_DETAIL");

                }
                else if(a.trim().isEmpty()&&(!b.trim().isEmpty())) {
                        StringBuilder ns = new StringBuilder();
                        ns.append(b);
                        ns.append("'");
                        ns.insert(0,"'");
                        b=ns.toString();
                        sql = "SELECT * FROM EQUIPMENT_DETAIL WHERE EQUIPMENT_NAME = " + b;
                        System.out.println("Searching EQUIPMENT_DETAIL WHERE EQUIPMENT_NAME = "+b);


                }
                else if((!a.trim().isEmpty())&&(b.trim().isEmpty())) {
                        sql="SELECT * FROM EQUIPMENT_DETAIL WHERE EQUIPMENT_NUM = "+a;
                        System.out.println("Searching EQUIPMENT_DETAIL WHERE EQUIPMENT_NUM = "+a);

                }
                else {
                        StringBuilder ns = new StringBuilder();
                        ns.append(b);
                        ns.append("'");
                        ns.insert(0,"'");
                        b=ns.toString(); sql = "SELECT * FROM EQUIPMENT_DETAIL WHERE EQUIPMENT_NUM = "+a+" AND EQUIPMENT_NAME = "+b;
                        System.out.println("Searching EQUIPMENT_DETAIL WHERE EQUIPMENT_NAME = "+b+" AMD EQUIPMENT_NUM = "+a);

                }
                ResultSet rs = stmt.executeQuery(sql);
                System.out.println("PROCESSING...");
                output(rs);
                // 展开结果集数据库


                // 完成后关闭
                rs.close();
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
                }// 什么都不做
                try{
                        if(conn!=null) conn.close();
                }catch(SQLException se) {
                        se.printStackTrace();
                }
        }
        System.out.println("DONE!");
}
public void searchgun(String name,String dmg,String attack,String mot,String mag){
        int dect =0;
        if(name.trim().isEmpty())
                name="";
        else{
                StringBuilder sb = new StringBuilder();
                sb.append(name+"' ");
                sb.insert(0,"  GUN_NAME = '");
                name=sb.toString();
                dect++;
        }
        if(dmg.trim().isEmpty())
                dmg="";
        else{
                StringBuilder sb = new StringBuilder();
                sb.append(dmg+" ");
                sb.insert(0," GUN_DMG = ");
                if(dect!=0) sb.insert(0," AND ");
                dmg=sb.toString();
                dect++;
        }
        if(attack.trim().isEmpty())
                attack="";
        else{
                StringBuilder sb = new StringBuilder();
                sb.append(attack+" ");
                sb.insert(0,"  GUN_ATTACK_SPEED = ");
                if(dect!=0) sb.insert(0," AND ");

                attack=sb.toString();
                dect++;
        }
        if(mot.trim().isEmpty())
                mot="";
        else{
                StringBuilder sb = new StringBuilder();
                sb.append(mot+" ");
                sb.insert(0,"  GUN_MOTILITY = ");
                if(dect!=0) sb.insert(0," AND ");

                mot=sb.toString();
                dect++;
        }
        if(mag.trim().isEmpty())
                mag="";
        else{
                StringBuilder sb = new StringBuilder();
                sb.append(mag+" ");
                sb.insert(0,"  GUN_MAGAZINE_SIZE = ");
                if(dect!=0) sb.insert(0," AND ");
                mag=sb.toString();
        }
        String re = name+attack+mot+mag+dmg;

        System.out.print(re);
        Connection conn = null;
        Statement stmt = null;


        try{
                Class.forName("com.mysql.jdbc.Driver");


                System.out.println("Connecting Database...");
                conn = DriverManager.getConnection(DB_URL,USER,PASS);


                stmt = conn.createStatement();
                String sql;
                if(dect ==0) {
                        sql="SELECT * FROM GUN_DETAIL";
                        System.out.println("Searching ALL from GUN_DETAIL ");

                }
                else{
                        sql = "SELECT * FROM GUN_DETAIL WHERE " + re;
                        System.out.println("Searching GUN_DETAIL WHERE "+re);

                      }

                ResultSet rs = stmt.executeQuery(sql);
                System.out.println("PROCESSING...");

                output(rs);


                rs.close();
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
                }       // 什么都不做
                try{
                        if(conn!=null) conn.close();
                }catch(SQLException se) {
                        se.printStackTrace();
                }
        }
        System.out.println("DONE!");
}
public void searchcha(String cl,String cf,String cj,String cd,String cc, String ch,String cw,String ct)
{
        int dect =0;
        if(cl.trim().isEmpty())
                cl="";
        else{
                StringBuilder sb = new StringBuilder();
                sb.append(cl+"' ");
                sb.insert(0,"  GAME_CHARACTER_LNAME = '");
                cl=sb.toString();
                dect++;
        }
        if(cf.trim().isEmpty())
                cf="";
        else{
                StringBuilder sb = new StringBuilder();
                sb.append(cf+"' ");
                sb.insert(0," GAME_CHARACTER_FNAME = '");
                if(dect!=0) sb.insert(0," AND ");
                cf=sb.toString();
                dect++;
        }
        if(cj.trim().isEmpty())
                cj="";
        else{
                StringBuilder sb = new StringBuilder();
                sb.append(cj+"' ");
                sb.insert(0,"  GAME_CHARACTER_JOB = '");
                if(dect!=0) sb.insert(0," AND ");

                cj=sb.toString();
                dect++;
        }
        if(cd.trim().isEmpty())
                cd="";
        else{
                StringBuilder sb = new StringBuilder();
                sb.append(cd+"' ");
                sb.insert(0,"  GAME_CHARACTER_DOB = '");
                if(dect!=0) sb.insert(0," AND ");

                cd=sb.toString();
                dect++;
        }
        if(cc.trim().isEmpty())
                cc="";
        else{
                StringBuilder sb = new StringBuilder();
                sb.append(cc+"' ");
                sb.insert(0,"  GAME_CHARACTER_COUNTRY = '");
                if(dect!=0) sb.insert(0," AND ");
                cc=sb.toString();
                dect++;
        }
        if(ch.trim().isEmpty())
                ch="";
        else{
                StringBuilder sb = new StringBuilder();
                sb.append(ch+"' ");
                sb.insert(0,"  GAME_CHARACTER_HEIGHT = '");
                if(dect!=0) sb.insert(0," AND ");
                ch=sb.toString();
                dect++;
        }  if(cw.trim().isEmpty())
                cw="";
        else{
                StringBuilder sb = new StringBuilder();
                sb.append(cw+"' ");
                sb.insert(0,"  GAME_CHARACTER_WEIGHT = '");
                if(dect!=0) sb.insert(0," AND ");
                cw=sb.toString();
                dect++;
        }  if(ct.trim().isEmpty())
                ct="";
        else{
                StringBuilder sb = new StringBuilder();
                sb.append(ct+" ");
                sb.insert(0,"  GAME_CHARACTER_TEAM = ");
                if(dect!=0) sb.insert(0," AND ");
                ct=sb.toString();
                dect++;
        }
        String re = cl+cf+cj+cd+cc+ch+cw+ct;

        System.out.print(re);
        Connection conn = null;
        Statement stmt = null;


        try{
                Class.forName("com.mysql.jdbc.Driver");


                System.out.println("Connecting Database...");
                conn = DriverManager.getConnection(DB_URL,USER,PASS);


                stmt = conn.createStatement();
                String sql;
                if(dect==0) {
                        sql="SELECT * FROM GAME_CHARACTER";
                        System.out.println("Searching ALL From GAME_CHARACTER");

                }
                else{
                        sql = "SELECT * FROM GAME_CHARACTER WHERE " + re;
                        System.out.println("Searching GAME_CHARACTER WHERE "+re);

}
                ResultSet rs = stmt.executeQuery(sql);
                System.out.println("PROCESSING...");

                output(rs);


                // 完成后关闭
                rs.close();
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

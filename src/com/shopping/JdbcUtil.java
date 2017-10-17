package com.shopping;

import java.sql.*;

public class JdbcUtil {
    private static String driverClassName = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql:///jdbcdemo";
    private static String name = "root";
    private static String password = "1234";

    static {
        try {
            //加载注册驱动
            Class.forName(driverClassName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    //2 获取连接对象
    public static Connection getconn(){
        try {
//            Connection conn = DriverManager.getConnection(url, name, password);
//            return  conn;
            return DriverManager.getConnection(url, name, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void close(Connection conn, Statement st, ResultSet rs
    ) {
        try{
            if(rs != null){
                rs.close();
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try{
                if(st != null){
                st.close();
                }
            }catch(Exception e){
                e.printStackTrace();
            }finally {
                try{
                    if(conn != null){
                    conn.close();
                    }
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}

//package com.liu.entity;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//public class Test {
//    public static void main(String[] args) {
//        String driver="com.mysql.jdbc.Driver";//数据库驱动代码  固定
//        String url="jdbc:mysql://127.0.0.1/test";//数据库的地址 前面固定 最后面test为数据库的名称
//        String user="root";//数据库账号
//        String password="mypassword";//数据库密码
//        try
//        {
//            Class.forName("driver");//加载驱动，必须写
//            Connection con= DriverManager.getConnection(url,user,password);//连接数据库 必须
//            PreparedStatement ps=con.prepareStatement("insert into student VALUES (?,?,?)");//执行里面的sql语句，返回一个声明用于写入数据。
//            ps.setInt(1,1001);//代替前面第一个？的值 1001
//            ps.setInt(2,20);//代替前面第二个？的值 20
//            ps.setString(3,"nanjing");//代替前面第三个？的值 "nanjing"
//            ps.executeUpdate();//执行更新操作，需要
//            ps.close();
//            con.close();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}

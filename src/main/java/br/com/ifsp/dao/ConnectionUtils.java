package br.com.ifsp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionUtils 
{
    public static Connection obterConexao() throws ClassNotFoundException, 
            SQLException 
    {
    	Connection conn = null;
   try {
	   Class.forName("com.mysql.jdbc.Driver");
   }catch(ClassNotFoundException e) {
	   e.printStackTrace();
   }
   
   try {
	   // Trocar a senha Querentino1!, pela senha do seu DB,caso não exista uma senha, deixar em branco.
	   // Criação do DB disponivel nos arquivos do programa.
	   conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/DBFARMACIA?useSSL=false", "root", "Querentino1!");
   }finally {
	   
   }
        return conn;
    }
}




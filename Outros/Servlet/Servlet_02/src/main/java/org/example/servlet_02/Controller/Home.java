package org.example.servlet_02;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.Statement;

@WebServlet(name = "home", value = "/home")
public class Home extends HttpServlet {


    //Mostrar
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        Conexao conexao = new Conexao();
        Statement stmt = null;
        ResultSet rs = null;

        try {

        }

    }

    //Receber
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
    }

    //Excluir
    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     }









}




//public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//        Conexao conn = new Conexao();
//        if (conn.conectar()) {
//            request.setAttribute("status", "Conectado com sucesso!");
//            conn.desconectar();
//        }
//        else {
//            request.setAttribute("status", "Falha ao conectar!!");
//        }
//}

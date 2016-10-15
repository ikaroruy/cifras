/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Substituicao;
import model.Transposicao;
import model.Unico;

/**
 *
 * @author dunkelheit
 */
@WebServlet("/cifrar")
public class CrifraController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String mensagem = request.getParameter("mensagem");
        String chave = request.getParameter("chave");
        String tipo = request.getParameter("tipos");
        String metodo = request.getParameter("metodo");

        String resposta = "";

        if (metodo.equals("cifrar") && tipo.equals("substituicao")) {
            resposta = Substituicao.cifrar(mensagem, Integer.valueOf(chave));
        } else if (metodo.equals("decifrar") && tipo.equals("substituicao")) {
            resposta = Substituicao.decifra(mensagem, Integer.valueOf(chave));
        } else if (metodo.equals("cifrar") && tipo.equals("transposicao")) {
            resposta = Transposicao.cifrar(chave, mensagem);
        } else if (metodo.equals("decifrar") && tipo.equals("transposicao")) {
            resposta = Transposicao.decifrar(chave, mensagem);
        } else if (metodo.equals("cifrar") && tipo.equals("unico")) {
            resposta = Unico.cifrar(mensagem, chave);
        } else if (metodo.equals("decifrar") && tipo.equals("unico")) {
            resposta = Unico.decifrar(mensagem, chave);
        }

        request.setAttribute("mensagem", mensagem);
        request.setAttribute("resposta", resposta);
        request.setAttribute("metodo", metodo);
        request.setAttribute("chave", chave);
        request.setAttribute("tipo", tipo);
        request.getRequestDispatcher("resposta.jsp").forward(request, response);
    }

}

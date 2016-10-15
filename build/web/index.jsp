<%-- 
    Document   : index
    Created on : 11/09/2016, 20:54:55
    Author     : dunkelheit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>FFB – Disciplina de Segurança da Informação – Prof Helano – Aluno: Ikaro Ruy Alves Castelo Branco</title>
    </head>
    <body>
        <form action="cifrar" id="usrform" method="post">
            <br>
            Chave:  <input type="text" name="chave">
            <br>
            <br>
            <textarea rows="8" cols="100" name="mensagem" form="usrform" placeholder="Entre com a mensagem"></textarea><br>
            <select id="tipos" name="tipos">
                <option value="substituicao">Substituição</option>
                <option value="transposicao">Transposição</option>
                <option value="unico">Uso Único</option>
            </select>
            <input type="radio" name="metodo" value="cifrar">cifrar
            <input type="radio" name="metodo" value="decifrar">decifrar 
            <input type="submit" value="executar">


        </form>

    </body>
</html>

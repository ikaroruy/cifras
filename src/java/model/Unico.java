/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Random;

/**
 *
 * @author dunkelheit
 */
public class Unico {
    
    public static String cifrar(String textoPlano, String chave) {
        String textoBinario = "";
        String resultado = "";
        System.out.println(Integer.toBinaryString(' '));
        for (char c : textoPlano.toCharArray()) {
            String caracterBinario = Integer.toBinaryString(c);

            while (caracterBinario.length() < 8) {
                caracterBinario = "0" + caracterBinario;
            }
            textoBinario += caracterBinario;
        }

        while (chave.length() < textoBinario.length()) {
            chave += chave;
        }

        char[] entrada = textoBinario.toCharArray();
        char[] chaveCompleta = chave.toCharArray();

        for (int i = 0; i < entrada.length; i++) {
            resultado += entrada[i] ^ chaveCompleta[i];
        }

        return resultado;
    }

    public static String decifrar(String textoCifrado, String chave) {
        String resultado = "";

        while (chave.length() < textoCifrado.length()) {
            chave += chave;
        }

        char[] entrada = textoCifrado.toCharArray();
        char[] chaveCompleta = chave.toCharArray();

        for (int i = 0; i < entrada.length; i++) {
            resultado += entrada[i] ^ chaveCompleta[i];
        }

        StringBuilder b = new StringBuilder();
        int len = resultado.length();
        int i = 0;
        while (i + 8 <= len) {
            char c = convert(resultado.substring(i, i + 8));
            i += 8;
            b.append(c);
        }

        return b.toString();
    }

    private static char convert(String bs) {
        return (char) Integer.parseInt(bs, 2);
    }
	
    
}

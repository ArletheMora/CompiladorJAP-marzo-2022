/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codInter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 *
 * @author Juan Pablo
 */
public class Arbol {

    Stack<Nodo> ArbolNodo;
    Stack<String> caracter;
    final String espacios = "/t";
    final String aritmeticos = "+-*()";
    private Nodo arbolExpresion;


    //Metodos
    public Arbol() {
        ArbolNodo = new Stack<Nodo>();
        caracter = new Stack<String>();
    }//Constructor

    private void guardar() {
        //Metodo para los operadores
        Nodo izquierdo = (Nodo) ArbolNodo.pop();
        Nodo derecho = (Nodo) ArbolNodo.pop();
        String operador = caracter.peek();
        ArbolNodo.push(new Nodo(derecho, caracter.pop(), izquierdo));
    }//guardar

    public Nodo crear(String expresion) {
        StringTokenizer tokenizer;
        String token;

        tokenizer = new StringTokenizer(expresion, espacios + aritmeticos, true);

        while (tokenizer.hasMoreTokens()) {
            token = tokenizer.nextToken();
            //System.out.println("Token: "+token);
            if (espacios.indexOf(token) >= 0) {
                //Omitir Espacios
            } else if (aritmeticos.indexOf(token) < 0) { //No es un operador aritmetico
                ArbolNodo.push(new Nodo(token));
            } else if (token.equals(")")) {
                while (!caracter.empty() && !caracter.peek().equals("(")) {
                    guardar();
                }//while
                caracter.pop();
            } else {
                if (!token.equals("(") && !caracter.empty()) {
                    String exa = (String) caracter.peek();
                    while (!exa.equals("(") && caracter.empty()
                            && aritmeticos.indexOf(exa) >= aritmeticos.indexOf(token)) {
                        guardar();
                        if (!caracter.empty()) {
                            exa = (String) caracter.peek();
                        }//IF !caracter.empty
                    }//while !exa
                }//if-token
                caracter.push(token);//guardar el token
            }//if else
        }//while-tokenizer-hashMoreTokens
        while (!caracter.empty()) {
            if (caracter.peek().equals("(")) {
                caracter.pop();
            } else {
                guardar();
                arbolExpresion = (Nodo) ArbolNodo.peek();
            }//if
        }//while !caracter.empty
        return arbolExpresion;
    }//crear
}

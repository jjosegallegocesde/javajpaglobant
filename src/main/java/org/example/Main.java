package org.example;


import org.example.controladores.ControladorAfiliado;
import org.example.entidades.Usuario;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado= new Scanner(System.in);

        ControladorAfiliado controladorAfiliado= new ControladorAfiliado();
        //llamar al metodo para registrar un afiliado
        controladorAfiliado.registrarAfiliado("juanjosegallego","1234567890","juan@gmail.com",4);



    }
}
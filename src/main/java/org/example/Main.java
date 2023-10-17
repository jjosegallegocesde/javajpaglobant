package org.example;


import org.example.controladores.ControladorAfiliado;
import org.example.entidades.Usuario;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado= new Scanner(System.in);

        ControladorAfiliado controladorAfiliado= new ControladorAfiliado();
        //llamar al metodo para registrar un afiliado
        //controladorAfiliado.registrarAfiliado("juanjosegallego","1234567890","juan@gmail.com",4);

        //construir un menu de ocpiones
        //1. registrar afiliado
        //2. ver afiliados
        //3. registrar afiliado evento
        //4. ver afiliadoseventos

        //llamar al controaldor para consultar los afiliados
        controladorAfiliado.consultarAfiliados();


    }
}
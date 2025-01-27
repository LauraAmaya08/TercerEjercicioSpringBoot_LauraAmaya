package com.ejercicio3.TercerEjercicioSpringBoot.controller;

import com.ejercicio3.TercerEjercicioSpringBoot.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
public class ControllerCliente {
        @GetMapping("/api/clientes")
        public ArrayList<Cliente> obtenerListaClientes(){
            ArrayList<Cliente> clientes = new ArrayList<>();
            clientes.add(new Cliente("Pepe",20));
            clientes.add(new Cliente("Sara",15));
            clientes.add(new Cliente("Juan",18));
            return clientes;
        }
    }


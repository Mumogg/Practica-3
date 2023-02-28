package com.practica01.controller;

import com.practica01.Services.estadoService;
import com.practica01.domain.Estado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class estadoController {

    @Autowired
    private estadoService eService;

    @GetMapping("/")
    public String inicio(Model model) {
        var estado = eService.getEstado();
        model.addAttribute("estado", estado);
        return "index";
    }

    public String eliminaCliente(Estado estado) {
        eService.deleteEstado(estado);
        return "redirect:/";
    }

    @GetMapping("/estado/nuevo")
    public String nuevoEstado(Estado estado) {
        return "modificaCliente";
    }

    @PostMapping("/estado/guardar")
    public String guardarCliente(Estado estado) {
        eService.saveEstado(estado);
        return "redirect:/";
    }

    @GetMapping("/estado/modificar/{idEstado}")
    public String modificaCliente(Estado estado, Model model) {
        estado = eService.getEstado(estado);
        model.addAttribute("estado", estado);
        return "modificaEstado";
    }

}

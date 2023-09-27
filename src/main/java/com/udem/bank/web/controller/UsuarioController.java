package com.udem.bank.web.controller;

import com.udem.bank.persistence.entity.UsuarioEntity;
import com.udem.bank.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController
{
    private final UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService)
    {
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public ResponseEntity<List<UsuarioEntity>> getAll()
    {
        return ResponseEntity.ok(this.usuarioService.getAll());
    }
}

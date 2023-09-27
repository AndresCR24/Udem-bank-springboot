package com.udem.bank.service;

import com.udem.bank.persistence.entity.UsuarioEntity;
import com.udem.bank.persistence.repository.UsuarioRespository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService
{
    private final UsuarioRespository usuarioRespository;

    @Autowired
    public UsuarioService(UsuarioRespository usuarioRespository)
    {
        this.usuarioRespository = usuarioRespository;
    }

    public List<UsuarioEntity> getAll()
    {
        return this.usuarioRespository.findAll();
    }
}

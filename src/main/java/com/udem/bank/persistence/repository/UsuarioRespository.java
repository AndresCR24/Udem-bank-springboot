package com.udem.bank.persistence.repository;

import com.udem.bank.persistence.entity.UsuarioEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface UsuarioRespository extends ListCrudRepository<UsuarioEntity, Integer>
{

}

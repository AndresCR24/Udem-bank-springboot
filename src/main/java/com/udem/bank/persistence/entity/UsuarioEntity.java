package com.udem.bank.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "usuario")
@Getter
@Setter
@NoArgsConstructor
public class UsuarioEntity
{
    @Id
    @Column(name = "id_miembro", nullable = false)
    private Integer idMiembro;

    @Column(nullable = false, length = 60)
    private String user;

    @Column(nullable = false, length = 30)
    private String password;

    @Column(nullable = false, length = 60)
    private String email;

}

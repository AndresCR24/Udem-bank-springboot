package com.udem.bank.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "grupo_ahorro")
@Getter
@Setter
@NoArgsConstructor
public class GrupoAhorroEntity
{
    @Id
    @Column(name = "id_grupo", nullable = false)
    private Integer idGrupo;

    @Column(name = "nombre_grupo_ahorro", nullable = false)
    private String nombreGrupoAhorro;

    @Column(name = "saldo_total", nullable = false)
    private Double saldoTotal;

}

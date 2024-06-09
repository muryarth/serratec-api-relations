package org.serratec.backend.relations.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.hibernate.annotations.Fetch;

import java.util.List;
import java.util.Objects;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id_usuario;

    @Column (name = "nome", nullable = false, length = 20)
    private String nome;

    @Column (name = "email", nullable = false, length = 20)
    private String email;

    @Column (name = "senha", nullable = false, length = 20)
    private String senha;

    // FetchType.LAZY só carrega o SQL na hora da requisição
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
    // @JsonIgnore
    private List<Pedido> pedidos;

    // Fazer relação 1:N com pedido
    // Fazer relação 1:1 com endereço
    // Fazer relação N:N com perfil

    public Usuario() {
        super();
    }

    public Usuario(Long id_usuario, String nome, String email, String senha) {
        this.id_usuario = id_usuario;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(id_usuario, usuario.id_usuario);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id_usuario);
    }
}

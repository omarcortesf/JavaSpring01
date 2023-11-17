package com.cursoJava.curso.controllers;

import com.cursoJava.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {


    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(243243L);
        usuario.setNombre("Omar");
        usuario.setApellido("Cortes");
        usuario.setEmail("omarcortes@gmail.com");
        usuario.setTelefono("3323584549");
        return usuario;
    }


    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios(){
        List<Usuario> usuarios= new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setId(5234L);
        usuario.setNombre("Omar");
        usuario.setApellido("Cortes");
        usuario.setEmail("omarcortes@gmail.com");
        usuario.setTelefono("3323584549");

        Usuario usuario2 = new Usuario();
        usuario2.setId(732423L);
        usuario2.setNombre("Maria");
        usuario2.setApellido("Gomez");
        usuario2.setEmail("maria@gmail.com");
        usuario2.setTelefono("22222222");

        Usuario usuario3 = new Usuario();
        usuario3.setId(623423L);
        usuario3.setNombre("Jose");
        usuario3.setApellido("Potter");
        usuario3.setEmail("John@gmail.com");
        usuario3.setTelefono("2333333");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);

        return usuarios;
    }


    @RequestMapping(value = "usuario123")
    public Usuario editar(){
        Usuario usuario = new Usuario();

        usuario.setNombre("Omar");
        usuario.setApellido("Cortes");
        usuario.setEmail("omarcortes@gmail.com");
        usuario.setTelefono("3323584549");
        return usuario;
    }

    @RequestMapping(value = "usuario234")
    public Usuario eliminar(){
        Usuario usuario = new Usuario();

        usuario.setNombre("Omar");
        usuario.setApellido("Cortes");
        usuario.setEmail("omarcortes@gmail.com");
        usuario.setTelefono("3323584549");
        return usuario;
    }

    @RequestMapping(value = "usuario354")
    public Usuario buscar(){
        Usuario usuario = new Usuario();

        usuario.setNombre("Omar");
        usuario.setApellido("Cortes");
        usuario.setEmail("omarcortes@gmail.com");
        usuario.setTelefono("3323584549");
        return usuario;
    }
}

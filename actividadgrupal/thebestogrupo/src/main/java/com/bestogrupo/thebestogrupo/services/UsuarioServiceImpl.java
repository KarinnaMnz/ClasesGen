package com.bestogrupo.thebestogrupo.services;


import com.bestogrupo.thebestogrupo.models.Tarea;
import com.bestogrupo.thebestogrupo.models.Usuario;
import com.bestogrupo.thebestogrupo.repositories.UsuarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioServiceImpl implements UsuarioService {


    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public Usuario getUsuarioPorId(Long id) {
        if (usuarioRepository.existsById(id)) {
            return usuarioRepository.findById(id).get();
        } else {
            return null;
        }
    }

    @Override
    public void deleteUsuarioPorId(Long id) {
        usuarioRepository.deleteById(id);

    }

    @Override
    public void updateUsuarioPorId(Long id, Usuario usuario) {
        Usuario usuarioAEditar = usuarioRepository.findById(id).get();
        usuarioAEditar.setUsuarioNombre(usuario.getUsuarioNombre());
        usuarioAEditar.setUsuarioEmail(usuario.getUsuarioEmail());
        usuarioAEditar.setListaDeTareas(usuario.getListaDeTareas());
        usuarioRepository.save(usuarioAEditar);
    }

    @Override
    public void createUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    @Override
    public void asignarTarea(Long id, Tarea tarea) {
        Usuario usuarioAgregarTarea = usuarioRepository.findById(id).get();
        usuarioAgregarTarea.getListaDeTareas().add(tarea);
        usuarioRepository.save(usuarioAgregarTarea);
    }
}

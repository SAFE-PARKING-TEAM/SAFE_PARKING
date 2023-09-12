package pe.edu.upc.aaw.safeparking.serviceinterfaces;

import pe.edu.upc.aaw.safeparking.entities.Comentario;

import java.util.List;

public interface IComentarioService {

    public void insert(Comentario comentario);
    public List<Comentario> list();
    public void delete(int idComentario);
    public Comentario listarid(int idComentario);
}
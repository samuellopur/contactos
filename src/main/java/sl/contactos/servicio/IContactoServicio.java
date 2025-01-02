package sl.contactos.servicio;

import sl.contactos.modelo.Contacto;

import java.util.List;

public interface IContactoServicio {
    public List<Contacto> listaContactos();
    public Contacto buscarContactoPorId(Integer idContacto);
    public void guardarContacto(Contacto contacto);
    public void eliminarContacto(Contacto contacto);
}

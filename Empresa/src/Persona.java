import java.io.Serializable;

public class Persona implements Serializable
{
 String nombre;
 String apellido;
 String numeroFiscal;
 String direccion;

    public Persona()
    {
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getApellido()
    {
        return apellido;
    }

    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }

    public String getNumeroFiscal()
    {
        return numeroFiscal;
    }

    public void setNumeroFiscal(String numeroFiscal)
    {
        this.numeroFiscal = numeroFiscal;
    }

    public String getDireccion()
    {
        return direccion;
    }

    public void setDireccion(String direccion)
    {
        this.direccion = direccion;
    }

    @Override
    public String toString()
    {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", numeroFiscal='" + numeroFiscal + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}

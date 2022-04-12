public class Empleado extends Persona
{
    Double remuneracion;
    Integer empleado;
    Double aumentarRemuneracion;
    float porcentaje;

    public float getPorcentaje()
    {
        return porcentaje;
    }

    public Double getRemuneracion()
    {
        return remuneracion;
    }

    public Integer getEmpleado()
    {
        return empleado;
    }

    public Double getAumentarRemuneracion()
    {
        return aumentarRemuneracion;
    }

    public Empleado()
    {
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "remuneracion=" + remuneracion +
                ", empleado=" + empleado +
                ", aumentarRemuneracion=" + aumentarRemuneracion +
                ", porcentaje=" + porcentaje +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", numeroFiscal='" + numeroFiscal + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}

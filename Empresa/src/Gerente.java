public class Gerente extends Empleado
{
    Double presupuesto;

    public Double getPresupuesto()
    {
        return presupuesto;
    }

    public Gerente()
    {
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "remuneracion=" + remuneracion +
                ", empleado=" + empleado +
                ", aumentarRemuneracion=" + aumentarRemuneracion +
                ", porcentaje=" + porcentaje +
                ", presupuesto=" + presupuesto +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", numeroFiscal='" + numeroFiscal + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}

public class Cliente extends Persona
{
    Integer cliente;

    public Integer getCliente()
    {
        return cliente;
    }

    public Cliente()
    {
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "cliente=" + cliente +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", numeroFiscal='" + numeroFiscal + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}

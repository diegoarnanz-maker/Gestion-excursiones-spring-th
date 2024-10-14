package excursionweb.modelo.javabean;

import java.time.LocalDate;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor //constructor vacio
@AllArgsConstructor //constructor con todo
@Getter 
@Setter
@ToString
@EqualsAndHashCode
public class Excursion {

    @EqualsAndHashCode.Include //para que solo tenga en cuenta el idExcursion
    private int idExcursion;

    private String descripcion;
    private String origen;
    private String destino;
    private LocalDate fechaExcursion;
    private int duracion;
    private String estado;
    private String destacado;
    private int aforoMaximo;
    private int minimoAsistentes;
    private double precioUnitario;
    private String imagen;
    private Date fechaAlta;
}

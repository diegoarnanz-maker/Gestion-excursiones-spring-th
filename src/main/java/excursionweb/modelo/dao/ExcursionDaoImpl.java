package excursionweb.modelo.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.stereotype.Repository;

import excursionweb.modelo.javabean.Excursion;

@Repository
public class ExcursionDaoImpl implements IExcursionDao {

    List<Excursion> excursiones = new ArrayList<Excursion>();

    // Cargamos datos de prueba
    private void loadData() {
        excursiones.add(new Excursion(1, "Excursion a pescar", "Segovia", "Leon", LocalDate.parse("2024-11-15"), 1,
                "CREADO", "S", 20, 12, 25.0, "https://via.placeholder.com/400x500", new Date()));
        excursiones.add(new Excursion(2, "Excursion a cazar", "Madrid", "Barcelona", LocalDate.parse("2025-01-19"), 1,
                "CREADO", "N", 20, 12, 25.0, "https://via.placeholder.com/400x500", new Date()));
        excursiones.add(new Excursion(3, "Excursion a la montaña", "Asturias", "Picos de Europa",
                LocalDate.parse("2025-03-10"), 2, "TERMINADO", "N", 30, 15, 50.0, "https://via.placeholder.com/400x500", new Date()));
        excursiones.add(new Excursion(4, "Excursion cultural", "Sevilla", "Granada", LocalDate.parse("2025-05-05"), 1,
                "TERMINADO", "S", 25, 10, 40.0, "https://via.placeholder.com/400x500", new Date()));
        excursiones.add(new Excursion(5, "Excursion gastronómica", "Bilbao", "San Sebastián",
                LocalDate.parse("2025-06-15"), 1, "CANCELADO", "N", 15, 8, 60.0, "https://via.placeholder.com/400x500", new Date()));
        excursiones.add(new Excursion(6, "Excursion a la playa", "Alicante", "Benidorm", LocalDate.parse("2025-07-20"),
                1, "CREADO", "S", 50, 20, 35.0, "https://via.placeholder.com/400x500", new Date()));
        excursiones.add(new Excursion(7, "Excursion en bicicleta", "Barcelona", "Montserrat",
                LocalDate.parse("2025-08-25"), 2, "CREADO", "S", 20, 10, 45.0, "https://via.placeholder.com/400x500", new Date()));
        excursiones.add(new Excursion(8, "Excursion a los museos", "Madrid", "Museo del Prado",
                LocalDate.parse("2025-09-30"), 1, "TERMINADO", "N", 30, 15, 20.0, "https://via.placeholder.com/400x500", new Date()));
        excursiones.add(new Excursion(9, "Excursion de senderismo", "Zaragoza", "Ordesa", LocalDate.parse("2025-10-12"),
                3, "CREADO", "S", 25, 10, 30.0, "https://via.placeholder.com/400x500", new Date()));
        excursiones.add(new Excursion(10, "Excursion de avistamiento de aves", "Valencia", "Albufera",
                LocalDate.parse("2025-11-18"), 1, "CANCELADO", "N", 15, 5, 55.0, "https://via.placeholder.com/400x500", new Date()));
        excursiones.add(new Excursion(11, "Excursion en barca", "Cádiz", "Doñana", LocalDate.parse("2025-12-01"), 2,
                "CREADO", "S", 30, 10, 80.0, "https://via.placeholder.com/400x500", new Date()));
        excursiones.add(new Excursion(12, "Excursion de escalada", "Granada", "Sierra Nevada",
                LocalDate.parse("2026-01-15"), 1, "TERMINADO", "N", 15, 8, 100.0, "https://via.placeholder.com/400x500", new Date()));
        excursiones.add(new Excursion(13, "Excursion nocturna", "Madrid", "Retiro", LocalDate.parse("2026-02-20"), 1,
                "CREADO", "S", 20, 12, 20.0, "https://via.placeholder.com/400x500", new Date()));
        excursiones.add(new Excursion(14, "Excursion astronomica", "Toledo", "Sierra de San Vicente",
                LocalDate.parse("2026-03-05"), 1, "CANCELADO", "N", 10, 5, 40.0, "https://via.placeholder.com/400x500", new Date()));
        excursiones.add(new Excursion(15, "Excursion a la nieve", "Andorra", "Grandvalira",
                LocalDate.parse("2026-01-15"), 3, "CREADO", "S", 25, 10, 90.0, "https://via.placeholder.com/400x500", new Date()));
        excursiones.add(new Excursion(16, "Excursion a Tarragona", "Barcelona", "Tarragona",
                LocalDate.parse("2026-04-10"), 1, "TERMINADO", "N", 40, 15, 70.0, "https://via.placeholder.com/400x500", new Date()));
        excursiones.add(new Excursion(17, "Excursion a la cueva magica", "Almería", "Cueva de altamira",
                LocalDate.parse("2026-05-20"), 2, "CREADO", "S", 30, 12, 60.0, "https://via.placeholder.com/400x500", new Date()));
        excursiones.add(new Excursion(18, "Excursion en kayak", "Málaga", "Hoces de rio duratón",
                LocalDate.parse("2026-06-25"), 1, "CANCELADO", "N", 15, 8, 50.0, "https://via.placeholder.com/400x500", new Date()));
        excursiones.add(new Excursion(19, "Excursion a la fiesta de la vendimia", "La Rioja", "Haró",
                LocalDate.parse("2026-07-30"), 2, "CREADO", "S", 20, 10, 30.0, "https://via.placeholder.com/400x500", new Date()));
        excursiones.add(new Excursion(20, "Excursion a Cangas de Onis", "Asturias", "Cangas de Onís",
                LocalDate.parse("2026-08-15"), 1, "TERMINADO", "N", 25, 15, 45.0, "https://via.placeholder.com/400x500", new Date()));
    }
    
    // Constructor
    public ExcursionDaoImpl() {
        excursiones = new ArrayList<Excursion>();
        loadData();
    }

    // Implementamos los métodos de la interfaz IExcursionDao
    // return 1=ok, 0=error
    @Override
    public int create(Excursion excursion) {
        excursiones.add(excursion);
        return 1;
    }

    @Override
    public int update(Excursion excursion) {
        Excursion excursionModificar = findById(excursion.getIdExcursion());
        if (excursionModificar != null) {
            excursionModificar.setDescripcion(excursion.getDescripcion());
            excursionModificar.setOrigen(excursion.getOrigen());
            excursionModificar.setDestino(excursion.getDestino());
            excursionModificar.setFechaExcursion(excursion.getFechaExcursion());
            excursionModificar.setDuracion(excursion.getDuracion());
            excursionModificar.setEstado(excursion.getEstado());
            excursionModificar.setDestacado(excursion.getDestacado());
            excursionModificar.setAforoMaximo(excursion.getAforoMaximo());
            excursionModificar.setMinimoAsistentes(excursion.getMinimoAsistentes());
            excursionModificar.setPrecioUnitario(excursion.getPrecioUnitario());
            excursionModificar.setImagen(excursion.getImagen());
            excursionModificar.setFechaAlta(excursion.getFechaAlta());
            return 1;
        } else {
            throw new NoSuchElementException(
                    "Excursion con id " + excursion.getIdExcursion() + " no se ha podido modificar.");
        }
    }

    @Override
    public int delete(Excursion excursion) {
        excursiones.remove(excursion);
        return 1;
    }

    @Override
    public int delete(int idExcursion) {
        Excursion excursionEliminar = findById(idExcursion);
        if (excursionEliminar != null) {
            excursiones.remove(excursionEliminar);
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public Excursion findById(int idExcursion) {
        for (Excursion excursion : excursiones) {
            if (excursion.getIdExcursion() == idExcursion) {
                return excursion; // Retorna la excursión si se encuentra
            }
        }
        throw new NoSuchElementException("Excursion con id " + idExcursion + " no encontrada.");
    }

    @Override
    public List<Excursion> findAll() {
        return excursiones;
    }

    @Override
    public List<Excursion> findFeatures() {
        List<Excursion> excursionesDestacadas = new ArrayList<Excursion>();
        for (Excursion excursion : excursiones) {
            if (excursion.getDestacado().equals("S")) {
                excursionesDestacadas.add(excursion);
            }
        }
        return excursionesDestacadas;
    }

    @Override
    public List<Excursion> findActived() {
        List<Excursion> excursionesActivas = new ArrayList<Excursion>();
        for (Excursion excursion : excursiones) {
            if (excursion.getEstado().equals("CREADO")) {
                excursionesActivas.add(excursion);
            }
        }
        return excursionesActivas;
    }

    @Override
    public List<Excursion> findCancelled() {
        List<Excursion> excursionesCanceladas = new ArrayList<Excursion>();
        for (Excursion excursion : excursiones) {
            if (excursion.getEstado().equals("CANCELADO")) {
                excursionesCanceladas.add(excursion);
            }
        }
        return excursionesCanceladas;
    }

    @Override
    public List<Excursion> findFinished() {
        List<Excursion> excursionesFinalizadas = new ArrayList<Excursion>();
        for (Excursion excursion : excursiones) {
            if (excursion.getEstado().equals("TERMINADO")) {
                excursionesFinalizadas.add(excursion);
            }
        }
        return excursionesFinalizadas;
    }

}

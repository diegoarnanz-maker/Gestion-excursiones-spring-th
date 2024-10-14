package excursionweb.modelo.dao;

import java.util.List;

import excursionweb.modelo.javabean.Excursion;

public interface IExcursionDao {

    int create(Excursion excursion);
    int update(Excursion excursion);
    int delete(Excursion excursion);
    int delete(int idExcursion);
    Excursion findById(int idExcursion);
    List<Excursion> findAll();
    List<Excursion> findFeatures();
    List<Excursion> findActived();
    List<Excursion> findCancelled();
    List<Excursion> findFinished();
}

package ua.goit.project.dataLayer;

import java.util.List;
import java.util.Optional;

public interface Repository<T> {
    Integer create(T t);

    Optional<T> findById(int id);

    List<T> findAll();

    void update(T t);

    void delete(T t);
}

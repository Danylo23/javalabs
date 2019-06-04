package ua.lviv.iot.components.repositories;

import org.springframework.data.repository.CrudRepository;
import ua.lviv.iot.components.models.Components;

public interface ComponentsRepository<T extends Components>
        extends CrudRepository<T, Integer> {
}

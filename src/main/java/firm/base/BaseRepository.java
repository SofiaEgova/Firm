package firm.base;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public interface BaseRepository<T> {

    List<T> findAll()throws IOException;

    T save(T entity) throws IOException;
}

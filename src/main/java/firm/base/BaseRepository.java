package firm.base;

import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public interface BaseRepository<T> {

    //T findOne(Integer id)throws IOException;

    T save(T entity) throws IOException;
}

package firm.worker;

import firm.base.BaseRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Profile("db-store")
public interface WorkerRepository extends JpaRepository<Worker, Integer>, BaseRepository<Worker> {
}

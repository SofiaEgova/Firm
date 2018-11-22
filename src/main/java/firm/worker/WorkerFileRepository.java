package firm.worker;

import firm.base.FileRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@Profile("file-store")
public class WorkerFileRepository extends FileRepository<Worker> {
    public WorkerFileRepository(Environment env) {
        super(Worker.class, env);
    }
}
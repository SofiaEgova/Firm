package firm.jobType;

import firm.base.FileRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;


@Component
@Profile("file-store")
public class JobTypeFileRepository extends FileRepository<JobType> {
    public JobTypeFileRepository(Environment env) {
        super(JobType.class, env);
    }
}
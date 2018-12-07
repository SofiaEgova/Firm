package firm.jobType;

import firm.base.BaseRepository;
import firm.client.Client;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

@Service
public class JobTypeService {
    private final BaseRepository<JobType> jobTypeRepository;

    public JobTypeService(BaseRepository<JobType> jobTypeRepository) {
        this.jobTypeRepository = jobTypeRepository;
    }

//    public List<Client> getAll(){
//        return clientRepository.findAll();
//    }

    @Transactional
    public void create(JobType client) throws IOException {
        jobTypeRepository.save(client);
    }
}
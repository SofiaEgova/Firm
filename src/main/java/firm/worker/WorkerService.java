package firm.worker;

import firm.base.BaseRepository;
import firm.client.Client;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

@Service
public class WorkerService {
    private final BaseRepository<Worker> workerRepository;

    public WorkerService(BaseRepository<Worker> workerRepository) {
        this.workerRepository = workerRepository;
    }

//    public List<Client> getAll(){
//        return clientRepository.findAll();
//    }

    @Transactional
    public void create(Worker worker) throws IOException {
        workerRepository.save(worker);
    }
}
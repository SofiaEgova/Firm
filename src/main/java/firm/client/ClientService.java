package firm.client;

import firm.base.BaseRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

@Service
public class ClientService {
    private final BaseRepository clientRepository;

    public ClientService(BaseRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

//    public List<Client> getAll(){
//        return clientRepository.findAll();
//    }

    @Transactional
    public void create(Client client) throws IOException {
        clientRepository.save(client);
    }
}

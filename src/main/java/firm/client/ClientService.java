package firm.client;

import firm.base.BaseRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;

@Service
public class ClientService {
    private final BaseRepository<Client> clientRepository;

    public ClientService(BaseRepository<Client> clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<Client> getAll() throws IOException{
        return clientRepository.findAll();
    }

    @Transactional
    public void create(Client client) throws IOException {
        clientRepository.save(client);
    }
}

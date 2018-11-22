package firm.client;


import firm.base.FileRepository;
import org.springframework.core.env.Environment;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


@Component
@Profile("file-store")
public class ClientFileRepository extends FileRepository<Client> {
    public ClientFileRepository(Environment env) {
        super(Client.class, env);
    }
}
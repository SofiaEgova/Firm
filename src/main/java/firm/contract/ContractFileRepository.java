package firm.contract;

import firm.base.FileRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;


@Component
@Profile("file-store")
public class ContractFileRepository extends FileRepository<Contract> {
    public ContractFileRepository(Environment env) {
        super(Contract.class, env);
    }
}
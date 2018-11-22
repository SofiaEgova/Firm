package firm.order;

import firm.base.FileRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;


@Component
@Profile("file-store")
public class OrderFileRepository extends FileRepository<Order> {
    public OrderFileRepository(Environment env) {
        super(Order.class, env);
    }
}
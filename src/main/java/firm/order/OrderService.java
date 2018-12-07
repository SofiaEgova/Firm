package firm.order;

import firm.base.BaseRepository;
import firm.client.Client;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;


@Service
public class OrderService {
    private final BaseRepository<Order> orderRepository;

    public OrderService(BaseRepository<Order> orderRepository) {
        this.orderRepository = orderRepository;
    }

//    public List<Client> getAll(){
//        return clientRepository.findAll();
//    }

    @Transactional
    public void create(Order order) throws IOException {
        orderRepository.save(order);
    }
}
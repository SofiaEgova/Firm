package firm.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;

@Controller
public class ClientController {

    private ClientService service;

    public ClientController(ClientService service) {
        this.service = service;
    }

    @GetMapping("/client")
    public String client() {
        return "client";
    }


    @PostMapping
    public void createClient(@RequestParam String phone, @RequestParam String name) throws IOException {
        Client client = new Client(name,Integer.parseInt(phone));
        service.create(client);
    }
}
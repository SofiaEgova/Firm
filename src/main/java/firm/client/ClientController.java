package firm.client;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.List;

@Controller
public class ClientController {

    private ClientService service;

    public ClientController(ClientService service) {
        this.service = service;
    }

    @GetMapping("/client")
    public String client(Model model)throws IOException {
        Iterable<Client> clients = service.getAll();
        model.addAttribute("clients",clients);
        return "client";
    }
//
//    @GetMapping("/getClients")
//    public Model getClients(Model model)throws IOException {
//        Iterable<Client> clients = service.getAll();
//        model.addAttribute("clients",clients);
//        return model;
//    }

    @PostMapping
    public void createClient(@RequestParam String phone, @RequestParam String name) throws IOException {
        Client client = new Client(name,Integer.parseInt(phone));
        service.create(client);
    }
}
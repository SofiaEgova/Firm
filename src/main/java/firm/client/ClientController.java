package firm.client;

import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.enterprise.inject.Produces;
import javax.json.Json;
import javax.json.JsonObject;
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

//    @GetMapping("/client")
//    public String client(){
//        return "client";
//    }

//    @GetMapping("/getClients")
//    @ResponseBody
//    public List<Client> client()throws IOException {
//        JSONObject obj = new JSONObject();
//        List<Client> clients = service.getAll();
//        for(int i=0;i<((List<Client>) clients).size();i++){
//           obj.put(((List<Client>) clients).get(i).getId().toString(), ((List<Client>) clients).get(i).getName());
//        }
//        return clients;
//    }

    @GetMapping("/getClients")
   //
    public @ResponseBody List<Client> getClients()throws IOException {
        List<Client> clients = service.getAll();
        return clients;
    }

    @PostMapping
    public void createClient(@RequestParam String phone, @RequestParam String name) throws IOException {
        Client client = new Client(name,Integer.parseInt(phone));
        service.create(client);
    }
}
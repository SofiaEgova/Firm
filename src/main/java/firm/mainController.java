package firm;


import firm.client.Client;
import firm.client.ClientRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;


@Controller
public class mainController {
    private ClientRepository rep;

    @GetMapping("/index")
    public String index(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "index.html";
    }

    @PostMapping
    public void add(@RequestParam String name, @RequestParam String phone) throws IOException {
        Client client = new Client();
        client.setName(name);
        client.setPhoneNumber(Integer.parseInt(phone));
        rep.save(client);
    }
}

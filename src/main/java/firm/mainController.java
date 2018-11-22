package firm;


import firm.worker.Worker;
import firm.worker.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.util.List;


@Controller
public class mainController {
    private WorkerRepository rep;

//    @GetMapping("/index")
//    public String index(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
//        model.addAttribute("name", name);
//        return "index.html";
//    }

    @GetMapping("/index")
    public String index(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        //Worker wr = rep.
        model.addAttribute("name", name);
        return "index.html";
    }

    @PostMapping
    public String add(@RequestParam String name,@RequestParam String post, Model model) throws IOException {
        Worker worker = new Worker(name,post);
        rep.save(worker);

        model.addAttribute("name", name);
        model.addAttribute("post", post);
        return "index.html";
    }
}

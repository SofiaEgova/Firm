package firm.worker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class WorkerController {
    @GetMapping("/worker")
    public String worker() {
        return "worker";
    }
}
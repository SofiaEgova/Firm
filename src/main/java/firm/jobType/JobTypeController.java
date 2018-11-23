package firm.jobType;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class JobTypeController {
    @GetMapping("/jobType")
    public String jobType() {
        return "jobType";
    }
}
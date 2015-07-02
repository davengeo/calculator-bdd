package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.Map;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(Map<String, Object> model) {
        model.put("time", new Date());
        model.put("message", "hello");
        model.put("result", 0);
        return "index";
    }

    @RequestMapping("/calculate")
    public String calculate(@RequestParam("first_number") String firstNumber,
                            @RequestParam("second_number") String secondNumber,
                            Map<String, Object> model) {
        model.put("time", new Date());
        model.put("message", "calculate");
        model.put("result", 10);
        System.out.println(firstNumber);
        System.out.println(secondNumber);
        return "index";
    }

}

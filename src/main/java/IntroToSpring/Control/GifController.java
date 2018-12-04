package IntroToSpring.Control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //Gets detected during Spring package scanning.

public class GifController {
    @RequestMapping("/") //requests a URI
    public String listGifs(){
        return "home";
    }

    @RequestMapping("/gif")
    @ResponseBody
    public String aNewResponse(){
        return "A New Response";
    }
}

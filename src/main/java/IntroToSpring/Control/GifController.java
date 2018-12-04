package IntroToSpring.Control;

import IntroToSpring.Model.Gif;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;

@Controller

public class GifController {
    @RequestMapping("/")
    public String listGifs(){
        return "home";
    }

    @RequestMapping("/gif")
    public String gifDetails(ModelMap modelMap){
        Gif gif = new Gif("compiler-bot", LocalDate.of(2015,2,13),"Sam Grill", true);
        modelMap.put("gif", gif);
        return "gif-details";
    }
}

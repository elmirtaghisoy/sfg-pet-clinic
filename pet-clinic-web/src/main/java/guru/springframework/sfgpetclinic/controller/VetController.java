package guru.springframework.sfgpetclinic.controller;

import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vets")
public class VetController {

    @Autowired
    VetService vetService;

    @RequestMapping({"","/","/index","/index.html"})
    public String index(
            Model model
    ){
        model.addAttribute("vets",vetService.findAll());
        return "vets/index";
    }
}

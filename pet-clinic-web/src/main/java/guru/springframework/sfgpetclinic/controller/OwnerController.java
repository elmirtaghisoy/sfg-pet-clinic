package guru.springframework.sfgpetclinic.controller;

import guru.springframework.sfgpetclinic.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    @Autowired
    OwnerService ownerService;


    @RequestMapping({"", "/", "/index", "/index.html"})
    public String index(
            Model model
    ) {
        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }

    @RequestMapping("/find")
    public String findOwners(Model model){
        return "notimplemented";
    }
}

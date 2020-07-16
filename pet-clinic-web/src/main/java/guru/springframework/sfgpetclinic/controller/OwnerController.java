package guru.springframework.sfgpetclinic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/owners")
public class OwnerController {
    @RequestMapping({"","/","/index","/index.html"})
    public String index(){
        return "owners/index";
    }
}

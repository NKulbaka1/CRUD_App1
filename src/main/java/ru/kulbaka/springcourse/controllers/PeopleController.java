package ru.kulbaka.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.kulbaka.springcourse.dao.PersonDAO;

@Controller
//@RequestMapping("/people")
public class PeopleController {

    @GetMapping("/demo")
    public String index() {
        return "first/test";
    }



//    private final PersonDAO personDAO;
//
//    public PeopleController(PersonDAO personDAO) {
//        this.personDAO = personDAO;
//    }
//
//    @GetMapping()
//    public String index(Model model) {
//        model.addAttribute("people", personDAO.index());
//        return "people/test";
//    }
//
//    @GetMapping("/{id}")
//    public String show(@PathVariable("id") int id, Model model) {
//        model.addAttribute("person", personDAO.show(id));
//        return "people/show";
//    }
}



















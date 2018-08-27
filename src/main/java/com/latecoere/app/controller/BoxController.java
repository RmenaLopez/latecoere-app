package com.latecoere.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.latecoere.app.models.Box;
import com.latecoere.app.repository.BoxRepository;

@RestController
public class BoxController {

    private final String NEW_BOX_FORM_URL = "/box";

    BoxRepository repository;

    @Autowired
    public BoxController(BoxRepository repository) {
        this.repository = repository;
    }

    @GetMapping( NEW_BOX_FORM_URL )
    public ModelAndView showNewBoxForm(ModelAndView modelAndView){
        modelAndView.setViewName("/newBoxForm");
        modelAndView.addObject("box" ,new Box());
        return modelAndView;
    }

    @PostMapping ( NEW_BOX_FORM_URL )
    public ModelAndView addNewBox(ModelAndView modelAndView,
                                  @ModelAttribute("box")Box box,
                                  BindingResult result){

        modelAndView.setViewName("/newBoxForm");
        modelAndView.addObject(box);

        repository.save(box);
        return modelAndView;
    }

}

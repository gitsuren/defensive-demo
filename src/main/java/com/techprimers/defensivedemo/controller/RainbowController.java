package com.techprimers.defensivedemo.controller;

import com.techprimers.defensivedemo.service.RainbowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RainbowController {
    @Autowired
    private RainbowService service;

    @GetMapping("/getrainbow")
    public List<String> getRainbow(){
        return service.getRainbow();
    }
}

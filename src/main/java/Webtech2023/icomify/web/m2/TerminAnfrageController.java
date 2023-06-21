package Webtech2023.icomify.web.m2;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TerminAnfrageController {

    @Autowired
    TerminAnfrageService service;

    Logger logger = LoggerFactory.getLogger(TerminAnfrageController.class);

    @PostMapping("/terminanfragen")
    public TerminAnfrage createTerminAnfrage(@RequestBody TerminAnfrage TerminAnfrage) {
        return service.save(TerminAnfrage);
    }

    @GetMapping("/terminanfragen/{id}")
    public TerminAnfrage getTerminAnfrage(@PathVariable String id) {
        logger.info("GET request on route TerminAnfragen with {}", id);
        Long TerminAnfrageId = Long.parseLong(id);
        return service.get(TerminAnfrageId);
    }

    @GetMapping("/terminanfragen")
    public List<TerminAnfrage> getAllTerminAnfragen() {
        return service.getAll();
    }

}



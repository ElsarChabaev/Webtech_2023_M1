package Webtech2023.icomify.web.m2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TerminAnfrageService {

    @Autowired
    TerminAnfrageRepository repo;

    public TerminAnfrage save(TerminAnfrage TerminAnfrage) {
        return repo.save(TerminAnfrage);
    }

    public TerminAnfrage get(Long id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException());
    }

    public List<TerminAnfrage> getAll() {
        Iterable<TerminAnfrage> iterator = repo.findAll();
        List<TerminAnfrage> TerminAnfragen = new ArrayList<TerminAnfrage>();
        for (TerminAnfrage TerminAnfrage : iterator)  TerminAnfragen.add(TerminAnfrage);
        return TerminAnfragen;
    }
}

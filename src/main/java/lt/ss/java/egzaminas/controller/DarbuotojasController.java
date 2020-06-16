package lt.ss.java.egzaminas.controller;

import lt.ss.java.egzaminas.repositories.DarbuotojasRepository;
import lt.ss.java.egzaminas.model.Darbuotojas;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
@RequestMapping(path = "/darbuotojas")
public class DarbuotojasController {

    private final DarbuotojasRepository darbuotojasRepository;


    public DarbuotojasController(DarbuotojasRepository darbuotojasRepository) {
        this.darbuotojasRepository = darbuotojasRepository;
    }
    // viso darbuotoju sarasa nuskaitymas
    @GetMapping
    public List<Darbuotojas> getAll() {
        return darbuotojasRepository.findAll();
    }

    // darbuotoju saraso suriusiavimas
    @GetMapping(path = "/surikiuoti")
    public List<Darbuotojas> getOrdered() {
        return darbuotojasRepository.surikiuoti();
    }

    // darbuotoju skaiciaus skyriuje suskaiciavimas pagal skyriaus pavadinima
    @GetMapping(path = "/{skyrius}")
    public Integer darbuotojuSkyriuje(@PathVariable(value = "skyrius") String skyrius) {
        return darbuotojasRepository.darbuotojuSkyriuje(skyrius);
    }


}

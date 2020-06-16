package lt.ss.java.egzaminas.repositories;

import lt.ss.java.egzaminas.model.Darbuotojas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DarbuotojasRepository extends JpaRepository<Darbuotojas, Integer> {

    /**
     *              Kolekcijos isvedimas
     *
     * @return  -   isrikiuoti darbuotojai didejimo tvarka
     *
     */
    // pagal skyriu,
    // tuomet pagal pareigas,
    // tuomet pagal vardus
    @Query("Select d from Darbuotojas d order by d.skyrius, d.pareigos, d.vardas")
    List<Darbuotojas> surikiuoti();

    //    5.      Vykdymo klasėje sukurkite statinį metodą int darbuotojuSkyriuje(String skyrius)
    //    kuris suskaičiuoja ir gražina kiek tam tikrame skyriuje dirba darbuotojų.

    /**
     *  Darbuotoju skyriuje skaiciavimas
     * @param skyrius
     * @return darbuotoju skaicius
     */

    @Query("Select count(d) from Darbuotojas d where d.skyrius = :skyrius ")
    Integer darbuotojuSkyriuje(String skyrius);

}



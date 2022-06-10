package com.example.proyecto_spring_html_th;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

@Controller
public class PersonController {
    @GetMapping("/PersonCard")
    String getPersonCard(Model model) throws ParseException {
        SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
        Person miPerson = new Person("Rafael", "Nadal", "https://cope-cdnmed.agilecontent.com/resources/jpg/1/0/1603465773101.jpg",
                "Ackerman, Ucrania", formatter1.parse("17/02/1988"));
        String imagen = "https://fs-prod-cdn.nintendo-europe.com/media/images/06_screenshots/games_5/nintendo_switch_6/nswitch_mariostrikersbattleleaguefootball/NSwitch_MarioStrikersBattleLeagueFootball_03.jpg";
        model.addAttribute("persona", miPerson);
        // Generamos un array (lista con thymeleaf)
        model.addAttribute("personas", Arrays.asList(
                new Person("Rafael", "Nadal", "https://www.lecturas.com/medio/2020/09/30/rafa-nadal_bf6bb76f_800x800.jpg",
                        "Ackerman, Ucrania", formatter1.parse("17/02/1988")),
                new Person("Lionel Andres", "Messi", "https://www.fundacionkonex.org/custom/web/data/imagenes/repositorio/2021/03/12/16575/2021031202544061e0e3f25c3041f849de6b510817fb34.jpg",
                        "Ackerman, Ucrania", formatter1.parse("17/02/1988")),
                new Person("Pau", "Gasol", "https://paugasol.com/wp-content/uploads/2020/01/pau-1.jpg",
                        "Ackerman, Ucrania", formatter1.parse("17/02/1988")),
                new Person("Cristiano", "Ronaldo", "https://resize-parismatch.lanmedia.fr/img/var/news/storage/images/paris-match/people-a-z/cristiano-ronaldo/5974922-5-fre-FR/Cristiano-Ronaldo.jpg",
                        "Ackerman, Ucrania", formatter1.parse("17/02/1988"))
        ));
        return "PersonCard";
    }

    @GetMapping("/Person")
    String getPerson(Model model) throws ParseException {
        SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
        Person miPerson = new Person("Rafael", "Nadal", "https://cope-cdnmed.agilecontent.com/resources/jpg/1/0/1603465773101.jpg",
                "Ackerman, Ucrania", formatter1.parse("17/02/1988"));
        String imagen = "https://fs-prod-cdn.nintendo-europe.com/media/images/06_screenshots/games_5/nintendo_switch_6/nswitch_mariostrikersbattleleaguefootball/NSwitch_MarioStrikersBattleLeagueFootball_03.jpg";
        model.addAttribute("persona", miPerson);
        // Generamos un array (lista con thymeleaf)
        model.addAttribute("personas", Arrays.asList(
                new Person("Rafael", "Nadal", "https://www.lecturas.com/medio/2020/09/30/rafa-nadal_bf6bb76f_800x800.jpg",
                        "Ackerman, Ucrania", formatter1.parse("17/02/1988")),
                new Person("Lionel Andres", "Messi", "https://www.fundacionkonex.org/custom/web/data/imagenes/repositorio/2021/03/12/16575/2021031202544061e0e3f25c3041f849de6b510817fb34.jpg",
                        "Ackerman, Ucrania", formatter1.parse("17/02/1988")),
                new Person("Pau", "Gasol", "https://paugasol.com/wp-content/uploads/2020/01/pau-1.jpg",
                        "Ackerman, Ucrania", formatter1.parse("17/02/1988")),
                new Person("Cristiano", "Ronaldo", "https://resize-parismatch.lanmedia.fr/img/var/news/storage/images/paris-match/people-a-z/cristiano-ronaldo/5974922-5-fre-FR/Cristiano-Ronaldo.jpg",
                        "Ackerman, Ucrania", formatter1.parse("17/02/1988"))
        ));
        return "Person";
    }

    @GetMapping("/")
    String getIndex(Model model) throws ParseException {
        Index miIndex = new Index("Esta entrando en el home de mi pagina");
        // Ahora preparo el envío de datos
        model.addAttribute("datosindex",miIndex);
        return "Index";
    }

    @GetMapping("/Contacto")
    String getContacto(Model model) throws ParseException {
        Contacto miContacto = new Contacto("Esta entrando en los contactos de mi pagina");
        // Ahora preparo el envío de datos
        model.addAttribute("datoscontacto",miContacto);
        return "Contacto";
    }

    @GetMapping("/QuienesSomos")
    String getQuienesSomos(Model model) throws ParseException {
        QuienesSomos miQuienesSomos = new QuienesSomos("Esta entrando en los contactos de mi pagina");
        // Ahora preparo el envío de datos
        model.addAttribute("datoscontacto",miQuienesSomos);
        return "QuienesSomos";
    }

    @GetMapping("/Calendar")
    String getCalendar(Model model) throws ParseException{
        EoiCalendar miCalendar = new EoiCalendar("Mi primer calendario");
        model.addAttribute("attr_calendar", miCalendar);
        return "Calendar";
    }

    @RequestMapping("/createCalendar")

    public String createCalendar(EoiCalendar eoiCalendar){
        // Servicio conectado a la BBDD donde puedo controlar la entrada de datos
        // objetoDeLecturaServicio
        // En este ejemplo mostramos por consola en url indicada
        System.out.println("calendario = " + eoiCalendar.getActionText());
        return "Calendar";
    }
}

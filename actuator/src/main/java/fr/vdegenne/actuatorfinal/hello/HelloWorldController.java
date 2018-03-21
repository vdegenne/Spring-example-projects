package fr.vdegenne.actuatorfinal.hello;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWorldController {


    private final String template = "Hellow, %s";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/hello-world")
    /* Commande à Spring de ne pas traduire le modèle dans une vue
     * mais plutôt de d'incruster l'objet retourné directement dans le corps de la réponse.
     * (Utilise "MappingJackson2HttpMessageConverter" de Jackson 2 en interne)
     */
    @ResponseBody
    public Greeting sayHello(@RequestParam(name = "name", required = false, defaultValue = "Stranger") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}

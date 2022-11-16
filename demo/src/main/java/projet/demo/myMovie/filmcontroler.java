package projet.demo.myMovie;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class filmcontroler {
    @GetMapping("/Film/{id}")
    public Films afficherUnFilm(@PathVariable int id){
        Films film = new Films(id=1, "Wallah", id, null);
        return film;
    }
}

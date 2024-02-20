package be.chesteric31.pongservice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PongServiceResource {

    @GetMapping("/pong")
    public ResponseEntity<String> getPong() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body("Pong");
    }
}

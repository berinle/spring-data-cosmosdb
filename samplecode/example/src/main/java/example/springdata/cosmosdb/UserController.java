package example.springdata.cosmosdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/v1/users")
public class UserController {

    //FIXME: don't do this at home :)
    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public ResponseEntity<?> getUsers() {
        Iterable<User> users = userRepository.findAll();
        return ResponseEntity.ok(users);
    }
}

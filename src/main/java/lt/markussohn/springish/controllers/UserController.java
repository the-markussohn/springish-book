package lt.markussohn.springish.controllers;

import lt.markussohn.springish.domain.User;
import lt.markussohn.springish.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

/**
 * @author markussohn
 * 2018-09-24.
 */
@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/", produces = APPLICATION_JSON_UTF8_VALUE)
    public User user() {
        return userService.getById(1L);
    }
}

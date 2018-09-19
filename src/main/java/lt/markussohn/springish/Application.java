package lt.markussohn.springish;

import lt.markussohn.springish.services.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author markussohn
 * 2018-09-20.
 */
public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("context.xml");
        UserService userService = container.getBean("userService", UserService.class);
        System.out.println(userService.getById(1L));
    }
}

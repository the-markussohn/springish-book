package lt.markussohn.config;

import lt.markussohn.springish.services.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * @author markussohn
 * 2018-09-24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RootConfig.class)
public class RootConfigTest {

    @Autowired
    private UserService userService;

    @Test
    public void serviceShouldNotBeNull() {
        assertNotNull(userService);
    }
}
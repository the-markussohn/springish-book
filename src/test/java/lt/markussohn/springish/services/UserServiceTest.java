package lt.markussohn.springish.services;

import lt.markussohn.springish.dao.UserDao;
import lt.markussohn.springish.domain.User;
import lt.markussohn.springish.services.impl.UserServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 * @author markussohn
 * 2018-09-19.
 */
public class UserServiceTest {

    private UserService userService;

    private UserDao userDao;

    @Before
    public void setUp() {
        userDao = mock(UserDao.class);
        userService = new UserServiceImpl(userDao);
        when(userDao.getById(1L)).thenReturn(new User());
    }

    @Test
    public void findUserById() {
        User user = userService.getById(1L);
        verify(userDao, times(1)).getById(1L);
        assertEquals("Dummy", user.getName());
    }
}
package lt.markussohn.springish.services;

import lt.markussohn.springish.dao.UserDao;
import lt.markussohn.springish.domain.User;
import lt.markussohn.springish.services.impl.UserServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

/**
 * @author markussohn
 * 2018-09-19.
 */
class UserServiceTest {

    private UserService userService;

    private UserDao userDao;

    @BeforeEach
    void setUp() {
        userDao = mock(UserDao.class);
        userService = new UserServiceImpl(userDao);
        when(userDao.getById(1L)).thenReturn(new User());
    }

    @Test
    void findUserById() {
        User user = userService.getById(1L);
        verify(userDao, times(1)).getById(1L);
        assertEquals("Dummy", user.getName());
    }
}
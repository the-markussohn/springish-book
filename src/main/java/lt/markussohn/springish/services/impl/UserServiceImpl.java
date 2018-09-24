package lt.markussohn.springish.services.impl;

import lt.markussohn.springish.dao.UserDao;
import lt.markussohn.springish.domain.User;
import lt.markussohn.springish.services.UserService;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * @author markussohn
 * 2018-09-19.
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public User getById(Long id) {
        return userDao.getById(id);
    }
}

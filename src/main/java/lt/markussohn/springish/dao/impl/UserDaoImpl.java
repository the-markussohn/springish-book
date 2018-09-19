package lt.markussohn.springish.dao.impl;

import lt.markussohn.springish.dao.UserDao;
import lt.markussohn.springish.domain.User;

/**
 * @author markussohn
 * 2018-09-19.
 */
public class UserDaoImpl implements UserDao {

    public User getById(Long id) {
        return new User();
    }
}

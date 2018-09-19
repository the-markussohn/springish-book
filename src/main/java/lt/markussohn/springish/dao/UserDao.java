package lt.markussohn.springish.dao;

import lt.markussohn.springish.domain.User;

/**
 * @author markussohn
 * 2018-09-19.
 */
public interface UserDao {
    User getById(Long id);
}

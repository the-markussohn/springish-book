package lt.markussohn.springish.services;

import lt.markussohn.springish.domain.User;

import java.util.Collection;

/**
 * @author markussohn
 * 2018-09-19.
 */
public interface UserService {

    User getById(Long id);
}

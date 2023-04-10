package tms.service.impl;

import lombok.Setter;
import tms.model.Inject;
import tms.model.User;
import tms.repository.JdbcUserRepository;
import tms.service.UserService;

@Setter
public class UserServiceImpl implements UserService {

    @Inject
    private JdbcUserRepository jdbcUserRepository;

    @Override
    public void addUser(User user) {
        jdbcUserRepository.addUser(user);
    }

    @Override
    public User getUserByLogin(String login) {
        return jdbcUserRepository.getUserByLogin(login);
    }

    @Override
    public Long getUserId(String login) {
        return jdbcUserRepository.getUserId(login);
    }

    @Override
    public boolean isVerifiedUser(String login, String password) {
        return getUserByLogin(login) != null;
    }
}
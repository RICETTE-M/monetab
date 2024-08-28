package ci.digitalacademy.monetab.services.Impl;
import ci.digitalacademy.monetab.models.User;
import ci.digitalacademy.monetab.repositories.UserRepository;
import ci.digitalacademy.monetab.services.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    //private final logger log = loggerFactory.getlogger(UserServiceImpl.class);


    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User update(User user) {
        log.info("Request to user{} ", user);

        Optional<User> userOptional = findById(user.getId());
        if (userOptional.isPresent()) {
            User userToUpdate = userOptional.get();
            userToUpdate.setPseudo(user.getPseudo());//mise à joiur du pseudo
            userToUpdate.setPassword(user.getPassword());//mise à jour ou modification password
            return userRepository.save(userToUpdate);
        }
        return user;
    }

    @Override
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }


    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);

    }


}

package dio.aula;

import dio.aula.model.User;  // Import da classe User.
import dio.aula.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        List<User> users = repository.findByNameContaining("João Brito");
        for(User u: users) {
            System.out.println(u);
        }
    }
    private void insertUser(){
        User user = new User();
        user.setName("Carlos Eduardo");
        user.setUsername("cadu");
        user.setPassword("test147");

        repository.save(user);

        for (User u : repository.findAll()) {
            System.out.println(u);
        }
    }
}

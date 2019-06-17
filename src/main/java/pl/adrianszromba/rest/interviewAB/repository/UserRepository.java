package pl.adrianszromba.rest.interviewAB.repository;

import org.springframework.stereotype.Repository;
import pl.adrianszromba.rest.interviewAB.bean.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository implements Service<User> {

    private static List<User> userList = new ArrayList<>();

    static
    {
        userList.add(new User(1L, "Loki", "Fez", LocalDate.now(), "PL-123456789"));
        userList.add(new User(2L, "Marth", "Kent", LocalDate.now(), "PL-123456789"));
        userList.add(new User(3L, "David", "Brick", LocalDate.now(), "PL-123456789"));
    }

    @Override
    public List<User> getAll() {
        return userList;
    }

    public List<User> getAllWithDetail() {
        return userList;
    }
}

package pl.adrianszromba.rest.interviewAB.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.adrianszromba.rest.interviewAB.bean.User;
import pl.adrianszromba.rest.interviewAB.model.response.UserRest;
import pl.adrianszromba.rest.interviewAB.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<UserRest> getUsers() {
        List<UserRest> returnValue = new ArrayList<>();
        List<User> user = userRepository.getAll();

        for(User u : user) {
            UserRest target= new UserRest();
            BeanUtils.copyProperties(u , target);
            returnValue.add(target);

            BeanUtils.copyProperties(u, returnValue);
        }

        return returnValue;
    }

    @GetMapping("/detail")
    public List<User> getUsersWithDetail() {
        return userRepository.getAllWithDetail();
    }
}

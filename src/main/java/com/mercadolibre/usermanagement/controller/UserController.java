package com.mercadolibre.usermanagement.controller;
import com.mercadolibre.usermanagement.model.User;
import com.mercadolibre.usermanagement.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/user")
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = {   RequestMethod.GET, RequestMethod.POST,
                                                                RequestMethod.PUT, RequestMethod.DELETE,
                                                                RequestMethod.OPTIONS, RequestMethod.HEAD,
                                                                RequestMethod.PATCH})
public class UserController {
    private UserService userService;
    public UserController(UserService userService){
        this.userService = userService;

    }

    @GetMapping("/getUsersByStatus")
    public List<User> getUsersByStatus(@RequestParam("usersStatus") String statusId){

        return userService.getUsersByStatus(statusId);
    }
    @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
    public boolean saveUser(@RequestBody User user) {

        return userService.saveUser(user);

    }
    @GetMapping("/getFirstUserByStatus")
    public User getFirstUserByStatus(@RequestParam("userStatus") String userStatus) {
        return userService.getFirstUserByStatus(userStatus);
    }



}

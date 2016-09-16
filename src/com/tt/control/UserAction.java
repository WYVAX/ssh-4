package com.tt.control;

import com.opensymphony.xwork2.ActionSupport;
import com.tt.model.User;
import com.tt.service.UserService;

/**
 * Created by lx7ly on 9/16/16.
 */
public class UserAction extends ActionSupport {

    private User user;
    private UserService userService;

    public String execute() throws Exception {
        System.out.println("-------->TestAction.execute()");
        return super.execute();
    }

    public String login() throws Exception {
        userService.register(user);
        return "success";
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}

package com.tt;

import com.opensymphony.xwork2.ActionSupport;
import com.tt.model.User;
import com.tt.service.UserService;

/**
 * Created by lx7ly on 8/31/16.
 */
public class TestAction extends ActionSupport {

    private UserService userService;

    public String execute() throws Exception {
        System.out.println("-------->TestAction.execute()");
        userService.register(null);
        return super.execute();
    }

    public String login() throws Exception{
        userService.register(null);
        return "success";
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}

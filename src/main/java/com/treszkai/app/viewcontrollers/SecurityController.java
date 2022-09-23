package com.treszkai.app.viewcontrollers;


import com.treszkai.app.service.SecurityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

@Controller
public class SecurityController {
    private static final Logger LOGGER = LoggerFactory.getLogger(SecurityController.class);        // az osztályhoz elkérek egy loggert,

    private static SecurityService securityService;

    public SecurityController(SecurityService securityService) {
        this.securityService = securityService;
    }

    public void Logout(){ securityService.logout();  }

}

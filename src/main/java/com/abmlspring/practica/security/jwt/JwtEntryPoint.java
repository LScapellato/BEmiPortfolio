
package com.abmlspring.practica.security.jwt;

//comprueba si hay token sino responde 401

import java.io.IOException;
import org.slf4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;


@Component
public class JwtEntryPoint implements AuthenticationEntryPoint {
    
    private final static Logger logger = LoggerFactory.getLogger(JwtEntryPoint.class);
    @Override
    public void commence(HttpServletRequest req, HttpServletResponse res, AuthenticationException excep) throws IOException, ServletException {
        logger.error("Falla en el método commence");//usamos logger para probar la aplicacion
        //responde
        res.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Usuario no autorizado");
        System.out.println("excep = " + excep);
    
    }
    
}

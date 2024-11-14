package com.adopiluv.service;

import com.adopiluv.model.Usuario;
import com.adopiluv.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class userService implements UserDetailsService {

    @Autowired
    private IUsuarioRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario user= repository.findByNome(username);

        List<GrantedAuthority> roles=new ArrayList<>();
        roles.add(new SimpleGrantedAuthority("Admin"));

        UserDetails userdetail=new User(user.getNome(),user.getClave(),roles);

        return userdetail;

    }
}

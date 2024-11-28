package com.quanxiaoha.weblog.jwt.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * @author : Kanade
 * @date : 2024-11-28 13:13
 */
@Service
@Slf4j
public class UserDetailServiceImpl implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //从数据库查询
        // ...

        //暂时先写死，密码为kanade,这里填写的密文，数据库中也是存储此种格式
        //authorities 用于指定角色，这里写死为ADMIN管理员
        return User.withUsername("kanade")
                .password("$2a$10$62xEexQwdSjHPx5v8q9vCOCW3xY8Z5G5B/BFTdLjEqGMGr0IZaKB6")
                .authorities("ADMIN")
                .build();
    }

}

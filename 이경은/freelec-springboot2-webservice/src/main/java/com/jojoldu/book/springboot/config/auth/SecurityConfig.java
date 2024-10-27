package com.jojoldu.book.springboot.config.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@RequiredArgsConstructor
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    private final CustomOAuth2UserService customOAuth2UserService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().headers().frameOptions().disable()
                .and().authorizeRequests()
                // 누구나 접근 가능
                .antMatchers("/", "/css/**", "/images/**", "/js/**", "/h2-console/**").permitAll()
                //User 권한을 가진 사용자만 접근 가능
                .antMatchers("/api/v1/**").hasRole(Role.USER.name())
                // 나머지 요청은 인증 필요
                .anyRequest().authenticated()
                // 로그아웃 후 / 경로로 리다이렉트
                .and().logout().logoutSuccessUrl("/")
                // OAuth2 로그인 성공 후 사용자 정보 처리하는 서비스 설정
                .and().oauth2Login().userInfoEndpoint().userService(customOAuth2UserService);
    }
}

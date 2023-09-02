package com.example.kakaoLogin1.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class KakaoResult {
    Long id;
    String email;
    String nickname;
}
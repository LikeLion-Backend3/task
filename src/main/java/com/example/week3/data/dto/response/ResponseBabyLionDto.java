package com.example.week3.data.dto.response;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ResponseBabyLionDto {
    private Long pid;
    private String name;
    private String email;
    private String number;
    private String password;
    private String profile;
}

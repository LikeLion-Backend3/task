package com.example.week3.data.dto.request;

import io.swagger.annotations.ApiModel;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@ApiModel
public class RequestBabyLionDto {
    private String name;
    private String email;
    private String number;
    private String password;
    private String profile;
}

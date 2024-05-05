package com.example.week3.data.dto.request;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class RequestChangeNameDto {
    private String email;
    private String name;
}

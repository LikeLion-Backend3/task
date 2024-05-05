package com.example.week3.data.service;

import com.example.week3.data.dto.request.RequestBabyLionDto;
import com.example.week3.data.dto.request.RequestChangeNameDto;
import com.example.week3.data.dto.response.ResponseBabyLionDto;

public interface BabyLionService {
    ResponseBabyLionDto getBabyLion(String email) throws Exception;

    ResponseBabyLionDto saveBabyLion(RequestBabyLionDto requestBabyLionDto);

    ResponseBabyLionDto changeBabyLionName(RequestChangeNameDto changeNameRequestDto) throws Exception;

    void deleteBabyLion(String email) throws Exception;
}

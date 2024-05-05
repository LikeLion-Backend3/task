package com.example.week3.data.controller;

import com.example.week3.data.dto.request.RequestBabyLionDto;
import com.example.week3.data.dto.request.RequestChangeNameDto;
import com.example.week3.data.dto.response.ResponseBabyLionDto;
import com.example.week3.data.service.BabyLionService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/baby-lion")
public class BabyLionController {
    private final BabyLionService babyLionService;

    @GetMapping("/get")
    public ResponseEntity<ResponseBabyLionDto> getBabyLion(@RequestParam String email) throws Exception {
        ResponseBabyLionDto responseBabyLionDto = babyLionService.getBabyLion(email);

        return ResponseEntity.status(HttpStatus.OK).body(responseBabyLionDto);
    }

    @PostMapping("/post")
    public ResponseEntity<ResponseBabyLionDto> createBabyLion(@RequestBody RequestBabyLionDto requestBabyLionDto){
        ResponseBabyLionDto responseBabyLionDto = babyLionService.saveBabyLion(requestBabyLionDto);

        return ResponseEntity.status(HttpStatus.OK).body(responseBabyLionDto);
    }
    @PutMapping("/put")
    public ResponseEntity<ResponseBabyLionDto> changeBabyLionName(@RequestBody RequestChangeNameDto requestChangeNameDto) throws Exception {
        ResponseBabyLionDto responseBabyLionDto = babyLionService.changeBabyLionName(requestChangeNameDto);

        return ResponseEntity.status(HttpStatus.OK).body(responseBabyLionDto);
    }
    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteBabyLion(String email) throws Exception {
        babyLionService.deleteBabyLion(email);

        return ResponseEntity.status(HttpStatus.OK).body("Deleted Successfully");
    }
}

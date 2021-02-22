package com.reach.dev.cognito.ms.api.controller;

import com.reach.dev.cognito.ms.api.request.APIRequest;
import com.reach.dev.cognito.ms.api.response.APIResponse;
import com.reach.dev.cognito.ms.api.service.APIService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/api/v1")
public class APIController {

    @Autowired
    APIService apiService;

    @PostMapping(path = "/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<APIResponse> saveReach(@RequestBody APIRequest request) {
        log.info("APIController::saveReach : request {}", request.toJson());
        return apiService.processingService(request.getMessage());
    }
}

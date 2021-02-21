package com.reach.dev.cognito.ms.api.service;

import com.reach.dev.cognito.ms.api.response.APIResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class APIService {

    public ResponseEntity<APIResponse> processingService(String message) {
        APIResponse apiResponse = new APIResponse();
        if (message.equals("117")) {
            apiResponse.setMessageProcessed("Left reach!");
            log.info("APIService::processingService : response {}", apiResponse.toJson());

            return new ResponseEntity<>(apiResponse, HttpStatus.OK);
        } else {
            apiResponse.setMessageProcessed("Wrong Spartan ID");
            log.warn("APIService::processingService : response {}", apiResponse.toJson());

            return new ResponseEntity<>(apiResponse, HttpStatus.I_AM_A_TEAPOT);
        }
    }
}

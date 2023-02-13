package com.pedro.strproducer.resources;

import com.pedro.strproducer.services.StringProducerServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/producer")
public class StringProducerResource {

    private final StringProducerServices producerServices;

    @PostMapping
    public ResponseEntity<?> sendMessage(@RequestBody String message) {
       producerServices.sendMessage(message);
       return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}

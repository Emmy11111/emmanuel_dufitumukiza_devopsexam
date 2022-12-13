package com.example.demo.controller;

import com.example.demo.InvalidOperationException;
import com.example.demo.dto.DoMathRequest;
import com.example.demo.services.MathOperatorImpl;
import com.example.demo.utils.JsonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@CrossOrigin(origins = { "http://localhost:3000"})
@RestController
public class MathController {

    @Autowired
    MathOperatorImpl mathOp;

    @PostMapping("/doMath")
    public ResponseEntity doMath(@Valid @RequestBody DoMathRequest dto) throws InvalidOperationException {
        return ResponseEntity.status(HttpStatus.OK)
                .body(new JsonResponse(true, mathOp.doMath(dto.getOperand1(), dto.getOperand2(), dto.getOperation())));
    }
}

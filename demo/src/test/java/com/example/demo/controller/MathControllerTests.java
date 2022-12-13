package com.example.demo.controller;
import org.junit.jupiter.api.Test;
import com.example.demo.InvalidOperationException;
import com.example.demo.dto.DoMathRequest;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.ResponseEntity;
import static org.junit.Assert.assertEquals;

public class MathControllerTests {
    @InjectMocks
    MathController mathController;
    @Test
    public void testMathController() throws InvalidOperationException {
        DoMathRequest doMathRequest = new DoMathRequest("+",8,4);
        double expected = 12;

        ResponseEntity result = mathController.doMath(doMathRequest);
        assertEquals(expected,result);
    }
}

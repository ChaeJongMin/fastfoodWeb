package com.example.demo.exception;
import com.example.demo.exception.errorCode.RefreshErrorCode;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class GlobalException extends RuntimeException {
    private final RefreshErrorCode refreshErrorCode;
}

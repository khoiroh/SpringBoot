package com.data.tokoonline.exception;

import com.data.tokoonline.response.ResponseHelper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHadler {
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<?> notFound(NotFoundException notFoundException){
        return ResponseHelper.eror(notFoundException.getMessage(), HttpStatus.NOT_FOUND);}

    @ExceptionHandler(InternalEror.class)
    public ResponseEntity<?> internalEror(InternalEror internalEror){
        return ResponseHelper.eror(internalEror.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);}

    @ExceptionHandler(EmailCondition.class)
    public ResponseEntity<?> EmailCondition(EmailCondition emailCondition){
        return ResponseHelper.eror(emailCondition.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);}
}

package com.data.tokoonline.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseHelper {

    public static <T> ResponseEntity<CommonResponse<T>> ok(T data) {
        CommonResponse<T> response = new CommonResponse<>();
        response.setMassage("SUCCESS");
        response.setStatus("200");
        response.setData(data);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    public static <T> ResponseEntity<CommonResponse<T>> eror(String eror, HttpStatus httpStatus){
        CommonResponse<T> response = new CommonResponse<>();
        response.setStatus(String.valueOf(httpStatus.value()));
        response.setMassage(httpStatus.name());
        response.setData((T) eror);
        return new ResponseEntity<>(response, httpStatus);
    }
}

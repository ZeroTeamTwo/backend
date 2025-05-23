package com.graydang.app.global.common.model.enums;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum BaseResponseStatus {

    /**
     * 1000 : 요청 성공
     */
    SUCCESS(true, HttpStatus.OK,1000, "요청에 성공하였습니다."),

    /**
     * 2000 : RequestParam exception
     */
    METHOD_ARGUMENT_TYPE_MISMATCH(false, HttpStatus.UNAUTHORIZED, 2001, "Request Parameter나 Path Variable의 유형이 불일치합니다."),
    HTTP_METHOD_TYPE_MISMATCH(false, HttpStatus.METHOD_NOT_ALLOWED, 2002, "지원되지 않는 Http Method입니다.");


    private final boolean isSuccess;
    @JsonIgnore
    private final HttpStatus httpStatus;
    private final int responseCode;
    private final String responseMessage;
}

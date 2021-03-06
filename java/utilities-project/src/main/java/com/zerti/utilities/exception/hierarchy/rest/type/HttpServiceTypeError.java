package com.zerti.utilities.exception.hierarchy.rest.type;

import org.springframework.http.HttpStatus;

public enum HttpServiceTypeError {

    //no se han incluido los errores de cliente deprecados org.springframework.http.HttpStatus
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR),
    NOT_IMPLEMENTED(HttpStatus.NOT_IMPLEMENTED),
    BAD_GATEWAY(HttpStatus.BAD_GATEWAY),
    SERVICE_UNAVAILABLE(HttpStatus.SERVICE_UNAVAILABLE),
    GATEWAY_TIMEOUT(HttpStatus.GATEWAY_TIMEOUT),
    HTTP_VERSION_NOT_SUPPORTED(HttpStatus.HTTP_VERSION_NOT_SUPPORTED),
    VARIANT_ALSO_NEGOTIATES(HttpStatus.VARIANT_ALSO_NEGOTIATES),
    INSUFFICIENT_STORAGE(HttpStatus.INSUFFICIENT_STORAGE),
    LOOP_DETECTED(HttpStatus.LOOP_DETECTED),
    BANDWIDTH_LIMIT_EXCEEDED(HttpStatus.BANDWIDTH_LIMIT_EXCEEDED),
    NOT_EXTENDED(HttpStatus.NOT_EXTENDED),
    NETWORK_AUTHENTICATION_REQUIRED(HttpStatus.NETWORK_AUTHENTICATION_REQUIRED);

    private final HttpStatus status;

    HttpServiceTypeError(HttpStatus status) {
        this.status = status;
    }

    public HttpStatus getStatus(){
        return status;
    }

}



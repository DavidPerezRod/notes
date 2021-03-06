package me.dabiz.exception.info.category.http.error;

import org.springframework.http.HttpStatus;

public enum RedirectionTypeError implements HttpErrorCode {

    //no se han incluido los errores de cliente deprecados org.springframework.http.HttpStatus
    MULTIPLE_CHOICES(HttpStatus.MULTIPLE_CHOICES),
    MOVED_PERMANENTLY(HttpStatus.MOVED_PERMANENTLY),
    FOUND(HttpStatus.FOUND),
    SEE_OTHER(HttpStatus.SEE_OTHER),
    NOT_MODIFIED(HttpStatus.NOT_MODIFIED),
    TEMPORARY_REDIRECT(HttpStatus.TEMPORARY_REDIRECT),
    PERMANENT_REDIRECT(HttpStatus.PERMANENT_REDIRECT);

    private final HttpStatus status;

    RedirectionTypeError(HttpStatus status) {
        this.status = status;
    }

    @Override
    public int getHttpStatusCode() {
        return this.status.value();
    }

    @Override
    public String getHttpStatusDescription() {
        return this.status.name();
    }
}

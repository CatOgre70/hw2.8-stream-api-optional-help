package sky.pro.hw28streamapioptionalhelp.model;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class ErrorInNameException extends RuntimeException{
    public ErrorInNameException(String message) {
        super(message);
    }
}

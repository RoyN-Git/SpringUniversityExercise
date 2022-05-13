package ADVICE;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorDetail {
    private String error;
    private String description;
}
@RestController
@ControllerAdvice //aop->exception
public class SchoolRestException {
    //which exception class was fired
    @ExceptionHandler(value = {SchoolException.class})
    //what to return in response
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    public ErrorDetail handleException(Exception e) {
        return new ErrorDetail("update error", e.getMessage());
    }
}

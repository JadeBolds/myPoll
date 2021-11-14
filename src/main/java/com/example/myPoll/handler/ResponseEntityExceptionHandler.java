//package com.example.myPoll.handler;
//
//import com.example.myPoll.dtos.ErrorDetail;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.http.converter.HttpMessageNotReadableException;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.context.request.WebRequest;
//import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
//
//import java.util.Date;
//
//@ControllerAdvice
//public class RestExceptionHandler<MethodArgumentNot, manve> extends ResponseEntityExceptionHandler {
//    @Override
//    protected ResponseEntity<Object> handleHttpMessageNotReadable(
//            HttpMessageNotReadableException ex, HttpHeaders headers,
//            HttpStatus status, WebRequest request) {
//
//        ErrorDetail errorDetail = new ErrorDetail();
//        errorDetail.setTimeStamp(new Date().getTime());
//        errorDetail.setStatus(status.value());
//        errorDetail.setTitle("Message Not Readable");
//        errorDetail.setDetail(ex.getMessage());
//        errorDetail.setDeveloperMessage(ex.getClass().getName());
//
//        return handleExceptionInternal(ex, errorDetail, headers, status, request);
//    }
//
//    public ResponseEntity<Object> handleMethodArgumentNotValid(manve) {
//        return handleMethodArgumentNotValid(, , , );
//    }
//
//    public ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNot ValidException manve, HttpHeaders headers, HttpStatus status, WebRequest request) {
//
//        // implementation removed for brevity
//
//        Object errorDetail = null;
//        Exception manve = null;
//        return handleExceptionInternal(manve, null, headers, status, request);
//    }
//}

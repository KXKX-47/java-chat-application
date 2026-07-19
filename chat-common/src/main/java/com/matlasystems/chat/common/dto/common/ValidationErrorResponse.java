package com.matlasystems.chat.common.dto.common;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ValidationErrorResponse {

    private int status;
    private String error;
    private String message;
    private LocalDateTime timestamp;
    private List<FieldValidationError> fieldErrors;

    public ValidationErrorResponse() {
        this.timestamp = LocalDateTime.now();
        this.fieldErrors = new ArrayList<>();
    }

    public ValidationErrorResponse(int status, String error, String message) {

        this.status = status;
        this.error = error;
        this.message = message;
        this.timestamp = LocalDateTime.now();
        this.fieldErrors = new ArrayList<>();
    }

    public void addFieldError(String field, String message) {

        fieldErrors.add(new FieldValidationError(field,message));
    }

    public int getStatus(){
        return status;
    }

    public void setStatus(int status) {

        this.status = status;
    }

    public String getError(){

        return error;
    }

    public void setError(String error){

        this.error = error;
    }

    public String getMessage(){

        return message;
    }

    public void setMessage(String message) {

        this.message = message;
    }

    public LocalDateTime getTimestamp(){

        return  timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {

        this.timestamp = timestamp;
    }

    public List<FieldValidationError> getFieldErrors() {
        return fieldErrors;
    }

    public void setFieldErrors(List<FieldValidationError>fieldErrors){
        this.fieldErrors = fieldErrors;
    }

    public static class FieldValidationError {

        private String field;
        private String message;
        public FieldValidationError(){

        }

        public FieldValidationError(String field, String message) {

            this.field = field;
            this.message = message;
        }

        public String getField(){
            return field;
        }

        public void setField(String field){

            this.field = field;
        }

        public String getMessage(){
            return message;
        }

        public void setMessage(String message){

            this.message = message;
        }
    }
}
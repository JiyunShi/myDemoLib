package com.example.demoLib.rest;

import com.example.demoLib.exception.FaultCode;
import com.example.demoLib.exception.SystemException;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseResponseBody {

    private String error;
    private String description;

    public BaseResponseBody() {

    }

    public BaseResponseBody(FaultCode faultCode) {
        this.setFromFaultCode(faultCode);
    }

    public BaseResponseBody(FaultCode faultCode, String fullDescription) {
        this.setFromFaultCodeAndDescription(faultCode, fullDescription);
    }

    public BaseResponseBody(SystemException exception) {
        this.setFromSystemException(exception);
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFromFaultCode(FaultCode faultCode) {
        this.setError(faultCode.getCode());
        this.setDescription(faultCode.getDescription());
    }

    public void setFromFaultCodeAndDescription(FaultCode faultCode, String fullDescription) {
        this.setError(faultCode.getCode());
        this.setDescription(fullDescription);
    }

    public void setFromSystemException(SystemException exception) {
        this.setFromFaultCodeAndDescription(exception.getFaultCode(), exception.getMessage());
    }

    @Override
    public String toString() {
        return "BaseResponseBody [error=" + error + ", description=" + description + "]";
    }



}

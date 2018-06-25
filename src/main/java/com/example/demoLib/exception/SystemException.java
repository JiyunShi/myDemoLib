package com.example.demoLib.exception;

@SuppressWarnings("serial")
public class SystemException extends Throwable{

    private FaultCode faultCode;

    public SystemException(FaultCode faultCode, Throwable cause, Object... params) {
        super(formatMessage(faultCode, params), cause);
        this.faultCode = faultCode;
    }

    public SystemException(FaultCode faultCode, Object... params) {
        super(formatMessage(faultCode, params));
        this.faultCode = faultCode;
    }

    public FaultCode getFaultCode() {
        return faultCode;
    }

    public String getFaultCodeAndMessage() {
        return String.format("%s: %s", this.faultCode.getCode(), this.getMessage());
    }

    private static String formatMessage(FaultCode faultCode, Object... params) {
        String formattedMsg;
        try {
            formattedMsg = String.format(faultCode.getDescription(), params);
        } catch (Exception exc) {
            formattedMsg = faultCode.getDescription();
        }
        return formattedMsg;
    }

}

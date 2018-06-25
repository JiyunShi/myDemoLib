package com.example.demoLib.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;

public class FaultCode {
    public static enum Severity {
        ERROR("E"), FATAL("F");

        private final String codeSuffix;

        Severity(String codeSuffix) {
            this.codeSuffix = codeSuffix;
        }

        public String toCodeSuffix() {
            return this.codeSuffix;
        }
    }

    private String codeBase;
    private String description;
    private Severity severity = Severity.ERROR;

    public String getCodeBase() {
        return codeBase;
    }

    public void setCodeBase(String code) {
        this.codeBase = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Severity getSeverity() {
        return severity;
    }

    public String getCode() {
        return codeBase + severity.toCodeSuffix();
    }

    @Override
    public String toString() {
        return getCode() + ": " + description;
    }

    public FaultCode fatal() {
        FaultCode faultCode = new FaultCode();
        faultCode.setCodeBase(codeBase);
        faultCode.setDescription(description);
        faultCode.severity = Severity.FATAL;
        return faultCode;
    }

    private static final Logger logger = LoggerFactory.getLogger(FaultCode.class);

    public HttpStatus getStatusCode() {
        HttpStatus httpStatus = null;

        String statusCode = codeBase.substring(codeBase.length() - 3, codeBase.length());
        try {
            httpStatus = HttpStatus.valueOf(Integer.valueOf(statusCode));
        } catch (Exception exception) {
            logger.error("Could not create HTTP status code from value \"" + statusCode + "\".", exception);
        }

        return httpStatus;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codeBase == null) ? 0 : codeBase.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((severity == null) ? 0 : severity.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof FaultCode)) {
            return false;
        }
        FaultCode other = (FaultCode) obj;
        if (codeBase == null) {
            if (other.codeBase != null) {
                return false;
            }
        } else if (!codeBase.equals(other.codeBase)) {
            return false;
        }
        if (description == null) {
            if (other.description != null) {
                return false;
            }
        } else if (!description.equals(other.description)) {
            return false;
        }
        if (severity != other.severity) {
            return false;
        }
        return true;
    }
}
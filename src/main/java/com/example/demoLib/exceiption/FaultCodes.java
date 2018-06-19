package com.example.demoLib.exceiption;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "faultcode")
public class FaultCodes {
	private final FaultCode serviceAuthorizationFailure = new FaultCode();
	private final FaultCode serviceSystemFailure = new FaultCode();
	private final FaultCode unexpectedSystemFailure = new FaultCode();
	private final FaultCode temporarySystemFailure = new FaultCode();
	private final FaultCode itemServiceUnavailable = new FaultCode();
	private final FaultCode vendorServiceUnavailable = new FaultCode();
	private final FaultCode orgStructureServiceUnavailable = new FaultCode();
	private final FaultCode offerServiceUnavailable = new FaultCode();
	private final FaultCode validationServiceUnavailable = new FaultCode();
	private final FaultCode edealServiceUnavailable = new FaultCode();
	private final FaultCode itemServiceError = new FaultCode();
	private final FaultCode offerServiceError = new FaultCode();
	private final FaultCode vendorServiceError = new FaultCode();
	private final FaultCode orgStructureServiceError = new FaultCode();
	private final FaultCode promoSaveServiceError = new FaultCode();
	private final FaultCode promoGetServiceError = new FaultCode();

	private final FaultCode invalidJson = new FaultCode();
	private final FaultCode notFound = new FaultCode();
	private final FaultCode invalidStatusLink = new FaultCode();
	private final FaultCode invalidInputData = new FaultCode();
	private final FaultCode invalidSearchCriteria = new FaultCode();
	private final FaultCode invalidVersion = new FaultCode();
	private final FaultCode deprecatedFeature = new FaultCode();

	private final FaultCode dbConnectionUnavailable = new FaultCode();
	private final FaultCode dbSelectFailure = new FaultCode();
	private final FaultCode dbInsertFailure = new FaultCode();
	private final FaultCode dbUpdateFailure = new FaultCode();
	private final FaultCode dbDeleteFailure = new FaultCode();
	private final FaultCode dbConnectionCloseFailure = new FaultCode();
	private final FaultCode dbRecoverable = new FaultCode();
	private final FaultCode duplicateOfferAlreadyLinked = new FaultCode();
	private final FaultCode offerAlreadyUnlinked = new FaultCode();

	private final FaultCode queueConnectionUnavailable = new FaultCode();
	private final FaultCode queueReadFailure = new FaultCode();
	private final FaultCode queueWriteFailure = new FaultCode();
	private final FaultCode queueQuotaExceeded = new FaultCode();
	private final FaultCode queueMessageTypeInvalid = new FaultCode();
	private final FaultCode queueMessageContentInvalid = new FaultCode();
	
	// AppConfig.java
	private final FaultCode failureInInitialContext = new FaultCode();
	private final FaultCode failureInConnectionFactory = new FaultCode();
	private final FaultCode failureInDestination = new FaultCode();
	
	//JmsProducer.java
	private final FaultCode failureInProducer = new FaultCode();
	
	//PromoAllowanceServiceImpl.java
	private final FaultCode offerAlreadyCancelled = new FaultCode();
	
	//PromoItemServiceImpl.java
    private final FaultCode cicNotSetup = new FaultCode();
    
    private final FaultCode duplicateUserIds = new FaultCode();
    
    private final FaultCode divisionNotValid = new FaultCode();
    
    private final FaultCode userRoleNotValid = new FaultCode();
    
	private final FaultCode noValidVendorForPromo = new FaultCode();
	private final FaultCode cicNotSetupForPromo = new FaultCode();

	public FaultCode getDuplicateUserIds() {
        return duplicateUserIds;
    }

    public FaultCode getDivisionNotValid() {
        return divisionNotValid;
    }

    public FaultCode getUserRoleNotValid() {
        return userRoleNotValid;
    }

    public FaultCode getCicNotSetup() {
		return cicNotSetup;
	}

	public FaultCode getDbRecoverable() {
		return dbRecoverable;
	}

	public FaultCode getOfferAlreadyCancelled() {
		return offerAlreadyCancelled;
	}

	public FaultCode getFailureInInitialContext() {
		return failureInInitialContext;
	}
	
	public FaultCode getFailureInConnectionFactory() {
		return failureInConnectionFactory;
	}

	public FaultCode getFailureInDestination() {
		return failureInDestination;
	}

	public FaultCode getFailureInProducer() {
		return failureInProducer;
	}

	public FaultCode getOfferServiceError() {
		return offerServiceError;
	}

	public FaultCode getOfferAlreadyUnlinked() {
		return offerAlreadyUnlinked;
	}
	public FaultCode getServiceAuthorizationFailure() {
		return serviceAuthorizationFailure;
	}
	public FaultCode getServiceSystemFailure() {
		return serviceSystemFailure;
	}
	public FaultCode getUnexpectedSystemFailure() {
		return unexpectedSystemFailure;
	}
	public FaultCode getTemporarySystemFailure() {
		return temporarySystemFailure;
	}
	public FaultCode getInvalidJson() {
		return invalidJson;
	}
	public FaultCode getNotFound() {
		return notFound;
	}
	public FaultCode getInvalidInputData() {
		return invalidInputData;
	}
	public FaultCode getInvalidSearchCriteria() {
		return invalidSearchCriteria;
	}
	public FaultCode getInvalidVersion() {
		return invalidVersion;
	}
	public FaultCode getDeprecatedFeature() {
		return deprecatedFeature;
	}
	public FaultCode getDbConnectionUnavailable() {
		return dbConnectionUnavailable;
	}
	public FaultCode getDbSelectFailure() {
		return dbSelectFailure;
	}
	public FaultCode getDbInsertFailure() {
		return dbInsertFailure;
	}
	public FaultCode getDbUpdateFailure() {
		return dbUpdateFailure;
	}
	public FaultCode getDbDeleteFailure() {
		return dbDeleteFailure;
	}
	public FaultCode getDbConnectionCloseFailure() {
		return dbConnectionCloseFailure;
	}
	public FaultCode getQueueConnectionUnavailable() {
		return queueConnectionUnavailable;
	}
	public FaultCode getQueueReadFailure() {
		return queueReadFailure;
	}
	public FaultCode getQueueWriteFailure() {
		return queueWriteFailure;
	}
	public FaultCode getQueueQuotaExceeded() {
		return queueQuotaExceeded;
	}
	public FaultCode getQueueMessageTypeInvalid() {
		return queueMessageTypeInvalid;
	}
	public FaultCode getQueueMessageContentInvalid() {
		return queueMessageContentInvalid;
	}
	public FaultCode getItemServiceUnavailable() {
		return itemServiceUnavailable;
	}
	public FaultCode getVendorServiceUnavailable() {
		return vendorServiceUnavailable;
	}
	public FaultCode getOrgStructureServiceUnavailable() {
		return orgStructureServiceUnavailable;
	}
	public FaultCode getOfferServiceUnavailable() {
		return offerServiceUnavailable;
	}
	public FaultCode getValidationServiceUnavailable() {
		return validationServiceUnavailable;
	}
	public FaultCode getEdealServiceUnavailable() {
		return edealServiceUnavailable;
	}
	public FaultCode getItemServiceError() {
		return itemServiceError;
	}
	public FaultCode getVendorServiceError() {
		return vendorServiceError;
	}
	public FaultCode getOrgStructureServiceError() {
		return orgStructureServiceError;
	}
	public FaultCode getPromoSaveServiceError() {
		return promoSaveServiceError;
	}
	public FaultCode getPromoGetServiceError() {
		return promoGetServiceError;
	}

	public FaultCode getInvalidStatusLink() {
		return invalidStatusLink;
	}
	public FaultCode getDuplicateOfferAlreadyLinked() {
		return duplicateOfferAlreadyLinked;
	}

	public FaultCode getNoValidVendorForPromo() {
		return noValidVendorForPromo;
	}
	public FaultCode getCicNotSetupForPromo() {
		return cicNotSetupForPromo;
	}
}

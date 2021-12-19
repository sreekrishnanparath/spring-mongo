package com.marshalmongo.marshalpos.bean;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Parameters")
public class Parameters {

    @Id
    String id;

    @Indexed(unique = true)
    String applicationName;

    @Indexed(unique = true)
    String applicationCode;

    @Indexed(unique = true)
    String countryCode;

    String environment;

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public Parameters() {
    }

    public Parameters(String id, String applicationName, String applicationCode, String countryCode) {
        this.id = id;
        this.applicationName = applicationName;
        this.applicationCode = applicationCode;
        this.countryCode = countryCode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getApplicationCode() {
        return applicationCode;
    }

    public void setApplicationCode(String applicationCode) {
        this.applicationCode = applicationCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public String toString() {
        return "Parameters{" +
                "parameterId=" + id +
                ", applicationName='" + applicationName + '\'' +
                ", applicationCode='" + applicationCode + '\'' +
                ", countryCode='" + countryCode + '\'' +
                '}';
    }
}

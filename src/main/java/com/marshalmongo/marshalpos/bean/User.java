package com.marshalmongo.marshalpos.bean;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;


@Document("User")
public class User {

    @Id
    private String id;

    @Indexed(unique = true)
    private String userId;

    @Indexed(unique = true)
    private String username;

    private Date expiryDate;

    private Parameters parameters;

    public Parameters getParameters() {
        return parameters;
    }

    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public User(String id, String userId, String username, Parameters parameters,Date expiryDate) {
        super();
        this.id = id;
        this.userId = userId;
        this.username = username;
        this.parameters = parameters;
        this.expiryDate = expiryDate;
    }
}
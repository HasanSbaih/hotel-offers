
package com.expedia.exercise.hotel.offers.api.gateway.ports.pojos;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "persona",
    "userId"
})
public class UserInfo implements Serializable
{

    @JsonProperty("persona")
    private Persona persona;
    @JsonProperty("userId")
    private String userId;
    private final static long serialVersionUID = 3419924417455004212L;

    @JsonProperty("persona")
    public Persona getPersona() {
        return persona;
    }

    @JsonProperty("persona")
    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

}

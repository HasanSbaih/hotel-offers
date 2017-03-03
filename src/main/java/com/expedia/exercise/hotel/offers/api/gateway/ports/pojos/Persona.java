
package com.expedia.exercise.hotel.offers.api.gateway.ports.pojos;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "personaType"
})
public class Persona implements Serializable
{

    @JsonProperty("personaType")
    private String personaType;
    private final static long serialVersionUID = 2682760075399446008L;

    @JsonProperty("personaType")
    public String getPersonaType() {
        return personaType;
    }

    @JsonProperty("personaType")
    public void setPersonaType(String personaType) {
        this.personaType = personaType;
    }

}

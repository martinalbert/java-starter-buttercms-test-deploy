package com.buttercms.springstarterbuttercms.model.landingpage;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

public class Field {
    private String type;
    @JsonProperty("fields")
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonTypeInfo(
            use = JsonTypeInfo.Id.NAME,
            include = JsonTypeInfo.As.EXTERNAL_PROPERTY,
            property = "type",
            visible = true
    )
    @JsonSubTypes({
            @JsonSubTypes.Type(value = BasicSection.class, name = "hero"),
            @JsonSubTypes.Type(value = ImageSection.class, name = "two_column_with_image"),
            @JsonSubTypes.Type(value = FeaturesSection.class, name = "features"),
            @JsonSubTypes.Type(value = TestimonialsSection.class, name = "testimonials")
    })
    private Section section;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }
}

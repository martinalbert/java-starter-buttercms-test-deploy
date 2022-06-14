package com.buttercms.springstarterbuttercms.model.landingpage;

import com.fasterxml.jackson.annotation.JsonProperty;


public abstract class Section {
    @JsonProperty("scroll_anchor_id")
    private String scrollAnchorId;

    public Section() {
    }

    public Section(String scrollAnchorId) {
        this.scrollAnchorId = scrollAnchorId;
    }

    public String getScrollAnchorId() {
        return scrollAnchorId;
    }

    public void setScrollAnchorId(String scrollAnchorId) {
        this.scrollAnchorId = scrollAnchorId;
    }
}

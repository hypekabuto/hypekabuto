package com.hypekabuto.entity;

import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 友情链接
 * </p>
 *
 * @author mjy
 * @since 2023-11-01
 */
@Repository
public class Link implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 友情链接id
     */
    private String linkId;

    /**
     * 链接标题
     */
    private String linkTitle;

    /**
     * 友情链接地址
     */
    private String linkUrl;

    /**
     * 友情链接logo
     */
    private String linkLogoUrl;

    /**
     * 友情链接发布时间
     */
    private LocalDateTime linkAddTime;

    public String getLinkId() {
        return linkId;
    }

    public void setLinkId(String linkId) {
        this.linkId = linkId;
    }

    public String getLinkTitle() {
        return linkTitle;
    }

    public void setLinkTitle(String linkTitle) {
        this.linkTitle = linkTitle;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public String getLinkLogoUrl() {
        return linkLogoUrl;
    }

    public void setLinkLogoUrl(String linkLogoUrl) {
        this.linkLogoUrl = linkLogoUrl;
    }

    public LocalDateTime getLinkAddTime() {
        return linkAddTime;
    }

    public void setLinkAddTime(LocalDateTime linkAddTime) {
        this.linkAddTime = linkAddTime;
    }

    @Override
    public String toString() {
        return "Link{" +
            "linkId = " + linkId +
            ", linkTitle = " + linkTitle +
            ", linkUrl = " + linkUrl +
            ", linkLogoUrl = " + linkLogoUrl +
            ", linkAddTime = " + linkAddTime +
        "}";
    }
}

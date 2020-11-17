package com.example.mynewsbyramy;

public class News {

    private String mSectionName;
    private String mWebTitle;
    private String mWebPublicationDate;
    private String mWebUrl;
    private String mAuthor;
    private String mThumbnailUrl;

    public News(String sectionName, String webTitle, String webPublicationDate, String webUrl) {
        this.mSectionName = sectionName;
        this.mWebTitle = webTitle;
        this.mWebPublicationDate = webPublicationDate;
        this.mWebUrl = webUrl;
    }

    public News(String sectionName, String webTitle, String webPublicationDate, String webUrl, String thumbnailUrl) {
        this.mSectionName = sectionName;
        this.mWebTitle = webTitle;
        this.mWebPublicationDate = webPublicationDate;
        this.mWebUrl = webUrl;
        this.mThumbnailUrl = thumbnailUrl;
    }


    public String getSectionName() {
        return mSectionName;
    }

    public void setSectionName(String sectionName) {
        this.mSectionName = sectionName;
    }

    public String getWebTitle() {
        return mWebTitle;
    }

    public void setWebTitle(String webTitle) {
        this.mWebTitle = webTitle;
    }

    public String getWebPublicationDate() {
        return mWebPublicationDate;
    }

    public void setWebPublicationDate(String webPublicationDate) {
        this.mWebPublicationDate = webPublicationDate;
    }

    public String getWebUrl() {
        return mWebUrl;
    }

    public void setWebUrl(String webUrl) {
        this.mWebUrl = webUrl;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public void setAuthor(String author) {
        this.mAuthor = author;
    }

    public String getmThumbnailUrl() {
        return mThumbnailUrl;
    }

    public void setmThumbnailUrl(String mThumbnailUrl) {
        this.mThumbnailUrl = mThumbnailUrl;
    }

}

package com.example.touristo.Activies;
import android.net.Uri;

public class Item {
    private int resourceId;
    private String description;
    private Uri videoUri;

    public Item(int resourceId, String description, Uri videoUri) {
        this.resourceId = resourceId;
        this.description = description;
        this.videoUri = videoUri;
    }



    public int getResourceId() {
        return resourceId;
    }

    public String getDescription() {
        return description;
    }
    public Uri getVideoUri() {
        return videoUri;
    }
}

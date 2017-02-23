package com.example.bram.reddit.redditfeed.recyclerview;

import android.databinding.BindingAdapter;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.bram.reddit.api.model.RedditPost;
import com.example.bram.reddit.lib.MyView;
import com.example.bram.reddit.lib.ViewModel;
import com.squareup.picasso.Picasso;

/**
 * Created by bram on 2/22/17.
 */

public class PostViewModel extends ViewModel<MyView> {
    private RedditPost redditPost;
    
    public RedditPost getRedditPost() {
        return redditPost;
    }

    public void update(RedditPost redditPost) {
        this.redditPost = redditPost;
        notifyChange();
    }
    
    @BindingAdapter({"bind:imageUrl"})
    public static void loadImage(ImageView view, String imageUrl) {
        Picasso.with(view.getContext())
                .load(imageUrl)
                .into(view);
    }

}

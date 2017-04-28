package com.fiepi.mastodon;

interface LinkListener {
    void onViewTag(String tag);
    void onViewAccount(String id);
}

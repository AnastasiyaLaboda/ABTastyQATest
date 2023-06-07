package com.ab_tasty.navigation;

import io.netty.util.internal.StringUtil;

public enum ABtastyUrls {
    HOME(StringUtil.EMPTY_STRING),
    LOGIN("login"),
    SSO_LOGIN("ssologin");

    ABtastyUrls(String url) {
        this.url = url;
    }

    private String url;

    public String getUrl() {
        return url;
    }
}

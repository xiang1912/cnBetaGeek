package com.didikee.cnbetareader.network.services;

import retrofit2.http.GET;
import retrofit2.http.Url;
import rx.Observable;

/**
 * Created by didik 
 * Created time 2017/2/8
 * Description: 获取默认的文章列表
 */

public interface DefaultArticleList {
    @GET
    Observable<String> getDefaultArticleList(@Url String url);
}

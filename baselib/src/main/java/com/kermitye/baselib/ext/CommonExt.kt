package com.kermitye.baselib.ext

import com.kermitye.baselib.net.BaseConvert
import com.kermitye.baselib.net.BaseResp
import com.kermitye.baselib.net.HttpObserver
import com.trello.rxlifecycle2.LifecycleProvider
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by kermitye
 * Date: 2018/8/30 14:47
 * Desc:
 */

 fun <T> Observable<T>.excute(subscriber: HttpObserver<T>, lifecycleProvider: LifecycleProvider<*>) {
    this.subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
//            .compose(lifecycleProvider.bindToLifecycle())
            .subscribe(subscriber)
}

/*
    扩展数据转换
 */
fun <T> Observable<BaseResp<T>>.convert():Observable<T>{
    return this.flatMap(BaseConvert())
}

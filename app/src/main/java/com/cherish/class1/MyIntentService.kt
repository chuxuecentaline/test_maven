package com.cherish.class1

import android.app.IntentService
import android.content.Intent

/**
 * author : cherish on 2020/9/10
 * createTime :17:22
 * desc:
 * modify time:
 * modify by :
 */

class MyIntentService :IntentService {

    constructor() : super("MyIntentService")

    override fun onHandleIntent(intent: Intent?) {
        println("make sure")
    }

}
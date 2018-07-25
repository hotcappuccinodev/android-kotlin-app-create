/*
 * Copyright 2018. nekocode (nekocode.cn@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.nekocode.gank.broadcast

import android.content.Context

import cn.nekocode.meepo.annotation.Action

/**
 * @author nekocode (nekocode.cn@gmail.com)
 */
interface BroadcastRouter {
    companion object {
        const val FETCH_SUC = "fetch_suc"
    }

    @Action(FETCH_SUC)
    fun tellFetchSuc(context: Context)
}

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

package cn.nekocode.gank.backend.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

/**
 * @author nekocode (nekocode.cn@gmail.com)
 */
@Parcelize
data class MeiziPic(
    @SerializedName("_id") override val id: String,
    @SerializedName("type") val type: String,
    @SerializedName("url") val url: String,
    @SerializedName("who") val who: String
) : WithId, Parcelable

package com.example.navigationcomponenets

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.math.BigDecimal

@Parcelize
data class Amount(val amount: BigDecimal): Parcelable {

}

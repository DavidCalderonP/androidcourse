package com.example.mvvm.models

import android.os.Build
import android.os.Parcel
import android.os.Parcelable
import androidx.annotation.RequiresApi
import java.time.LocalDate


data class Student(val name: String?, val lastname: String?, val age: LocalDate, val dev: Boolean = true) : Parcelable {

    @RequiresApi(Build.VERSION_CODES.O)
    constructor(parcel: Parcel): this(
        parcel.readString(),
        parcel.readString(),
        parcel.readSerializable() as LocalDate,
        parcel.readByte() != 0.toByte())

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeString(name)
        dest.writeString(lastname)
        dest.writeSerializable(age)
        dest.writeByte(if (dev) 1 else 0)
    }

    override fun describeContents(): Int = 0

    companion object CREATOR : Parcelable.Creator<Student>{
        @RequiresApi(Build.VERSION_CODES.O)
        override fun createFromParcel(source: Parcel): Student = Student(source)

        override fun newArray(size: Int)= arrayOfNulls<Student?>(size)
    }
}
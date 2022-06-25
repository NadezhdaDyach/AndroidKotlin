package ru.dachkovska.androidkotlin

class Repository {
    private  val weatherList:List<Weather>
    init {
        weatherList=listOf(Weather("Москва",15));
    }
}
package com.demo.webrtc.models


import com.google.gson.annotations.SerializedName

data class Weather(
    @SerializedName("current")
    var current: Current,
    @SerializedName("daily")
    var daily: List<Daily>,
    @SerializedName("hourly")
    var hourly: List<Hourly>,
    @SerializedName("lat")
    var lat: Double,
    @SerializedName("lon")
    var lon: Double,
    @SerializedName("minutely")
    var minutely: List<Minutely>,
    @SerializedName("timezone")
    var timezone: String,
    @SerializedName("timezone_offset")
    var timezoneOffset: Int
) {
    data class Current(
        @SerializedName("clouds")
        var clouds: Int,
        @SerializedName("dew_point")
        var dewPoint: Double,
        @SerializedName("dt")
        var dt: Int,
        @SerializedName("feels_like")
        var feelsLike: Double,
        @SerializedName("humidity")
        var humidity: Int,
        @SerializedName("pressure")
        var pressure: Int,
        @SerializedName("sunrise")
        var sunrise: Int,
        @SerializedName("sunset")
        var sunset: Int,
        @SerializedName("temp")
        var temp: Double,
        @SerializedName("uvi")
        var uvi: Double,
        @SerializedName("visibility")
        var visibility: Int,
        @SerializedName("weather")
        var weather: List<Weather>,
        @SerializedName("wind_deg")
        var windDeg: Int,
        @SerializedName("wind_speed")
        var windSpeed: Double
    ) {
        data class Weather(
            @SerializedName("description")
            var description: String,
            @SerializedName("icon")
            var icon: String,
            @SerializedName("id")
            var id: Int,
            @SerializedName("main")
            var main: String
        )
    }

    data class Daily(
        @SerializedName("clouds")
        var clouds: Int,
        @SerializedName("dew_point")
        var dewPoint: Double,
        @SerializedName("dt")
        var dt: Int,
        @SerializedName("feels_like")
        var feelsLike: FeelsLike,
        @SerializedName("humidity")
        var humidity: Int,
        @SerializedName("moon_phase")
        var moonPhase: Double,
        @SerializedName("moonrise")
        var moonrise: Int,
        @SerializedName("moonset")
        var moonset: Int,
        @SerializedName("pop")
        var pop: Int,
        @SerializedName("pressure")
        var pressure: Int,
        @SerializedName("rain")
        var rain: Double,
        @SerializedName("sunrise")
        var sunrise: Int,
        @SerializedName("sunset")
        var sunset: Int,
        @SerializedName("temp")
        var temp: Temp,
        @SerializedName("uvi")
        var uvi: Double,
        @SerializedName("weather")
        var weather: List<Weather>,
        @SerializedName("wind_deg")
        var windDeg: Int,
        @SerializedName("wind_gust")
        var windGust: Double,
        @SerializedName("wind_speed")
        var windSpeed: Double
    ) {
        data class FeelsLike(
            @SerializedName("day")
            var day: Double,
            @SerializedName("eve")
            var eve: Double,
            @SerializedName("morn")
            var morn: Double,
            @SerializedName("night")
            var night: Double
        )

        data class Temp(
            @SerializedName("day")
            var day: Double,
            @SerializedName("eve")
            var eve: Double,
            @SerializedName("max")
            var max: Double,
            @SerializedName("min")
            var min: Double,
            @SerializedName("morn")
            var morn: Double,
            @SerializedName("night")
            var night: Double
        )

        data class Weather(
            @SerializedName("description")
            var description: String,
            @SerializedName("icon")
            var icon: String,
            @SerializedName("id")
            var id: Int,
            @SerializedName("main")
            var main: String
        )
    }

    data class Hourly(
        @SerializedName("clouds")
        var clouds: Int,
        @SerializedName("dew_point")
        var dewPoint: Double,
        @SerializedName("dt")
        var dt: Int,
        @SerializedName("feels_like")
        var feelsLike: Double,
        @SerializedName("humidity")
        var humidity: Int,
        @SerializedName("pop")
        var pop: Int,
        @SerializedName("pressure")
        var pressure: Int,
        @SerializedName("temp")
        var temp: Double,
        @SerializedName("uvi")
        var uvi: Double,
        @SerializedName("visibility")
        var visibility: Int,
        @SerializedName("weather")
        var weather: List<Weather>,
        @SerializedName("wind_deg")
        var windDeg: Int,
        @SerializedName("wind_gust")
        var windGust: Double,
        @SerializedName("wind_speed")
        var windSpeed: Double
    ) {
        data class Weather(
            @SerializedName("description")
            var description: String,
            @SerializedName("icon")
            var icon: String,
            @SerializedName("id")
            var id: Int,
            @SerializedName("main")
            var main: String
        )
    }

    data class Minutely(
        @SerializedName("dt")
        var dt: Int,
        @SerializedName("precipitation")
        var precipitation: Int
    )
}
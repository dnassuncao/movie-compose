package br.com.dnassuncao.movieapp.core.remote.model

import com.google.gson.annotations.SerializedName

data class MovieResult(
    @SerializedName("first_air_date")
    val firstAirDate: String = "",
    @SerializedName("overview")
    val overview: String = "",
    @SerializedName("original_language")
    val originalLanguage: String = "",
    @SerializedName("genre_ids")
    val genreIds: List<Integer>?,
    @SerializedName("poster_path")
    val posterPath: String = "",
    @SerializedName("origin_country")
    val originCountry: List<String>?,
    @SerializedName("backdrop_path")
    val backdropPath: String = "",
    @SerializedName("original_name")
    val originalName: String = "",
    @SerializedName("popularity")
    val popularity: Double = 0.0,
    @SerializedName("vote_average")
    val voteAverage: Double = 0.0,
    @SerializedName("name")
    val name: String = "",
    @SerializedName("id")
    val id: Int = 0,
    @SerializedName("vote_count")
    val voteCount: Int = 0
)
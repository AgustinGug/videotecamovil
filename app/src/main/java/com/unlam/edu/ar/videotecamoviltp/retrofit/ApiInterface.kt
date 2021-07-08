package com.unlam.edu.ar.videotecamoviltp.retrofit

import com.unlam.edu.ar.videotecamoviltp.model.Genres
import com.unlam.edu.ar.videotecamoviltp.model.MovieGenre
import com.unlam.edu.ar.videotecamoviltp.model.Movies
import com.unlam.edu.ar.videotecamoviltp.model.*
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {
    companion object {
        const val API_KEY : String = "75baaa3bb4acacdaa5f27d938049e8ce"
        const val LANGUAGE_SPANISH : String = "language=es"
    }

    @GET("movie?api_key=$API_KEY&query=movie&$LANGUAGE_SPANISH")
    fun getMovie(
        @Query("query") title: String
    ): Call<Movies>

    @GET("movie?api_key=$API_KEY&$LANGUAGE_SPANISH&with_genres=genre_id")
    fun getGenreID(
        @Query("with_genres") id: Int
    ): Call<Genres>

    @GET("movie_id?$API_KEY%$LANGUAGE_SPANISH")
    fun getMovieID(
        @Query("movie_id") id: Int
    ): Call<MovieGenre>
  }
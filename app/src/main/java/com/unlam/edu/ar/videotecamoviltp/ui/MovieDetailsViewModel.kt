package com.unlam.edu.ar.videotecamoviltp.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.unlam.edu.ar.videotecamoviltp.data.FavEntityRepository
import com.unlam.edu.ar.videotecamoviltp.model.MovieFav_Details_Model
import com.unlam.edu.ar.videotecamoviltp.repositories.MoviesRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MovieDetailsViewModel(private val moviesRepository:MoviesRepository, private val favEntityRepository: FavEntityRepository):ViewModel() {
    val movieDetailsLiveData = MutableLiveData<MovieFav_Details_Model>()

    fun getMovieDetailsById(movieId: Int) {
        viewModelScope.launch(Dispatchers.IO) {
            moviesRepository.getMovieID(
                (movieId),
                {
                    movieDetailsLiveData.value = it
                }
            )
        }
    }

    fun movieIntoFavList(movieId: Int, userId: Int): Boolean {
        return favEntityRepository.movieIdIntoFavList(movieId, userId)
    }

    fun addOrDeleteNewMovieFav(movieId: Int, userId: Int) {
        favEntityRepository.addOrDeleteNewMovieFav(movieId, userId)
    }
}
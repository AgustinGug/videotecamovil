package com.unlam.edu.ar.videotecamoviltp.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.unlam.edu.ar.videotecamoviltp.domain.entities.FavEntity
import com.unlam.edu.ar.videotecamoviltp.domain.entities.UserEntity


@Database(
    version = 3,
    entities = [UserEntity::class, FavEntity::class]
)


abstract class VideotecaDatabase : RoomDatabase() {
    abstract fun userDAO(): UserDAO
    abstract fun favDAO() : FavDAO

    companion object {
        private const val DATABASE_NAME = "videoteca_db"
        private var INSTANCE: VideotecaDatabase? = null

        fun getInstance(context: Context): VideotecaDatabase {

            INSTANCE ?: synchronized(this) {
                INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        VideotecaDatabase::class.java,
                        DATABASE_NAME
                )
                        .allowMainThreadQueries()
                        .build()
            }

            return INSTANCE!!
        }
    }
}
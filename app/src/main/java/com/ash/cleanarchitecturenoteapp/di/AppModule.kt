package com.ash.cleanarchitecturenoteapp.di

import android.app.Application
import androidx.room.Room
import com.ash.cleanarchitecturenoteapp.features.data.data_source.NoteDatabase
import com.ash.cleanarchitecturenoteapp.features.data.repository.NoteRepositoryImpl
import com.ash.cleanarchitecturenoteapp.features.domain.repository.NoteRepository
import com.ash.cleanarchitecturenoteapp.features.domain.use_case.DeleteNote
import com.ash.cleanarchitecturenoteapp.features.domain.use_case.GetNotes
import com.ash.cleanarchitecturenoteapp.features.domain.use_case.NoteUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideNoteDatabase(app: Application): NoteDatabase{
        return Room.databaseBuilder(
            app,
            NoteDatabase::class.java,
            NoteDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(db: NoteDatabase): NoteRepository{
        return NoteRepositoryImpl(db.noteDao)
    }

    @Provides
    @Singleton
    fun provideNoteUseCases(repository: NoteRepository): NoteUseCases{
        return NoteUseCases(
            getNotes = GetNotes(repository),
            deleteNote = DeleteNote(repository)
        )
    }
}
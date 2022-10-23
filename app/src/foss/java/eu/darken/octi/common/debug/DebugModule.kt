package eu.darken.octi.common.debug

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import eu.darken.octi.common.debug.autoreport.AutomaticBugReporter
import eu.darken.octi.common.debug.autoreporting.FossAutoReporting
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
abstract class DebugModule {
    @Binds
    @Singleton
    abstract fun autoreporting(foss: FossAutoReporting): AutomaticBugReporter
}
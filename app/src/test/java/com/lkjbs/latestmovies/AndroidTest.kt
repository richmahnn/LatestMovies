package com.lkjbs.latestmovies

import android.app.Application
import android.content.Context
import com.lkjbs.latestmovies.core.platform.BaseActivity
import org.junit.runner.RunWith
import org.mockito.Mockito.mock
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

/**
 * Base class for Android tests. Inherit from it to create test cases which contain android
 * framework dependencies or components.
 *
 * @see UnitTest
 */
@RunWith(RobolectricTestRunner::class)
@Config(constants = BuildConfig::class,
    application = AndroidTest.ApplicationStub::class)
abstract class AndroidTest {

    fun activityContext(): Context = mock(BaseActivity::class.java)

    internal class ApplicationStub : Application()

}
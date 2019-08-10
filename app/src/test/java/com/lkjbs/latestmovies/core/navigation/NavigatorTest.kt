package com.lkjbs.latestmovies.core.navigation

import com.lkjbs.latestmovies.AndroidTest
import com.lkjbs.latestmovies.features.login.Authenticator
import com.nhaarman.mockitokotlin2.verify
import com.nhaarman.mockitokotlin2.whenever
import org.junit.Before
import org.junit.Test
import org.mockito.Mock

class NavigatorTest : AndroidTest() {

    private lateinit var navigator: Navigator

    @Mock lateinit var authenticator: Authenticator

    @Before
    fun setUp() {
        navigator = Navigator(authenticator)
    }

//    @Test
//    fun `should forward user to login screen`() {
//        whenever(authenticator.userLoggedIn()).thenReturn(false)
//
//        navigator.showMain(activityContext())
//
//        verify(authenticator.userLoggedIn())
//    }

}
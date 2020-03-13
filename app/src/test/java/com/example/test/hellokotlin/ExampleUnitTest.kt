package com.example.test.hellokotlin

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.android.AndroidElement
import io.appium.java_client.remote.AndroidMobileCapabilityType
import io.appium.java_client.remote.MobileCapabilityType
import org.junit.AfterClass
import org.openqa.selenium.remote.DesiredCapabilities
import java.net.URL
import android.support.v4.accessibilityservice.AccessibilityServiceInfoCompat.getCapabilities
import org.openqa.selenium.By
import org.openqa.selenium.ScreenOrientation
import java.net.MalformedURLException


import java.util.UUID


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest() {



    protected var driver: AndroidDriver<AndroidElement>? = null
    var dc = DesiredCapabilities()

    private val accessKey =
        "eyJ4cC51IjoxNTI4OTgzLCJ4cC5wIjo0NCwieHAubSI6Ik1UVTFPREE0TWpZd09EUXdNZyIsImFsZyI6IkhTMjU2In0.eyJleHAiOjE4NzM0NDI2MDgsImlzcyI6ImNvbS5leHBlcml0ZXN0In0.u9y5sCl8Hsvcmns3l4s2tCk5ZoOtlmk86Xeg-5S_gt0"

    internal var boundary = UUID.randomUUID().toString()

    @Before
    @Throws(MalformedURLException::class)
    fun setUp() {
        dc.setCapability("testName-roja", "Quick Start Android Native Demo")
        dc.setCapability("accessKey", accessKey)
        val multiLink = UUID.randomUUID()
        dc.setCapability("multiTestId", multiLink)
       // dc.setCapability("deviceQuery", "@os='android' and @category='PHONE'")
        dc.setCapability("deviceName","samsung SM-N950F -- GC CIoT");
       // dc.setCapability(MobileCapabilityType.APP, "cloud:com.experitest.ExperiBank/.LoginActivity")
       dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.vodafone.smartlife")
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".activities.SplashActivity")
        //dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "/.gui.activities.SplashActivity")
        driver = AndroidDriver(URL("https://vfdevicecloud.vodafone.com/wd/hub"), dc)
    }


   /* @Test
    fun addition_isCsorrect() {
        assertEquals(4, 2 + 2)

    }*/

    @Test
    fun quickStartAndroidNativeDemo() {
         println("application launched")
val getstarted = driver!!.findElement(By.xpath("//*[@text='Get started']"))
    getstarted.click()
        lock.wait(5000)
        val continueButton = driver!!.findElement(By.xpath("//*[@text='Continue']"))
        continueButton.click()
        //driver!!.openNotifications()
       // driver!!.quit()


    }

}


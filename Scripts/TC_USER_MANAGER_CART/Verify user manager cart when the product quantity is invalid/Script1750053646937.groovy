import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

CustomKeywords.'auth_package.login.loginMethod'(email, password)

WebUI.waitForPageLoad(20)

WebUI.scrollToElement(findTestObject('User_Manager_Cart/Page_Think Pro_Home/a_view_product_detail'), 20)

WebUI.click(findTestObject('User_Manager_Cart/Page_Think Pro_Home/a_view_product_detail'))

WebUI.click(findTestObject('User_Manager_Cart/Page_product_detail/button_add_product_to_cart'))

WebUI.waitForElementVisible(findTestObject('User_Manager_Cart/Page_product_detail/div_notification_when_add_product_to_cart'), 
    10)

notification_content = WebUI.getText(findTestObject('User_Manager_Cart/Page_product_detail/div_notification_content'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyMatch(notification_content, notification_after_add_product_to_cart, false)

WebUI.click(findTestObject('User_Manager_Cart/Page_product_detail/span_view_cart_btn'))

for (int i = 0; i < 10; i++) {
    WebUI.click(findTestObject('User_Manager_Cart/Page_cart/div_plus'))

    WebUI.delay(0.2)

    if (WebUI.waitForAlert(1, FailureHandling.OPTIONAL)) {
       def alertText = WebUI.getAlertText()

        if (alertText == expected_notification) {
            WebUI.comment("Alert text khớp, kết thúc test case tại đây.")
            com.kms.katalon.core.util.KeywordUtil.markPassed("Test case passed và dừng tại đây.")
            return
        } else {
            WebUI.verifyMatch(alertText, expected_notification, false)
        }

        break
    }
}

for (int i = 0; i < 10; i++) {
    WebUI.click(findTestObject('User_Manager_Cart/Page_cart/div_minus'))

    WebUI.delay(0.2)

    if (WebUI.waitForAlert(1, FailureHandling.OPTIONAL)) {
        def alertText = WebUI.getAlertText()

        WebUI.verifyMatch(alertText, expected_notification, false)

        break
    }
}


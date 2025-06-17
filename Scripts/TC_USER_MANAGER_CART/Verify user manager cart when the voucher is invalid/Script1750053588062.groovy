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

WebUI.click(findTestObject('Object Repository/User_Manager_Cart/Page_Think Pro_Home/a_view_product_detail'))

WebUI.click(findTestObject('Object Repository/User_Manager_Cart/Page_product_detail/button_add_product_to_cart'))

WebUI.waitForElementVisible(findTestObject('User_Manager_Cart/Page_product_detail/div_notification_when_add_product_to_cart'), 
    10)

notification_content = WebUI.getText(findTestObject('User_Manager_Cart/Page_product_detail/div_notification_content'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyMatch(notification_content, notification_after_add_product_to_cart, false)

WebUI.click(findTestObject('Object Repository/User_Manager_Cart/Page_product_detail/span_view_cart_btn'))

WebUI.click(findTestObject('Object Repository/User_Manager_Cart/Page_cart/div_plus'))

WebUI.click(findTestObject('Object Repository/User_Manager_Cart/Page_cart/div_minus'))

WebUI.setText(findTestObject('Object Repository/User_Manager_Cart/Page_cart/input_ma_voucher'), voucher)

WebUI.click(findTestObject('Object Repository/User_Manager_Cart/Page_cart/button_ap_dung_voucher'))

WebUI.waitForElementPresent(findTestObject('User_Manager_Cart/Page_cart/div_notification_voucher_content'), 10)

notification_voucher_text = WebUI.getText(findTestObject('User_Manager_Cart/Page_cart/div_notification_voucher_content'))

WebUI.verifyMatch(notification_voucher_text, notification_voucher_content, false)


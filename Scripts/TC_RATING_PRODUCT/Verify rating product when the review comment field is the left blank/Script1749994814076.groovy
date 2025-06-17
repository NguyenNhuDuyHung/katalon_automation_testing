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

WebUI.scrollToElement(findTestObject('Rating_Product/Page_Think Pro_home/a_view_product_detail'), 10)

WebUI.click(findTestObject('Object Repository/Rating_Product/Page_Think Pro_home/a_view_product_detail'))

WebUI.waitForPageLoad(10)

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Rating_Product/Page_product_detail/button_view_rating_tab'), 15)

WebUI.scrollToElement(findTestObject('Rating_Product/Page_product_detail/button_view_rating_tab'), 10)

WebUI.click(findTestObject('Object Repository/Rating_Product/Page_product_detail/button_view_rating_tab'))

WebUI.scrollToElement(findTestObject('Rating_Product/Page_product_detail/button_rating'), 20)

WebUI.click(findTestObject('Object Repository/Rating_Product/Page_product_detail/icon_star'))

WebUI.setText(findTestObject('Object Repository/Rating_Product/Page_product_detail/textarea_review_comment'), review_comment)

WebUI.click(findTestObject('Object Repository/Rating_Product/Page_product_detail/button_rating'))

WebUI.waitForAlert(10)

alertText = WebUI.getAlertText()

WebUI.verifyMatch(alertText, expected_notification, false)

WebUI.acceptAlert()


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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:3000/')

WebUI.click(findTestObject('Object Repository/Register/Page_Think Pro_Home/a_Login'))

WebUI.click(findTestObject('Object Repository/Register/Page_Login/a_register_now'))

WebUI.setText(findTestObject('Object Repository/Register/Page_Register/input_NG K_name'), fullname)

WebUI.setText(findTestObject('Object Repository/Register/Page_Register/input_NG K_email'), email)

WebUI.setText(findTestObject('Object Repository/Register/Page_Register/input_NG K_phone'), phone)

WebUI.click(findTestObject('Register/Page_Register/select_-- city'), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Register/Page_Register/select_-- city', 
        [('variable') : city]), city, true)

WebUI.click(findTestObject('Register/Page_Register/select_-- district'), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Register/Page_Register/select_-- district', 
        [('variable') : district]), district, true)

WebUI.click(findTestObject('Register/Page_Register/select_-- ward'), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Register/Page_Register/select_-- ward', 
        [('variable') : locate]), locate, true)

WebUI.setText(findTestObject('Object Repository/Register/Page_Register/textarea_NG K_address'), detail_location)

WebUI.setText(findTestObject('Object Repository/Register/Page_Register/input_NG K_password'), password)

WebUI.setText(findTestObject('Object Repository/Register/Page_Register/input_NG K_confirmPassword'), confirm_password)

WebUI.click(findTestObject('Object Repository/Register/Page_Register/button_ng k'))

WebUI.waitForPageLoad(3)

WebUI.verifyElementText(findTestObject('Register/Page_Register/div_notification_register', [('variable') : expected_error]), 
    expected_error)


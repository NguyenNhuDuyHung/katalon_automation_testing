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

CustomKeywords.'user_action_product.action.addProductToCard'()

WebUI.click(findTestObject('User_Order/Page_cart/a_Tien_hanh_thanh_toan'))

WebUI.setText(findTestObject('User_Order/Page_Checkout/input__fullName'), username)

WebUI.setText(findTestObject('User_Order/Page_Checkout/input__phone'), phone)

WebUI.setText(findTestObject('User_Order/Page_Checkout/input__detail_location'), detail_location)

WebUI.click(findTestObject('User_Order/Page_Checkout/select_-- city'), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('User_Order/Page_Checkout/select_-- city'), city, true)

WebUI.click(findTestObject('User_Order/Page_Checkout/select_-- district'), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('User_Order/Page_Checkout/select_-- district'), district, true)

WebUI.click(findTestObject('User_Order/Page_Checkout/select_-- ward'), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('User_Order/Page_Checkout/select_-- ward'), ward, true)

WebUI.click(findTestObject('User_Order/Page_Checkout/select_-- district'))

WebUI.click(findTestObject('User_Order/Page_Checkout/input_Checkbox_rules'))

WebUI.click(findTestObject('User_Order/Page_Checkout/button_checkout'))


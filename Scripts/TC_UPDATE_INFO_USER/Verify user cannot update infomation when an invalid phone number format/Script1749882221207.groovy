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

CustomKeywords.'auth_package.login.loginMethod'(email_login, password_login)

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Update_Info_User/Page_Think Pro - Trang ch/button_user_name'))

WebUI.setText(findTestObject('Update_Info_User/Page_Thng tin ti khon/input_H_user_fullname'), name_update)

WebUI.setText(findTestObject('Update_Info_User/Page_Thng tin ti khon/input_S_phone'), phone_update)

WebUI.click(findTestObject('Update_Info_User/Page_Thng tin ti khon/select_-- city'))

WebUI.selectOptionByValue(findTestObject('Update_Info_User/Page_Thng tin ti khon/select_-- city', [('variable') : city_update]), 
    city_update, true)

WebUI.click(findTestObject('Update_Info_User/Page_Thng tin ti khon/select_-- district'))

WebUI.selectOptionByValue(findTestObject('Update_Info_User/Page_Thng tin ti khon/select_-- district', [('variable') : district_update]), 
    district_update, true)

WebUI.click(findTestObject('Update_Info_User/Page_Thng tin ti khon/select_-- ward'))

WebUI.selectOptionByValue(findTestObject('Update_Info_User/Page_Thng tin ti khon/select_-- ward', [('variable') : locate_update]), 
    locate_update, true)

WebUI.setText(findTestObject('Update_Info_User/Page_Thng tin ti khon/textarea_1_detail_location'), detail_locate_update)

WebUI.click(findTestObject('Update_Info_User/Page_Thng tin ti khon/button_update_info'))

WebUI.waitForPageLoad(3)

WebUI.verifyElementText(findTestObject('Update_Info_User/Page_Thng tin ti khon/div_notification_user_info', [('variable') : expected_notification]), 
    expected_notification)


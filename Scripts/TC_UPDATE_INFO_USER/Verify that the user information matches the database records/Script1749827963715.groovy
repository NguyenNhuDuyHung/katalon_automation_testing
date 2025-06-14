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

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://localhost:3000/')

WebUI.click(findTestObject('Update_Info_User/Page_Think Pro - Trang ch/button_login'))

WebUI.setText(findTestObject('Update_Info_User/Page_ng nhp/input_NG NHP_email'), email_login)

WebUI.setText(findTestObject('Update_Info_User/Page_ng nhp/input_NG NHP_password'), password_login)

WebUI.click(findTestObject('Update_Info_User/Page_ng nhp/button_ng nhp'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Update_Info_User/Page_Think Pro - Trang ch/button_user_name'))

String fullname_ui = WebUI.getAttribute(findTestObject('Update_Info_User/Page_Thng tin ti khon/input_H_user_fullname'), 
    'value')

WebUI.verifyMatch(fullname_ui, name_database, false)

phone_ui = WebUI.getAttribute(findTestObject('Update_Info_User/Page_Thng tin ti khon/input_S_phone'), 'value')

WebUI.verifyMatch(phone_ui, phone_database, false)

WebUI.verifyOptionSelectedByValue(findTestObject('Update_Info_User/Page_Thng tin ti khon/select_-- Chn TnhThnh'), city_database, 
    false, 0)

WebUI.verifyOptionSelectedByValue(findTestObject('Update_Info_User/Page_Thng tin ti khon/select_-- Chn QunHuyn'), district_database, 
    false, 0)

WebUI.verifyOptionSelectedByValue(findTestObject('Update_Info_User/Page_Thng tin ti khon/select_-- Chn PhngX'), locate_database, 
    false, 0)

detail_locate_ui = WebUI.getAttribute(findTestObject('Update_Info_User/Page_Thng tin ti khon/textarea_1_detail_location'), 
    'value')

WebUI.verifyMatch(detail_locate_database, detail_locate_ui, false)


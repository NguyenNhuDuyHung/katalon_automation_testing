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

WebUI.click(findTestObject('Object Repository/Update_Info_User/Page_Think Pro - Trang ch/button_login'))

WebUI.setText(findTestObject('Object Repository/Update_Info_User/Page_ng nhp/input_NG NHP_email'), 'test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Update_Info_User/Page_ng nhp/input_NG NHP_password'), 'D7Y+m3IaFBbsNDk26VHqfg==')

WebUI.click(findTestObject('Object Repository/Update_Info_User/Page_ng nhp/button_login'))

WebUI.click(findTestObject('Object Repository/Update_Info_User/Page_Think Pro - Trang ch/button_user_name'))

WebUI.setText(findTestObject('Update_Info_User/Page_Thng tin ti khon/input_H_user_fullname'), '1234')

WebUI.setText(findTestObject('Update_Info_User/Page_Thng tin ti khon/input_S_phone'), '0356085145')

WebUI.click(findTestObject('Update_Info_User/Page_Thng tin ti khon/select_-- city'))

WebUI.selectOptionByValue(findTestObject('Update_Info_User/Page_Thng tin ti khon/select_-- city'), 'Thành phố Hà Nội', 
    true)

WebUI.click(findTestObject('Update_Info_User/Page_Thng tin ti khon/select_-- district'))

WebUI.selectOptionByValue(findTestObject('Update_Info_User/Page_Thng tin ti khon/select_-- district'), 'Huyện Đan Phượng', 
    true)

WebUI.click(findTestObject('Update_Info_User/Page_Thng tin ti khon/select_-- ward'))

WebUI.selectOptionByValue(findTestObject('Update_Info_User/Page_Thng tin ti khon/select_-- ward'), 'Xã Liên Trung', 
    false)

WebUI.setText(findTestObject('Update_Info_User/Page_Thng tin ti khon/textarea_1_detail_location'), 'Số 6, đường Trạm xá')

WebUI.click(findTestObject('Update_Info_User/Page_Thng tin ti khon/button_update_info'))

WebUI.waitForPageLoad(3)

WebUI.verifyElementText(findTestObject('Update_Info_User/Page_Thng tin ti khon/div_notification_user_info'), 'Cập nhật thông tin thành công')


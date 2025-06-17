package user_action_product

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class action {
	@Keyword
	def addProductToCard() {
		WebUI.waitForPageLoad(20)

		WebUI.scrollToElement(findTestObject('User_Manager_Cart/Page_Think Pro_Home/a_view_product_detail'), 20)

		WebUI.click(findTestObject('Object Repository/User_Manager_Cart/Page_Think Pro_Home/a_view_product_detail'))

		WebUI.click(findTestObject('Object Repository/User_Manager_Cart/Page_product_detail/button_add_product_to_cart'))

		WebUI.waitForElementVisible(findTestObject('User_Manager_Cart/Page_product_detail/div_notification_when_add_product_to_cart'),
				10)

		WebUI.click(findTestObject('Object Repository/User_Manager_Cart/Page_product_detail/span_view_cart_btn'))
	}
}

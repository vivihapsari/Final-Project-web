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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('Object Repository/test TF bank 2/Page_Home Page - BankSystem/a_Money transfers'))

WebUI.click(findTestObject('Object Repository/test TF bank 2/Page_Home Page - BankSystem/a_New Transfer'))

WebUI.click(findTestObject('Object Repository/test TF bank 2/Page_Payment types - BankSystem/a_Create new payment'))

WebUI.selectOptionByValue(findTestObject('Object Repository/test TF bank 2/Page_Create internal money transfer - BankSystem/select_Select source account...            _56f368'), 
    '6995694b-a4ce-4d79-b35a-2da68be60378', false)

WebUI.setText(findTestObject('Object Repository/test TF bank 2/Page_Create internal money transfer - BankSystem/input_Destination account_DestinationBankAc_aefaf9'), 
    'ABahas')

WebUI.doubleClick(findTestObject('Object Repository/test TF bank 2/Page_Create internal money transfer - BankSystem/input_Destination account_DestinationBankAc_aefaf9'))

WebUI.setText(findTestObject('Object Repository/test TF bank 2/Page_Create internal money transfer - BankSystem/input_Destination account_DestinationBankAc_aefaf9'), 
    'ABCL76811692')

WebUI.setText(findTestObject('Object Repository/test TF bank 2/Page_Create internal money transfer - BankSystem/input__Amount'), 
    '100')

WebUI.setText(findTestObject('Object Repository/test TF bank 2/Page_Create internal money transfer - BankSystem/input_(optional)_Description'), 
    'test')

WebUI.click(findTestObject('Object Repository/test TF bank 2/Page_Create internal money transfer - BankSystem/button_Pay'))

WebUI.closeBrowser()


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

WebUI.navigateToUrl('https://proyecto-libre-pokemon.netlify.app/inicio')

WebUI.click(findTestObject('Object Repository/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/a_Buscar'))

WebUI.setText(findTestObject('Object Repository/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/input_Searching_searchText'), 
    'raichu')

WebUI.click(findTestObject('Object Repository/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/h5_raichu'))

WebUI.click(findTestObject('Object Repository/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/img_raichu_card-img'))

WebUI.click(findTestObject('Object Repository/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/b_Habilidades'))

WebUI.click(findTestObject('Object Repository/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/li_static'))

WebUI.click(findTestObject('Object Repository/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/li_lightning-rod'))

WebUI.setText(findTestObject('Object Repository/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/input_Searching_searchText'), 
    '')

WebUI.click(findTestObject('Object Repository/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/button_Search'))

WebUI.setText(findTestObject('Object Repository/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/input_Searching_searchText'), 
    'pikachu')

WebUI.click(findTestObject('Object Repository/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/img_pikachu_card-img'))

WebUI.click(findTestObject('Object Repository/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/h5_pikachu'))

WebUI.click(findTestObject('Object Repository/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/li_static'))

WebUI.click(findTestObject('Object Repository/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/Page_Proyecto 1/li_lightning-rod'))


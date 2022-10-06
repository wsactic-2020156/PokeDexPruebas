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

WebUI.navigateToUrl('https://bejewelled-seahorse-1ebb1a.netlify.app/')

WebUI.switchToWindowTitle('React App')

WebUI.click(findTestObject('Object Repository/Page_React App/h1_Pokemons'))

WebUI.click(findTestObject('Object Repository/Page_React App/div_1bulbasaur'))

WebUI.click(findTestObject('Object Repository/Page_React App/h2_bulbasaur'))

WebUI.click(findTestObject('Object Repository/Page_React App/img_bulbasaur_img'))

WebUI.click(findTestObject('Object Repository/Page_React App/div_overgrow'))

WebUI.click(findTestObject('Object Repository/Page_React App/h2_chlorophyll'))

WebUI.click(findTestObject('Object Repository/Page_React App/h3_hp  45'))

WebUI.click(findTestObject('Object Repository/Page_React App/h3_attack  49'))

WebUI.click(findTestObject('Object Repository/Page_React App/h3_defense  49'))

WebUI.click(findTestObject('Object Repository/Page_React App/h3_special-attack  65'))

WebUI.click(findTestObject('Object Repository/Page_React App/h3_special-defense  65'))

WebUI.click(findTestObject('Object Repository/Page_React App/h3_speed  45'))

WebUI.click(findTestObject('Object Repository/Page_React App/a_X'))

WebUI.click(findTestObject('Object Repository/Page_React App/div_14kakuna'))

WebUI.click(findTestObject('Object Repository/Page_React App/h2_kakuna'))

WebUI.click(findTestObject('Object Repository/Page_React App/img_kakuna_img'))

WebUI.click(findTestObject('Object Repository/Page_React App/h2_shed-skin'))

WebUI.click(findTestObject('Object Repository/Page_React App/h3_hp  45'))

WebUI.click(findTestObject('Object Repository/Page_React App/h3_attack  25'))

WebUI.click(findTestObject('Object Repository/Page_React App/h3_defense  50'))

WebUI.click(findTestObject('Object Repository/Page_React App/h3_special-attack  25'))

WebUI.click(findTestObject('Object Repository/Page_React App/h3_special-defense  25'))

WebUI.click(findTestObject('Object Repository/Page_React App/h3_speed  35'))

WebUI.click(findTestObject('Object Repository/Page_React App/a_X'))

WebUI.closeBrowser()


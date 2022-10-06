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

WebUI.navigateToUrl('https://pokemon-app-search.netlify.app/')

WebUI.click(findTestObject('Object Repository/Page_PokeApp/a_Buscar'))

WebUI.setText(findTestObject('Object Repository/Page_PokeApp/input_Busca a tu Pokemon_search-bar'), 'charmander')

WebUI.sendKeys(findTestObject('Object Repository/Page_PokeApp/input_Busca a tu Pokemon_search-bar'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/p_blaze'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/p_solar-power'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/div_fire'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/p_fire'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/img_charmander_card-img'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/h2_charmander'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/div_charmander'))

WebUI.setText(findTestObject('Object Repository/Page_PokeApp/input_Busca a tu Pokemon_search-bar'), 'pikachu')

WebUI.sendKeys(findTestObject('Object Repository/Page_PokeApp/input_Busca a tu Pokemon_search-bar'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/p_static'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/p_lightning-rod'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/p_electric'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/img_pikachu_card-img'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/h2_pikachu'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/div_pikachu'))

WebUI.setText(findTestObject('Object Repository/Page_PokeApp/input_Busca a tu Pokemon_search-bar'), 'pokety')

WebUI.sendKeys(findTestObject('Object Repository/Page_PokeApp/input_Busca a tu Pokemon_search-bar'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/h3_El pokemon que has buscado no existe c'))

WebUI.closeBrowser()


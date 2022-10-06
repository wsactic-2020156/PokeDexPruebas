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

WebUI.navigateToUrl('https://bejewelled-concha-1a9a3e.netlify.app/')

WebUI.setText(findTestObject('Object Repository/Page_PokeApi/input_PokeApp_searchPokemon'), 'pikachu')

WebUI.sendKeys(findTestObject('Object Repository/Page_PokeApi/input_PokeApp_searchPokemon'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_PokeApi/img_PokeApp_card__img'))

WebUI.click(findTestObject('Object Repository/Page_PokeApi/h1_25'))

WebUI.click(findTestObject('Object Repository/Page_PokeApi/h1_pikachu'))

WebUI.click(findTestObject('Object Repository/Page_PokeApi/h2_Habilidadesstaticlightning-rod'))

WebUI.click(findTestObject('Object Repository/Page_PokeApi/p_static'))

WebUI.click(findTestObject('Object Repository/Page_PokeApi/p_lightning-rod'))

WebUI.setText(findTestObject('Object Repository/Page_PokeApi/input_PokeApp_searchPokemon'), 'charizard')

WebUI.sendKeys(findTestObject('Object Repository/Page_PokeApi/input_PokeApp_searchPokemon'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_PokeApi/div_6  charizardHabilidadesblazesolar-power'))

WebUI.click(findTestObject('Object Repository/Page_PokeApi/h1_6'))

WebUI.click(findTestObject('Object Repository/Page_PokeApi/img_PokeApp_card__img_1'))

WebUI.click(findTestObject('Object Repository/Page_PokeApi/h1_charizard'))

WebUI.click(findTestObject('Object Repository/Page_PokeApi/h2_Habilidadesblazesolar-power'))

WebUI.click(findTestObject('Object Repository/Page_PokeApi/p_blaze'))

WebUI.click(findTestObject('Object Repository/Page_PokeApi/p_solar-power'))

WebUI.setText(findTestObject('Object Repository/Page_PokeApi/input_PokeApp_searchPokemon'), '')

WebUI.click(findTestObject('Object Repository/Page_PokeApi/form'))

WebUI.closeBrowser()


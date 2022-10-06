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

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/a_Buscalo'))

WebUI.setText(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/input_Busca a tu Pokemon_search-bar'), 'charmander')

WebUI.sendKeys(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/input_Busca a tu Pokemon_search-bar'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/h4_Peso'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/p_85'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/h4_Habilidades'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/div_blazesolar-power'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/p_solar-power'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/h4_Tipos'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/div_fire'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/p_fire'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/h4_Juegos en los que aparece'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/p_red'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/p_blue'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/p_yellow'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/p_gold'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/p_silver'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/p_crystal'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/p_ruby'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/p_sapphire'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/p_emerald'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/p_firered'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/p_leafgreen'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/p_diamond'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/p_pearl'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/p_platinum'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/p_heartgold'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/p_soulsilver'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/p_black'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/p_white'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/p_black-2'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/p_white-2'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/img_charmander_card-img'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/h2_charmander'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/div_charmander'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/div_Peso85Habilidadesblazesolar-powerTiposf_d07889'))

WebUI.setText(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/input_Busca a tu Pokemon_search-bar'), 'charizard')

WebUI.sendKeys(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/input_Busca a tu Pokemon_search-bar'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/div_charizard'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/img_charizard_card-img'))

WebUI.setText(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/input_Busca a tu Pokemon_search-bar'), 'charmeleon')

WebUI.sendKeys(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/input_Busca a tu Pokemon_search-bar'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/img_charmeleon_card-img'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/h2_charmeleon'))

WebUI.click(findTestObject('Object Repository/Page_PokeApp/Page_PokeApp/div_charmeleon'))

WebUI.closeBrowser()


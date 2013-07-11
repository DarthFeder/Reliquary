package xreliquary.common;

import xreliquary.lib.Localizations;
import xreliquary.util.LocalizationUtil;

import cpw.mods.fml.common.registry.LanguageRegistry;



public class LocalizationHandler {

    public static void loadLanguagesIntoRegistry() {
        
        // For every file specified in the Localization library class, load them into the Language Registry
        for (String localizationFile : Localizations.localeFiles) {
           
            LanguageRegistry.instance().loadLocalization(localizationFile, LocalizationUtil.getLocaleFromFileName(localizationFile), LocalizationUtil.isXMLLanguageFile(localizationFile));
        }
        
    }   
}

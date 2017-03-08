package br.com.testes.factory.configuration;

import br.com.testes.factory.SpellChecker;
import br.com.testes.factory.TextEditor;
import br.com.testes.factory.interfaces.ISpellChecker;
import br.com.testes.factory.interfaces.ITextEditor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Autowired
    private ISpellChecker spellChecker;

    @Bean
    public ITextEditor textEditor() {
        return new TextEditor(spellChecker);
    }

    @Bean
    public ISpellChecker spellChecker() {
        return new SpellChecker();
    }
}
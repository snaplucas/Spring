package br.com.testes.factory;

import br.com.testes.factory.interfaces.ISpellChecker;
import br.com.testes.factory.interfaces.ITextEditor;

public class TextEditor implements ITextEditor {

    private ISpellChecker spellChecker;

    public TextEditor(ISpellChecker spellChecker) {
        System.out.println("Inside TextEditor constructor.");
        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
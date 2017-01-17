package br.com.testes.factory;

import br.com.testes.factory.interfaces.ISpellChecker;
import br.com.testes.factory.interfaces.ITextEditor;

class TextEditor implements ITextEditor {
    private ISpellChecker spellChecker;

    TextEditor(ISpellChecker spellChecker) {
        System.out.println("Inside TextEditor constructor.");
        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
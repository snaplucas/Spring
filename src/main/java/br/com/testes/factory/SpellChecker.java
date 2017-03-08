package br.com.testes.factory;

import br.com.testes.factory.interfaces.ISpellChecker;

public class SpellChecker implements ISpellChecker {

    public SpellChecker() {
        System.out.println("Inside SpellChecker constructor.");
    }

    public void checkSpelling() {
        System.out.println("Inside checkSpelling.");
    }

}
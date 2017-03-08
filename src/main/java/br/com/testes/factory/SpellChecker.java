package br.com.testes.factory;

import br.com.testes.factory.interfaces.ISpellChecker;

class SpellChecker implements ISpellChecker {

    SpellChecker() {
        System.out.println("Inside SpellChecker constructor.");
    }

    public void checkSpelling() {
        System.out.println("Inside checkSpelling.");
    }

}
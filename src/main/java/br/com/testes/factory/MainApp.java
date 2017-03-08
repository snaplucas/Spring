package br.com.testes.factory;

import br.com.testes.factory.configuration.AppConfig;
import br.com.testes.factory.interfaces.ITextEditor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        ITextEditor te = ctx.getBean(ITextEditor.class);

        te.spellCheck();
    }
}
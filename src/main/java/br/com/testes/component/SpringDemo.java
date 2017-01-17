package br.com.testes.component;

import br.com.testes.component.interfaces.IEmployeeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDemo {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        IEmployeeService service = ctx.getBean(IEmployeeService.class);

        System.out.println(service.getEmployee().getEmpMsg());
        ctx.close();
    }
}

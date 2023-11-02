package massimiliano.pizzealtavolo;

import massimiliano.pizzealtavolo.classi.Ordine;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(PizzealtavoloApplication.class);
        System.out.println(ctx.getBean("menu"));
        Ordine ord1 = (Ordine) ctx.getBean("getOrdine");
        System.out.println(ord1);
        System.out.println(ord1.getConto());
    }
}

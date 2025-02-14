package koschei.config;

import koschei.models.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {
  @Bean
  public static Island2 island(Wood3 wood) {
    return new Island2(wood);
  }
  @Bean
  public static Wood3 wood(Rabbit4 rabbit) {
    return new Wood3(rabbit);
  }
  @Bean
  public static Rabbit4 rabbit4(Duck5 duck) {
    return new Rabbit4(duck);
  }
  @Bean
  public static Duck5 duck(Egg6 egg) {
    return new Duck5(egg);

  }
  @Bean
  public static Egg6 egg() {
    return new Egg6();
  }
  @Bean
  public static Needle7 needle() {
    return new Needle7();
  }
  @Bean
  public static Death8 deth(Needle7 needle) {

    return new Death8(needle);
  }
  @Bean
  public static Ocean1 ocean(Island2 island) {

    return new Ocean1(island);
  }
}
package ru.khtu.lease;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@SpringBootApplication
public class Boot {

    @GetMapping("/")
    public String index() {
//        authenticationProc();
        return new String("index");
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    public static void main(String[] args) {
        mainProc(
                SpringApplication.run(Boot.class) );
    }

    private void authenticationProc() {
        /*Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User principal = (User)auth.getPrincipal();
        String username = principal.getUsername();
        Object credentials = auth.getCredentials();
        Collection<? extends GrantedAuthority> authorities = auth.getAuthorities();
        Object details = auth.getDetails();
        System.out.println();*/
    }

    private static void mainProc(ConfigurableApplicationContext context) {
        /*ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
//        WorkObject.setBeanFactory(beanFactory);
        String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
//        Map<String, Object> beans = new HashMap<>();
        List beanList = new ArrayList<>();
        for (String beanDefinitionName : beanDefinitionNames) {
            if (beanFactory.getBean(beanDefinitionName).getClass().getCanonicalName() != null) {
                if ( beanFactory.getBean(beanDefinitionName).getClass().getCanonicalName().startsWith("ru.khtu") ) {
//                    beans.put(beanFactory.getBean(beanDefinitionName).getClass().getCanonicalName(), beanDefinitionName);
                    beanList.add(beanFactory.getBean(beanDefinitionName).getClass().getCanonicalName());
                }
            }
        }
        String[] beans = new String[beanList.size()];
        beanList.toArray(beans);
        Arrays.sort(beans);
        System.out.println();*/
    }

}

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;


import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@Slf4j
@PropertySource("classpath:commonApplication.properties")
@ExtendWith(SpringExtension.class)
public class RumpUpTester {

    @Value("${testValue}")
    private String initOk;

    private Matematicas mates;
    private EntradaUsuario entrada;


    //In Junit 5 if needed this works and @Before doesn't
    @BeforeEach
    private void initElems() {
        if (mates == null) {
            mates = new Matematicas();
        }
        if (entrada == null) {
            entrada = new EntradaUsuario();
        }
    }

    @Test
    public void propertiesLoadTest() {
        assertTrue(initOk != null && initOk.equalsIgnoreCase("testValue"));
    }

    @Test
    public void inputsimpulationTest() {
        String input ="123";
        assertTrue( entrada.usuarioSimulado(input) != null);
    }
    @Test
    public void matematicasSumaTest() {
  //      assertTrue(entrada.usuarioReal(        entrada.usuarioSimulado(entrada.getAsListParams(Arrays.asList("1","2" , "3")))) == 6);
    }
}
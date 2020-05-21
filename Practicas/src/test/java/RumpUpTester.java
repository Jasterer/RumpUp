import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;


import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@PropertySource("application.properties")
@ExtendWith(SpringExtension.class)
public class RumpUpTester {

    private static final Logger logger = LoggerFactory.getLogger(RumpUpTester.class);

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
        logger.info("Empezando la prueba");
        assertTrue(initOk != null && initOk.equalsIgnoreCase("testValue"));
        logger.info("Terminando la prueba");
    }

    @Test
    public void inputsimpulationTest() {
        String input ="123";
        assertTrue( entrada.usuarioSimulado(input) != null);
    }
    @Test
    public void matematicasSumaTest() {
        assertTrue(mates.esPar(34));
        assertTrue(mates.esPar(0));
  //      assertTrue(entrada.usuarioReal(        entrada.usuarioSimulado(entrada.getAsListParams(Arrays.asList("1","2" , "3")))) == 6);
    }
}
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.function.Executable;

public class ArrayHandlerTest {

    @Test
    public void testArrayIndexOutOfBoundsExceptionIsThrown() {
        ArrayHandler handler = new ArrayHandler();
        int[] array = {1, 2, 3};

        Executable executable = new Executable() {
            @Override
            public void execute() {
                handler.getElementAtIndex(array, 5);
            }
        };

        assertThrows(ArrayIndexOutOfBoundsException.class, executable);
    }
}
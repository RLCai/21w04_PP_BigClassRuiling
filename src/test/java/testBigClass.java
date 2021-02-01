import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class testBigClass {

    @Test
    void testBigClassConstructor(){
        BigClass testObject1 = new BigClass(0, "hej");
        BigClass testObject2 = new BigClass(0);
        BigClass testObject3 = new BigClass("hej");
        BigClass testObject4 = new BigClass();
        Assertions.assertEquals(0,testObject1.getNumber());
        Assertions.assertEquals(0,testObject2.getNumber());
        Assertions.assertEquals(0,testObject4.getNumber());
        Assertions.assertNull(null,testObject1.getText());
        Assertions.assertNull(null,testObject3.getText());
        Assertions.assertNull(null,testObject4.getText());

    }

    @Test
    void testTextGetAndSet(){
        BigClass testObject = new BigClass(); //ska inte skriva in något här inom prentes för att veta att det är just get/set som fixar att sätta värdet
        String expected = "Maria";
        testObject.setText("Maria");  // testa att skriva något annat i stringen
        Assertions.assertEquals(expected, testObject.getText());
    }

    @Test
    void testNumberGetAndSet(){
        BigClass testObject1 = new BigClass();
        BigClass testObject2 = new BigClass();
        int expected1 = 5;
        int expected2 = 5;
        testObject1.setNumber(5);
        testObject2.setNumber(-5);
        Assertions.assertEquals(expected1, testObject1.getNumber());
        Assertions.assertEquals(expected2, testObject2.getNumber());
    }

    @Test
    void testToUpperCase(){
        BigClass testObject = new BigClass();
        testObject.setText("Maria");
        String actual = testObject.uppercase();
        String expected = "MARIA";
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void testToNull(TestInfo testInfo){
        BigClass testObject = new BigClass();
        String actual = testObject.changToNull();
        Assertions.assertNull(actual);
        System.out.println("Test " + testInfo.getDisplayName() + " concluded");
    }



    @Test
    void testAdd(){
        BigClass testObject1 = new BigClass(5);
        BigClass testObject2 = new BigClass(5);
        int expected1 = 8;
        int expected2 = 8;
        int actual1 = testObject1.add(3);
        int actual2 = testObject2.add(-3);
        Assertions.assertEquals(expected1,actual1);
        Assertions.assertEquals(expected2,actual2);
    }

    @Test
    void testToString(){
        BigClass testObject = new BigClass(0, null);
        Assertions.assertEquals("BigClass{text='null', number=0}", testObject.toString());
    }



}

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class TestHelloWorld {
    private helloworld hello;
    @Before
    public void setUp(){
        hello = new helloworld();
    }

    @Test
    public void test1(){
        String str1 = hello.printNumber(1);
        System.out.println(str1);
        assert(str1.equals("One"));
    }

    @Test
    public void test2(){
        String str2 = hello.printNumber(2);
        System.out.println(str2);
        assert(str2.equals("Two"));
    }

    @Test
    public void test3(){
        String str3 = hello.printNumber(3);
        System.out.println(str3);
        assert(str3.equals("Other"));
    }

    @After
    public void tearDown(){
        hello = null;
    }
}

/**
 * Created by jayme on 7/20/2017.
 */
public class TestProgramConfiguration {
    public static void main(String[] args) {

        ProgramConfiguration instance = ProgramConfiguration.getInstance(); //when this is commented out, program will not run

        instance.setConnectionLimit(10);//using the set/get method to test that this can only be instantiated through the getInstance method
        instance.setPortNumber(5);
        instance.setTimeout(8);
        instance.setURL("www.w3schools.com/howto/");

        System.out.println(instance.getConnectionLimit());
        System.out.println(instance.getTimeout());
        System.out.println(instance.getPortNumber());
        System.out.println(instance.getURL());
    }

}

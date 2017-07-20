/**
 * Created by jayme on 7/20/2017.
 */
public class ProgramConfiguration {
    public int connectionLimit;
    public int portNumber;
    public String URL;
    public int timeout;
    private static ProgramConfiguration instance = null;//Singleton has to be private because only one instance of a class is created.

    private ProgramConfiguration() {
    }

    public int getConnectionLimit() {
        return connectionLimit;
    }

    public void setConnectionLimit(int connectionLimit) {
        this.connectionLimit = connectionLimit;
    }

    public int getPortNumber() {
        return portNumber;
    }

    public void setPortNumber(int portNumber) {
        this.portNumber = portNumber;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public static ProgramConfiguration getInstance() {
        if (instance == null) {
            instance = new ProgramConfiguration();

        }
        return instance;
    }
}

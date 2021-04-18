


import java.util.List;
import java.util.Map;
import java.util.function.Consumer;


public class MailService <T> {
    private Map<String, List<T>> mailBox;

    public String printMessage(MailMessage mailMessage){
        return mailMessage.toString();
    }

    public String printSalary(Salary salary){
        return salary.toString();
    }

    public Map<String, List<T>> getMailBox() {
        return mailBox;
    }

    public void setMailBox(Map<String, List<T>> mailBox) {
        this.mailBox = mailBox;
    }

    public MailService() {
    }

    public MailService(Map<String, List<T>> mailBox) {
        this.mailBox = mailBox;
    }
}

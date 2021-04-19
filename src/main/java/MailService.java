


import java.util.*;
import java.util.function.Consumer;


public class MailService <T> implements Consumer<MailInterface<T>> {

    private Map<String, List<T>> mailBox = new HashMap<String, List<T>>();

    public Map<String, List<T>> getMailBox() {
        return mailBox;
    }

    @Override
    public void accept(MailInterface<T> tMailInterface) {
        mailBox.put(tMailInterface.getTo(), Arrays.asList(tMailInterface.getContent()));
    }
}

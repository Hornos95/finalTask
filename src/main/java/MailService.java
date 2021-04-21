


import java.util.*;
import java.util.function.Consumer;

public class MailService <T> implements Consumer<MailInterface<T>> {

    private Map<String, List<T>> mailBox= new HashMap<String, List<T>>(){
        @Override
        public List<T> get(Object key) {
            return super.getOrDefault(key, new ArrayList<>());
        }
    };

    public Map<String, List<T>> getMailBox() {
        return mailBox;
    }

    @Override
    public void accept(MailInterface<T> tMailInterface) {
        List<T> list = new ArrayList<>();
        if(mailBox.containsKey(tMailInterface.getTo())){
            list = mailBox.get(tMailInterface.getTo());
        }
       list.add(tMailInterface.getContent());
        mailBox.put(tMailInterface.getTo(), list);
    }
}

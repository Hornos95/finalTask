
public class MailMessage implements MailInterface<String>{
    private String from;
    private String to;
    private String content;

    public MailMessage()  {
    }

    public MailMessage(String from, String to, String content) {
        this.from = from;
        this.to = to;
        this.content = content;
    }

    @Override
    public String getTo() {
        return to;
    }

    @Override
    public String getFrom() {
        return from;
    }

    public String getContent() {
        return content;
    }


}

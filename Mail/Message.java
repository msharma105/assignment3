import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

public class Message {
	String from, to, content, attachment_name;
	Date date;
	String seq_no;

	public Message(String from, String to, String content, String attachment_name) {
		super();
		this.from = from;
		this.to = to;
		this.content = content;
		this.attachment_name = attachment_name;
		this.date = new Date();
		this.seq_no = UUID.randomUUID().toString();
	}

	public void print() {
		System.out.println(this);
	}

	public void edit(HashMap<String, String> map) {
		Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<String, String> entry = itr.next();
			this.update_value(entry.getKey().toString(), entry.getValue().toString());
		}
	}

	public void update_value(String key, String value) {
		switch (key) {
		case "from":
			this.from = value;
			break;
		case "to":
			this.to = value;
			break;
		case "content":
			this.content = value;
			break;
		case "attachment_name":
			this.attachment_name = value;
			break;
		}
	}

	@Override
	public String toString() {
		return "Message [from=" + from + ", to=" + to + ", content=" + content + ", attachment_name=" + attachment_name
				+ ", date=" + date + ", seq_no=" + seq_no + "]";
	}

	// function to test functionality
	public static void main(String[] args) {
		Message message = new Message("from", "to", "content", "attachment_name");
		System.out.println(message);
		message.print();
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("from", "mote");
		message.edit(map);
		message.print();
	}
}

import java.util.ArrayList;
import java.util.List;

public class Thread {

	String subject;
	List<Message> messageList;

	public Thread(String subject, List<Message> messageList) {
		this.subject = subject;
		this.messageList = messageList;
	}

	public void addMessage(Message message) {
		this.messageList.add(message);
	}

	@Override
	public String toString() {
		return "Thread [subject=" + subject + ", messageList=" + messageList + "]";
	}

	public void deleteMessage(Message message) {
		this.messageList.remove(message);
	}

	public Message findMessage(String seq_no) throws CustomException {
		Message messageExp = null;
		for (int i = 0; i < messageList.size(); i++) {
			if (seq_no.equalsIgnoreCase(messageList.get(i).seq_no)) {
				messageExp = messageList.get(i);
			}
		}
		if (messageExp == null) {
			throw new CustomException("message not found");
		}
		return messageExp;
	}

	public void print() {
		System.out.println(this);
	}

	// function to test functionality 
	public static void main(String[] args) throws CustomException {
		Message message = new Message("from", "to", "content", "attachment_name");
		Message messageNew = new Message("newfrom", "newto", "newcontent", "newattachment_name");
		List<Message> messageList = new ArrayList<Message>();
		messageList.add(message);
		messageList.add(messageNew);
		Thread thread = new Thread("subject", messageList);
		Message resultFind = thread.findMessage(messageNew.seq_no);
		System.out.println(resultFind);
	}

}

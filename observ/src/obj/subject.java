package obj;

public interface subject {
	void setObserver(buddy bud);
	void removeObserver(buddy bud);
	void updateObserver(String ment);
	void donationObserver();
	void donationObserver(buddy bud);
}

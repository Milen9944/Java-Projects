package Cards;



public class Cards {
	private String face;
	private Suit suit;
	
	public Cards(String face, Suit suit) {
		this.face = face;
		this.suit = suit;
	}
	public String getFace() {
		return face;
	}
	public Suit getSuit() {
		return suit;
	}
	@Override
	public String toString() {
		String card = "(" + this.face + " " + this.suit +")";
		return card;
	}

	enum Suit{
		CLUB, DIAMOND, HEART, SPADE;
	}

}

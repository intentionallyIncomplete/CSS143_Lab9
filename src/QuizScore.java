/**
 * Class Description:
 * @author Ian Bryan
 * @version December 2nd, 2018.
 * 
 * 
 */
public class QuizScore {

	/**
	 * Class level data members.
	 * */
	private int score;
	
	/**
	 * @param score
	 */
	public QuizScore(int score) {
		this.setScore(score);
	}
	
	/**
	 * @return
	 */
	public int getScore() {
		return this.score;
	}
	
	/**
	 * @param score
	 */
	public void setScore(int score) {	this.score = score;}
}

/**
 * Class Description:
 * @author Ian Bryan
 * @version December 2nd, 2018.
 * 
 * A class that constructs a value for a quiz score.
 * Returns score and makes clones.
 */
public class QuizScore implements Cloneable {

	/**	Class level data members.	*/
	private int score;
	
	/**
	 * @param newScore - An Object of type QuizScore.
	 * 
	 * A public copy constructor used when making a clone of a QuizScore object.
	 */
	public QuizScore(QuizScore newScore) {
		this.setScore(newScore.getScore());
	}
	
	/**
	 * 
	 * */
	@Override
	public QuizScore clone(){
		return new QuizScore(this);
	}
	
	/**	@param score - An integer value handed in to the class for evaluation.	*/
	public QuizScore(int score) {	this.setScore(score);	}
	
	/**	@return - Returns the score as an integer for the Quiz.	*/
	public int getScore() {	return this.score;	}
	
	/** @param score - An integer which represents the value of a quiz score.	*/
	public void setScore(int score) {	this.score = score;}
}

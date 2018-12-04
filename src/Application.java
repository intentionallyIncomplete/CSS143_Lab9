import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * @author Ian Bryan
 * @version Dec 3rd 2018
 */
public class Application extends JFrame implements ActionListener{
	JButton myButton = new JButton( "Hello World" );
	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(rootPane, e.paramString(), e.getClass().toString(), JOptionPane.PLAIN_MESSAGE);
	}

	@SuppressWarnings("javadoc")
	public Application() {
		super("Window");

		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//add the button to the display
		this.add(myButton);

		myButton.addActionListener( this );
	}

	//A one line main
	public static void main(String[] args) {	JFrame app = new Application();	}
}
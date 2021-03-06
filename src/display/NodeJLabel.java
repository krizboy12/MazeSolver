package display;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;

public class NodeJLabel extends JLabel implements MouseListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = -654044679956644191L;

	public NodeJLabel() {
		addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		if (!GUI.canChooseNewEnds())
			if (e.getModifiers() == MouseEvent.BUTTON1_MASK)
				changeColor();
	}

	@Override
	public void mouseExited(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {
		if (GUI.canChooseNewEnds())
			this.setBackground(Color.MAGENTA);
		else
			changeColor();
	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	private void changeColor() {
		if (this.getBackground() == Color.BLACK)
			this.setBackground(Color.WHITE);
		else if (this.getBackground() != Color.DARK_GRAY && this.getBackground() != Color.MAGENTA)
			this.setBackground(Color.BLACK);
	}
}

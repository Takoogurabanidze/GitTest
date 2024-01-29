import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.util.*;

import javax.swing.*;
import javax.swing.*;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class prob1 extends GraphicsProgram {

	private JTextField valueField;
	private GRect scroll;
	private GObject elem;
	private ArrayList<String> list;
	private GCompound listVisual;
	private double prevY;

	private static final String ADD = "Add";
	private static final String REMOVE = "Remove";
	private static final double DIST = 20;

	public void init() {
		add(new JLabel("Value:"), SOUTH);
		valueField = new JTextField(10);
		add(valueField, SOUTH);
		add(new JButton(ADD), SOUTH);
		add(new JButton(REMOVE), SOUTH);
		list = new ArrayList<>();
		listVisual = new GCompound();

		createScroll();

		addActionListeners();
		addMouseListeners();
	}

	private void createScroll() {
		scroll = new GRect(20, 20);
		scroll.setFilled(true);
		scroll.setColor(Color.GRAY);
	}

	public void actionPerformed(ActionEvent e) {
		String value = valueField.getText();
		if (value.equals(""))
			return;

		if (e.getActionCommand().equals(ADD)) {
			list.add(value);
		} else if (e.getActionCommand().equals(REMOVE)) {
			list.remove(value);
		}

		updateListVisual();
	}

	// uses GCompound, see problem68 for solution with list of GObjects instead
	private void updateListVisual() {
		remove(listVisual);
		listVisual = new GCompound();
		for (int i = 0; i < list.size(); i++) {
			listVisual.add(new GLabel(list.get(i)), DIST, (i + 1) * DIST);
		}
		add(listVisual);

		updateScroll();
	}

	private void updateScroll() {
		if (listVisual.getHeight() <= getHeight()) {
			remove(scroll);
		} else {
			double coef = getHeight() * getHeight() / listVisual.getHeight();
			scroll.scale(1, coef / scroll.getHeight());
			double x = getWidth() - scroll.getWidth();
			double y = 0;
			add(scroll, x, y);
		}
	}

	public void mousePressed(MouseEvent e) {
		elem = getElementAt(e.getX(), e.getY());
		if (elem != scroll) {
			return;
		}
		prevY = e.getY();
	}

	public void mouseDragged(MouseEvent e) {
		if (elem != scroll) {
			return;
		}
		double step = e.getY() - prevY;
		double newY = scroll.getY() + step;
		if (newY >= 0 && newY + scroll.getHeight() <= getHeight()) {
			scroll.move(0, step);
			listVisual.move(0, -step * ((listVisual.getHeight() + 2 * DIST) / getHeight()));
			prevY = e.getY();
		}
	}
}
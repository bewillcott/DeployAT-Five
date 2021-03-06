
/**
 * Polytechnic West Project example
 */
package core;

import java.awt.*;
import javax.swing.*;

public class ScorePanel extends JPanel
{
    private JLabel lblScoreText;

    private JLabel lblScore;

    private JLabel lblLevelText;

    private JLabel lblLevel;

    private JButton btnAction;

    /**
     * Constructor
     * <p>
     */
    public ScorePanel()
    {

        super();
        super.setPreferredSize(new Dimension(200, 20));

        lblScoreText = new JLabel("Score");
        lblScore = new JLabel("0");
        lblLevelText = new JLabel("Level");
        lblLevel = new JLabel("1");

        add(lblScoreText);
        add(lblScore);
        add(lblLevelText);
        add(lblLevel);
    }

    /**
     * Set score value
     *
     * @param value new score
     */
    public void setScore(int value)
    {
        lblScore.setText(Integer.toString(value));
    }

    /**
     * Set game level
     *
     * @param value new level
     */
    public void setLevel(int value)
    {
        lblLevel.setText(Integer.toString(value));
    }

    /**
     * Button to start stop some event
     *
     * @param value new button label
     *
     * @deprecated
     */
    public void setAction(String value)
    {
        btnAction.setText(value);
    }
}

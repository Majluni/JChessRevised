package MainFrame.ChessFrame.ThreadTimer;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ThreadTimer extends Thread {


    private double mytime = 500;

    private short myTime = 500;

    private JLabel myScreen;

    /**
     * Creates a new instance of ThreadTimer
     */
    public ThreadTimer(double mytime) {
    	setTime(mytime);
    }
    public ThreadTimer(JLabel mynewScreen) {
        myScreen = mynewScreen;

        myScreen.setText(Double.toString(mytime) + " Seconds");

        myScreen.setText(Float.toString(myTime) + " Seconds");

    }

    @Override
    public void run() {

        while (true) {
            myTime -= 0.1;
            try {

                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }


            myScreen.setText(Double.toString(mytime) + " Seconds");
            if (mytime == 0) {

            myScreen.setText(Float.toString(myTime) + " Seconds");
            if (myTime == 0) {


                JOptionPane.showConfirmDialog(null, " Game Over!\n Timeout", "Timeout",
                        JOptionPane.DEFAULT_OPTION);
                stop();
                System.out.println("TimeOut");

                break;
            }
        }

    }
    }
    

    public void setTime(double time) {
    	time = mytime;
    }
    
    public double getTime() {
    	return mytime;
    	
    }


    public void setTime(short time) {
        myTime = time;
    }

}
